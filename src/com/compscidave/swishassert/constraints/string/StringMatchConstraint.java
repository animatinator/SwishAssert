package com.compscidave.swishassert.constraints.string;


import java.util.regex.Pattern;

public abstract class StringMatchConstraint extends StringConstraint {
    protected final Pattern patternToMatch;

    public StringMatchConstraint(String stringToMatch) {
        this.patternToMatch = Pattern.compile(stringToMatch);
    }
}
