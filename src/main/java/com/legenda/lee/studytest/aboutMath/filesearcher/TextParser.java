package com.legenda.lee.studytest.aboutMath.filesearcher;


import com.legenda.lee.studytest.aboutMath.filesearcher.matcher.*;

/**
 * @author: Lee
 * @date: 2019-01-03 21:41
 **/
public class TextParser {
    private StringBuilder wordBuffer = new StringBuilder();
    private Matcher res = null;
    private BinaryMatcher binaryMatcher = null;
    private MatcherRepository matchers = MatcherRepository.getInstance();


    public Matcher parseMatcher(String text) {
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);

            //时间有限，不处理括号匹配了。
//            if(c == '('){
//
//            }
            if (c == '&') {
                dealWordCompleted();
                if (res != null) {
                    binaryMatcher = new AndMatcher();
                    binaryMatcher.setLeft(res);
                }
                continue;
            } else if (c == '|' && text.charAt(i + 1) == '|') {
                dealWordCompleted();

                i++;
                if (res != null) {
                    binaryMatcher = new OrMatcher();
                    binaryMatcher.setLeft(res);
                }
                continue;
            } else if (Character.isWhitespace(c)) {
                dealWordCompleted();
                continue;
            }

            wordBuffer.append(c);
        }

        dealWordCompleted();

        return res;
    }

    private void dealWordCompleted() {
        String name = wordBuffer.toString();
        if (name.length() > 0) {
            wordBuffer.setLength(0);

            Matcher matcher = matchers.get(name);

            if (binaryMatcher != null) {
                binaryMatcher.setRight(matcher);
                res = binaryMatcher;

                binaryMatcher = null;
            } else {
                res = matcher;
            }
        }
    }
}
