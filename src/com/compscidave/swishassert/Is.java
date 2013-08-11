package com.compscidave.swishassert;

import com.compscidave.swishassert.constraints.EqualityConstraint;
import com.compscidave.swishassert.constraints.comparison.BetweenConstraint;
import com.compscidave.swishassert.constraints.comparison.GreaterThanConstraint;
import com.compscidave.swishassert.constraints.comparison.LessThanConstraint;
import com.compscidave.swishassert.constraints.numeric.NumericEqualityConstraint;


public class Is {
    private BooleanModifier modifier;

    // Adding the ability to create instances with the hope that Is.Not can return a new Is with a NotModifier attached
    public Is(BooleanModifier modifier) {
        this.modifier = modifier;
    }


    public static EqualityConstraint equalTo(Object other) {
        return new EqualityConstraint(other);
    }

    public static NumericEqualityConstraint equalTo(Number other) {
        return new NumericEqualityConstraint(other);
    }

    public static LessThanConstraint lessThan(Comparable other) {
        return new LessThanConstraint(other);
    }

    public static GreaterThanConstraint greaterThan(Comparable other) {
        return new GreaterThanConstraint(other);
    }

    public static BetweenConstraint between(Comparable lowerBound, Comparable upperBound) {
        return new BetweenConstraint(lowerBound, upperBound);
    }
}
