package com.legenda.lee.studytest.aboutMath.filesearcher.matcher;

import java.nio.file.Path;

/**
 * @author: Lee
 * @date: 2019-01-03 21:20
 **/
public class OrMatcher extends BinaryMatcher {
    @Override
    public boolean match(Path path, String searchPattern) {
        return getLeft().match(path, searchPattern) || getRight().match(path, searchPattern);
    }
}