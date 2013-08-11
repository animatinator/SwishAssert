package com.compscidave.swishassert;

import com.compscidave.swishassert.constraints.EqualityConstraint;
import com.compscidave.swishassert.constraints.comparison.BetweenConstraint;
import com.compscidave.swishassert.constraints.comparison.GreaterThanConstraint;
import com.compscidave.swishassert.constraints.comparison.LessThanConstraint;
import com.compscidave.swishassert.constraints.numeric.NumericEqualityConstraint;


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
}
