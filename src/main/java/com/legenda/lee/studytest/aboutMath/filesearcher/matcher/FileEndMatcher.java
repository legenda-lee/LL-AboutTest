package com.legenda.lee.studytest.aboutMath.filesearcher.matcher;

import java.nio.file.Path;

/**
 * @author: Lee
 * @date: 2019-01-03 22:11
 **/
public class FileEndMatcher extends FileMatcher {
    @Override
    public String getName() {
        return "匹配结尾";
    }

    @Override
    public boolean match(Path file, String searchPattern) {
        return file.toString().endsWith(searchPattern);
    }
}
