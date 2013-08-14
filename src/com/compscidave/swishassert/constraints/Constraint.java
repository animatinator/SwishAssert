package com.compscidave.swishassert.constraints;


import com.compscidave.swishassert.modifiers.AndModifier;
import com.compscidave.swishassert.modifiers.OrModifier;

public abstract class Constraint<T> {
    protected String failureMessage;

    public abstract boolean isSatisfiedBy(T object);
    public abstract String generateFailureMessage();

    public Constraint withFailureMessage(String message) {
        failureMessage = message;
        return this;
    }

    public String getFailureMessage(Object actual) {
        return String.format("%sExpected %s, but got '%s'", formatCustomFailureMessage(), generateFailureMessage(), actual);
    }

    private String formatCustomFailureMessage() {
        if (failureMessage == null) return "";
        return String.format("%s\n\n", failureMessage);
    }


    public AndModifier and(Constraint other) {
        return new AndModifier(this, other);
    }

    public OrModifier or(Constraint other) {
        return new OrModifier(this, other);
    }
}
