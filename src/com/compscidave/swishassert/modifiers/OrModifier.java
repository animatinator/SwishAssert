package com.compscidave.swishassert.modifiers;

import com.compscidave.swishassert.constraints.Constraint;

/**
 * Created with IntelliJ IDEA.
 * User: David
 * Date: 13/08/13
 * Time: 19:28
 * To change this template use File | Settings | File Templates.
 */
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
    public String generateFailureMessage(String userMessage) {
        throw new UnsupportedOperationException("not implemented");
    }
}
