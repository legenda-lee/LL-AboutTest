package com.legenda.lee.studytest.aboutMath.filesearcher.matcher;

import java.io.FilenameFilter;
import java.nio.file.Path;

/**
 * @author: Lee
 * @date: 2019-01-03 21:34
 **/
public class FileNameMatcher extends FileMatcher {
    @Override
    public String getName() {
        return "匹配名称";
    }

    @Override
    public boolean match(Path file, String searchPattern) {
        return file.toString().contains(searchPattern);
    }
}
