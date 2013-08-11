package com.compscidave.swishassert;

import com.compscidave.swishassert.constraints.Constraint;
import com.compscidave.swishassert.modifiers.BooleanModifier;


public class ModifiedIs {
    private BooleanModifier modifier;

    public ModifiedIs(BooleanModifier modifier) {
        this.modifier = modifier;
    }

    public Constraint equalTo(Object other) {
        return Is.equalTo(other).withModifier(modifier);
    }

    public Constraint lessThan(Comparable other) {
        return Is.lessThan(other).withModifier(modifier);
    }

    public Constraint greaterThan(Comparable other) {
        return Is.greaterThan(other).withModifier(modifier);
    }

    public Constraint between(Comparable lowerBound, Comparable upperBound) {
        return Is.between(lowerBound, upperBound).withModifier(modifier);
    }

    public Constraint True() {
        return Is.True().withModifier(modifier);
    }

    public Constraint False() {
        return Is.False().withModifier(modifier);
    }

    public Constraint Null() {
        return Is.Null().withModifier(modifier);
    }

    public Constraint NaN() {
        return Is.NaN().withModifier(modifier);
    }
}
