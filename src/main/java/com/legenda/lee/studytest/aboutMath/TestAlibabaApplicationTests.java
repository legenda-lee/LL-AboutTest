package com.legenda.lee.studytest.aboutMath;



import com.legenda.lee.studytest.aboutMath.filesearcher.FileSearcher;
import com.legenda.lee.studytest.aboutMath.filesearcher.TextParser;
import com.legenda.lee.studytest.aboutMath.filesearcher.matcher.Matcher;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;


public class TestAlibabaApplicationTests {

    public void contextLoads() {
    }

    /**
     * 试题一答案
     *
     * @throws IOException
     */
    public static void test_fileSearcher() throws IOException {
        TextParser t = new TextParser();
        Matcher matcher = t.parseMatcher("匹配名称&匹配文件内容 || 匹配结尾");

        FileSearcher searcher = new FileSearcher();
        searcher.setMatcher(matcher);
        searcher.setSearchValue("abc");
        List<Path> result = searcher.search(Paths.get("D:\\Downloads"));

        System.out.println(result);
    }

    /**
     * 试题二答案
     * @throws IOException
     */
    public static void test_timeMerger() throws IOException {
        Period period0 = new Period(1, 4);
        Period period1 = new Period(2, 5);
        Period period2 = new Period(8, 9);

        period0.merge(period1).merge(period2);


        System.out.println(period0.getContainsPeriods());
    }

    public static void main(String[] args) throws IOException {
        test_timeMerger();
    }
}

