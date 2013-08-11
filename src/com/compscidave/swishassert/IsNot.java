package com.compscidave.swishassert;


import com.compscidave.swishassert.constraints.Constraint;
import com.compscidave.swishassert.constraints.NaNConstraint;
import com.compscidave.swishassert.constraints.NullityConstraint;
import com.compscidave.swishassert.constraints.bool.FalseConstraint;
import com.compscidave.swishassert.constraints.bool.TrueConstraint;
import com.compscidave.swishassert.modifiers.InvertModifier;

public class IsNot {
    public Constraint equalTo(Object other) {
        return new InvertModifier(Is.equalTo(other));
    }

    public Constraint equalTo(Number other) {
        return new InvertModifier(Is.equalTo(other));
    }

    public Constraint lessThan(Comparable other) {
        return new InvertModifier(Is.lessThan(other));
    }

    public Constraint greaterThan(Comparable other) {
        return new InvertModifier(Is.greaterThan(other));
    }

    public Constraint between(Comparable lowerBound, Comparable upperBound) {
        return new InvertModifier(Is.between(lowerBound, upperBound));
    }

    public Constraint True() {
        return new FalseConstraint();
    }

    public Constraint False() {
        return new TrueConstraint();
    }

    public Constraint Null() {
        return new InvertModifier(new NullityConstraint());
    }

    public Constraint NaN() {
        return new InvertModifier(new NaNConstraint());
    }
}
