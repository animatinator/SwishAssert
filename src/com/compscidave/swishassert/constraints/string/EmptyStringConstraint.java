package com.compscidave.swishassert.constraints.string;


public class EmptyStringConstraint extends StringConstraint {
    @Override
    public boolean isSatisfiedBy(String string) {
        return string.isEmpty();
    }

    @Override
    public String generateFailureMessage() {
        return "empty string";
    }
}
