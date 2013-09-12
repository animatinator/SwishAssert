package com.compscidave.swishassert;


import com.compscidave.swishassert.constraints.collections.ContainsAllOfConstraint;
import com.compscidave.swishassert.constraints.collections.ContainsItemConstraint;import com.compscidave.swishassert.constraints.collections.ContainsSomeOfConstraint;
import com.compscidave.swishassert.modifiers.InvertModifier;

public class Contains {
    public static ContainsAllOfConstraint allOf(Object... items) {
        return new ContainsAllOfConstraint(items);
    }

    public static ContainsSomeOfConstraint someOf(Object... items) {
        return new ContainsSomeOfConstraint(items);
    }

    public static InvertModifier noneOf(Object... items) {
        return new InvertModifier(new ContainsSomeOfConstraint(items));
    }

    public static ContainsItemConstraint item(Object item) {
        return new ContainsItemConstraint(item);
    }
}
