package com.compscidave.swishassert;

import com.compscidave.swishassert.constraints.Constraint;
import com.compscidave.swishassert.constraints.EqualityConstraint;
import com.compscidave.swishassert.constraints.NumericEqualityConstraint;


public class Is {
    public static Constraint equalTo(Object other) {
        if (Number.class.isAssignableFrom(other.getClass())) {
            return new NumericEqualityConstraint((Number)other);
        }
        return new EqualityConstraint(other);
    }
}
