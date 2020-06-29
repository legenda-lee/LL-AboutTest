package com.legenda.lee.studytest.aboutMaven;

import com.alibaba.fastjson.JSON;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.util.*;


public class Test1 {


    public static final String FILE_PATH = "E:\\baitiaoqianyi-netease\\repository\\com\\\\netease";
    public static final String respositoryPath = "baitiaoqianyi-netease\\repository";

    //-SNAPSHOT.
    public static void main(String[] args) throws IOException, InterruptedException {

       // release("jar");
       release("pom");

       // snapshots("jar");
       snapshots("pom");
    }

    private static void snapshots(String packagingType) throws IOException, InterruptedException {// packagingType-> pom/jar
        File file = new File(FILE_PATH);

        String snapshotFormat = ".*(-SNAPSHOT." + packagingType + ")$";
        String releaseFormat = ".*(\\.\\d+."+packagingType+")$";
        List<File> files = searchFiles(file, snapshotFormat);
        // if("pom".equals(packagingType)) {
        //     removeInvalidFile(files);
        // }
        for (File file1 : files) {
            String name = file1.getName();
            String artifactId = name.replaceAll("-\\d+\\.\\d+.*[-SNAPSHOT." + packagingType + "]$", "");
            String version = name.replaceAll(artifactId + "-", "").replaceAll("\\." + packagingType, "");
            String groupId = getGroupId(file1, artifactId, version);
            StringBuffer snapshots = new StringBuffer("mvn ");
//            String groupId = GROUPID;
            String path = file1.getAbsolutePath();
            snapshots.append("-s \"D:\\Program Files (x86)\\maven-3.3.9\\conf\\baitiaoqianyi.xml\"  ")
                    .append("deploy:deploy-file  ")
                    .append("-DgroupId=").append(groupId).append(" ")
                    .append("-DartifactId=").append(artifactId).append("  ")
                    .append("-Dversion=").append(version).append("  ")
                    .append("-Dpackaging=" + packagingType + "  ")
                    .append("-Dfile=").append(path).append("  ")
                    .append("-Durl=http://nexus.lianlianpay-inc.com/repository/snapshots/  ")
                    .append("-DrepositoryId=snapshots ");

            if(packagingType.equals("jar")){
                String pomPath = path.replace(".jar",".pom");
                snapshots.append("-DpomFile=").append(pomPath).append("  ");
            }

            System.out.println(snapshots.toString());
            doBat(file1, snapshots);
        }
    }



    static void release(String packagingType) throws IOException, InterruptedException {
        File file = new File(FILE_PATH);
        String releaseFormat = ".*(\\.\\d+."+packagingType+")$";
        List<File> files = searchFiles(file, releaseFormat);
        // if("pom".equals(packagingType)) {
        //     removeInvalidFile(files);
        // }
        //进行 snapshots语句生成
        for (File file1 : files) {
            String name = file1.getName();
            String artifactId = name.replaceAll("-\\d+\\.\\d+.*(."+packagingType+")$", "");
            String version = name.replaceAll(artifactId + "-", "").replaceAll("\\."+ packagingType, "");
            String groupId = getGroupId(file1, artifactId, version);
            StringBuffer snapshots = new StringBuffer("mvn ");
            String path = file1.getAbsolutePath();
            snapshots.append("-s \"D:\\Program Files (x86)\\maven-3.3.9\\conf\\baitiaoqianyi.xml\"  ")
                    .append("deploy:deploy-file  ")
                    .append("-DgroupId=").append(groupId).append(" ")
                    .append("-DartifactId=").append(artifactId).append("  ")
                    .append("-Dversion=").append(version).append("  ")
                    .append("-Dpackaging=" + packagingType + "  ")
                    .append("-Dfile=").append(path).append("  ")
                    .append("-Durl=http://nexus.lianlianpay-inc.com/repository/release/  ")
                    .append("-DrepositoryId=releases ");

            if(packagingType.equals("jar")){
                String pomPath = path.replace(".jar",".pom");
                snapshots.append("-DpomFile=").append(pomPath).append("  ");
            }
            System.out.println(snapshots.toString());
            doBat(file1, snapshots);
        }
    }

    private static void removeInvalidFile(List<File> files) {

        Iterator<File> iterator = files.iterator();
        while (iterator.hasNext()) {
            File file = iterator.next();
            File[] files1 = file.getParentFile().listFiles();
            if (Arrays.asList(files1).stream().filter(x -> x.getName().contains(".jar")).findAny().isPresent()) {
                iterator.remove();
            }
        }
    }

    private static String getGroupId(File file1, String artifactId, String version) {
        String absolutePath = file1.getAbsolutePath();
        String PATHS = absolutePath.substring(absolutePath.indexOf(respositoryPath) + respositoryPath.length() + 1);
        String s = PATHS.replaceAll("\\\\", ".");
        String substring = s.substring(0, s.indexOf(version) - 1);
        return substring.substring(0, substring.indexOf(artifactId) - 1);
    }

    private static void doBat(File file1, StringBuffer snapshots) throws IOException, InterruptedException {
        File file2 = new File("E:\\baitiaoqianyi-script\\" + file1.getName() + ".bat");
        // Thread.sleep(4000L);
        FileUtils.writeLines(file2, Arrays.asList(snapshots.toString()));



        // 危险！！！！！
       // Process exec = Runtime.getRuntime().exec(file2.getAbsolutePath());
       // String s = JSON.toJSONString(exec);
       // System.out.println(s);
    }


    public static List<File> searchFiles(File folder, final String keyword) {
        List<File> result = new ArrayList<File>();
        if (folder.isFile()) {
            result.add(folder);
        }

        File[] subFolders = folder.listFiles(new FileFilter() {
            @Override
            public boolean accept(File file) {
                if (file.isDirectory()) {
                    return true;
                }
                if (file.getName().matches(keyword)) {
                    return true;
                }
                return false;
            }
        });

        if (subFolders != null) {
            for (File file : subFolders) {
                if (file.isFile()) {
                    // 如果是文件则将文件添加到结果列表中
                    result.add(file);
                } else {
                    // 如果是文件夹，则递归调用本方法，然后把所有的文件加到结果列表中
                    result.addAll(searchFiles(file, keyword));
                }
            }
        }

        return result;
    }

}
