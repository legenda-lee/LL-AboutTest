package com.legenda.lee.studytest.aboutMath.filesearcher.matcher;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;

import java.util.HashMap;
import java.util.Objects;

/**
 * @author: Lee
 * @date: 2019-01-03 21:32
 **/
public class MatcherRepository extends HashMap<String, Matcher> {
    public static final MatcherRepository instance = new MatcherRepository();

    private MatcherRepository() {
        this.add(new FileNameMatcher());
        this.add(new FileContentMatcher());
        this.add(new FileEndMatcher());
//        this.add(new AndMatcher());
//        this.add(new OrMatcher());
    }

    public static MatcherRepository getInstance() {
        return instance;
    }

    public void add(Matcher matcher) {
        Objects.requireNonNull(matcher);
        this.put(matcher.getName(), matcher);
    }
}