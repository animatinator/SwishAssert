package com.compscidave.swishassert;

import com.compscidave.swishassert.constraints.Constraint;
import com.compscidave.swishassert.constraints.EqualityConstraint;
import com.compscidave.swishassert.constraints.NumericEqualityConstraint;


public class Is {
    public static Constraint equalTo(Object other) {
        return new EqualityConstraint(other);
    }

    public static NumericEqualityConstraint equalTo(Number other) {
        return new NumericEqualityConstraint(other);
    }
}
