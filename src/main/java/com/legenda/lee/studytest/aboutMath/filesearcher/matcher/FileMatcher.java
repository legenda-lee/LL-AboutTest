package com.legenda.lee.studytest.aboutMath.filesearcher.matcher;

import java.nio.file.Path;

/**
 * @author: Lee
 * @date: 2019-01-03 21:17
 **/
public abstract class FileMatcher implements Matcher {
    @Override
    public String getName() {
        return this.getClass().getName();
    }
}
