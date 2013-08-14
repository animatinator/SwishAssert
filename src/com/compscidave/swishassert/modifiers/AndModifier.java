package com.compscidave.swishassert.modifiers;

import com.compscidave.swishassert.constraints.Constraint;


public class AndModifier extends Constraint {
    private Constraint firstConstraint;
    private Constraint secondConstraint;

    public AndModifier(Constraint first, Constraint second) {

        firstConstraint = first;
        secondConstraint = second;
    }

    @Override
    public boolean isSatisfiedBy(Object object) {
        return firstConstraint.isSatisfiedBy(object) && secondConstraint.isSatisfiedBy(object);
    }

    @Override
    public String generateFailureMessage() {
        return String.format("%s and %s", firstConstraint.generateFailureMessage(), secondConstraint.generateFailureMessage());
    }
}
