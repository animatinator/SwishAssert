package com.compscidave.swishassert.modifiers;


import com.compscidave.swishassert.constraints.Constraint;

//TODO: Make a superclass for modifiers
public class InvertModifier extends Constraint {
    private Constraint constraintToModify;

    public InvertModifier(Constraint constraint) {
        constraintToModify = constraint;
    }

    @Override
    public boolean isSatisfiedBy(Object object) {
        return !constraintToModify.isSatisfiedBy(object);
    }

    @Override
    public String generateFailureMessage() {
        return String.format("not %s", constraintToModify.generateFailureMessage());
    }
}
