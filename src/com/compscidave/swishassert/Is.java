package com.compscidave.swishassert;

import com.compscidave.swishassert.constraints.EqualityConstraint;


public class Is {
    public static EqualityConstraint equalTo(Object other) {
        return new EqualityConstraint(other);
    }
}
