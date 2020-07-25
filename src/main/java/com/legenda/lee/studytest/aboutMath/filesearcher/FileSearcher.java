package com.legenda.lee.studytest.aboutMath.filesearcher;


import com.legenda.lee.studytest.aboutMath.filesearcher.matcher.Matcher;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author: Lee
 * @date: 2019-01-03 21:09
 **/
public class FileSearcher {
    private Matcher matcher;

    private String searchValue;

    public Matcher getMatcher() {
        return matcher;
    }

    public void setMatcher(Matcher matcher) {
        this.matcher = matcher;
    }

    public String getSearchValue() {
        return searchValue;
    }

    public void setSearchValue(String searchValue) {
        this.searchValue = searchValue;
    }

    public List<Path> search(Path path) throws IOException {
        List<Path> res = new ArrayList<>(1000);
        if (path.toFile().exists()) {
            searchRecur(path, res);
        }
        return res;
    }

    private void searchRecur(Path path, List<Path> res) throws IOException {
        if (matcher.match(path, searchValue)) {
            res.add(path);
        }

        //递归子文件夹。
        if (path.toFile().isDirectory()) {
            Stream<Path> subFiles = Files.list(path);
            Iterator<Path> iterator = subFiles.iterator();
            while (iterator.hasNext()) {
                Path child = iterator.next();
                searchRecur(child, res);
            }
        }
    }
}