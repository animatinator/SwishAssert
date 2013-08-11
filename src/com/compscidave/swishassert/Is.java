package com.compscidave.swishassert;

import com.compscidave.swishassert.constraints.EqualityConstraint;
import com.compscidave.swishassert.constraints.NaNConstraint;
import com.compscidave.swishassert.constraints.NullityConstraint;
import com.compscidave.swishassert.constraints.bool.FalseConstraint;
import com.compscidave.swishassert.constraints.bool.TrueConstraint;
import com.compscidave.swishassert.constraints.comparison.BetweenConstraint;
import com.compscidave.swishassert.constraints.comparison.GreaterThanConstraint;
import com.compscidave.swishassert.constraints.comparison.LessThanConstraint;
import com.compscidave.swishassert.constraints.numeric.NumericEqualityConstraint;
import com.compscidave.swishassert.modifiers.InvertModifier;


public class Is {
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

    public static TrueConstraint True() {
        return new TrueConstraint();
    }

    public static FalseConstraint False() {
        return new FalseConstraint();
    }

    public static NullityConstraint Null() {
        return new NullityConstraint();
    }

    public static NaNConstraint NaN() {
        return new NaNConstraint();
    }


    public static void not() {
        throw new UnsupportedOperationException("not implemented");
    }
}
