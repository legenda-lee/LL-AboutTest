package com.legenda.lee.studytest.aboutMath.filesearcher.matcher;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * @author: Lee
 * @date: 2019-01-03 21:38
 **/
public class FileContentMatcher extends FileMatcher {
    @Override
    public String getName() {
        return "匹配文件内容";
    }

    @Override
    public boolean match(Path file, String searchPattern) {
        try {
            if (!file.toFile().isDirectory()) {
                String content = new String(Files.readAllBytes(file));
                return content.contains(searchPattern);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }
}
