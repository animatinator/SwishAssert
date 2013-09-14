package com.compscidave.swishassert.constraints.string.matching;


import com.compscidave.swishassert.constraints.string.StringMatchConstraint;

import java.util.regex.Matcher;

public class StringEndsWithConstraint extends StringMatchConstraint {
    public StringEndsWithConstraint(String stringToMatch) {
        super(stringToMatch);
    }

    @Override
    public boolean isSatisfiedBy(String string) {
        Matcher matcher = patternToMatch.matcher(string);

        while (matcher.find()) {
            int end = matcher.end();
            if (end == string.length()) return true;
        }

        return false;
    }

    @Override
    public String generateFailureMessage() {
        return String.format("string ending with '%s'", patternToMatch.toString());
    }
}
