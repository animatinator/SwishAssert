package com.compscidave.swishassert.modifiers;


import com.compscidave.swishassert.constraints.Constraint;

public class InvertModifier extends Constraint {
    private Constraint constraintToModify;

    @Override
    public boolean isSatisfiedBy(Object object) {
        return !constraintToModify.isSatisfiedBy(object);
    }

    @Override
    public String generateFailureMessage(String userMessage) {
        throw new UnsupportedOperationException("not implemented");
    }
}
