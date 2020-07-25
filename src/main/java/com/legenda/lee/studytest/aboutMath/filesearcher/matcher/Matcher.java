package com.legenda.lee.studytest.aboutMath.filesearcher.matcher;

import java.io.File;
import java.nio.file.Path;

/**
 * @author: Lee
 * @date: 2019-01-03 21:11
 **/
public interface Matcher {
    /**
     * 返回 matcher 的名称。
     *
     * @return
     */
    String getName();

    /**
     * 返回指定的路径是否满足条件。
     *
     * @param file
     * @return
     */
    boolean match(Path file, String searchPattern);
}
