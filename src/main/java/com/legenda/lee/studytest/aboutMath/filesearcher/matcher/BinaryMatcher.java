package com.legenda.lee.studytest.aboutMath.filesearcher.matcher;

/**
 * @author: Lee
 * @date: 2019-01-03 21:19
 **/
public abstract class BinaryMatcher extends FileMatcher {
    private Matcher left;
    private Matcher right;

    public Matcher getLeft() {
        return left;
    }

    public void setLeft(Matcher left) {
        this.left = left;
    }

    public Matcher getRight() {
        return right;
    }

    public void setRight(Matcher right) {
        this.right = right;
    }
}
