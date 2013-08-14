package com.compscidave.swishassert;

import com.compscidave.swishassert.constraints.Constraint;


public class Assert {

    public static final String DEFAULT_FALSE_ASSERTION_MESSAGE = "Expression was false";
    public static final String FORCED_FAILURE_MESSAGE = "Forced failure";

    public static void That(boolean expression) {
        That(expression, DEFAULT_FALSE_ASSERTION_MESSAGE);
    }

    public static void That(boolean expression, String message) {
        if (!expression) throw new AssertionError(message);
    }

    public static void That(Object object, Constraint ... constraints) {
        for (Constraint constraint : constraints) {
            if (!constraint.isSatisfiedBy(object)) {
                throw new AssertionError(constraint.getFailureMessage(object));
            }
        }
    }

    public static void Fail() {
        Fail(FORCED_FAILURE_MESSAGE);
    }

    public static void Fail(String message) {
        throw new AssertionError(message);
    }
}
