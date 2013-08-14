package com.compscidave.swishassert.modifiers;

import com.compscidave.swishassert.constraints.Constraint;


public class OrModifier extends Constraint {
    private Constraint firstConstraint;
    private Constraint secondConstraint;

    public OrModifier(Constraint firstConstraint, Constraint secondConstraint) {
        this.firstConstraint = firstConstraint;
        this.secondConstraint = secondConstraint;
    }

    @Override
    public boolean isSatisfiedBy(Object object) {
        return firstConstraint.isSatisfiedBy(object) || secondConstraint.isSatisfiedBy(object);
    }

    @Override
    public String generateFailureMessage() {
        return String.format("%s or %s", firstConstraint.generateFailureMessage(), secondConstraint.generateFailureMessage());
    }
}
