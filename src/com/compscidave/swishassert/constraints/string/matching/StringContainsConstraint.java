package com.compscidave.swishassert.constraints.string.matching;


import com.compscidave.swishassert.constraints.string.StringMatchConstraint;

import java.util.regex.Matcher;

public class StringContainsConstraint extends StringMatchConstraint {
    public StringContainsConstraint(String stringToMatch) {
        super(stringToMatch);
    }

    @Override
    public boolean isSatisfiedBy(String string) {
        Matcher matcher = patternToMatch.matcher(string);
        return matcher.find();
    }

    @Override
    public String generateFailureMessage() {
        return String.format("string containing '%s'", patternToMatch.toString());
    }
}
