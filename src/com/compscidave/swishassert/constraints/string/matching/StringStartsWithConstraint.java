package com.compscidave.swishassert.constraints.string.matching;


import com.compscidave.swishassert.constraints.string.StringMatchConstraint;

import java.util.regex.Matcher;

public class StringStartsWithConstraint extends StringMatchConstraint {
    public StringStartsWithConstraint(String stringToMatch) {
        super(stringToMatch);
    }

    @Override
    public boolean isSatisfiedBy(String string) {
        Matcher matcher = patternToMatch.matcher(string);

        while (matcher.find()) {
            int start = matcher.start();
            if (start == 0) return true;
        }

        return false;
    }

    @Override
    public String generateFailureMessage() {
        return String.format("string starting with '%s'", patternToMatch.toString());
    }
}
