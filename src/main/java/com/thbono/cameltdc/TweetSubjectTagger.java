package com.thbono.cameltdc;

public class TweetSubjectTagger {

    public String getSubjectHeader(final String body) {
        return SelectUtil.isAboutJava(body) ? "java" : "other";
    }

}
