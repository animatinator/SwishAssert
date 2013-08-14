package com.compscidave.swishassert.constraints.bool;


public class FalseConstraint extends BooleanConstraint {
    @Override
    public boolean isSatisfiedBy(Boolean object) {
        return !object;
    }

    @Override
    public String generateFailureMessage() {
        return "false";
    }
}
