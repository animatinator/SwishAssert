package com.compscidave.swishassert;


import com.compscidave.swishassert.constraints.collections.ContainsAllOfConstraint;
import com.compscidave.swishassert.constraints.collections.ContainsSomeOfConstraint;

public class Contains {
    public static ContainsAllOfConstraint allOf(Object... items) {
        return new ContainsAllOfConstraint(items);
    }

    public static ContainsSomeOfConstraint someOf(Object... items) {
        return new ContainsSomeOfConstraint(items);
    }
}
