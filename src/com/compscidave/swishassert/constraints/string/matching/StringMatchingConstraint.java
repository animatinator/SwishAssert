package com.compscidave.swishassert.constraints.string.matching;


import com.compscidave.swishassert.constraints.string.StringMatchConstraint;

import java.util.regex.Matcher;

public class StringMatchingConstraint extends StringMatchConstraint {
    public StringMatchingConstraint(String stringToMatch) {
        super(stringToMatch);
    }

    @Override
    public boolean isSatisfiedBy(String string) {
        return string.matches(patternToMatch.toString());
    }

    @Override
    public String generateFailureMessage() {
        return String.format("string matching the pattern '%s'", patternToMatch.toString());
    }
}
