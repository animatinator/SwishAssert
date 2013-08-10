package com.compscidave.swishassert;

import com.compscidave.swishassert.constraints.Constraint;

/**
 * Created with IntelliJ IDEA.
 * User: David
 * Date: 10/08/13
 * Time: 21:52
 * To change this template use File | Settings | File Templates.
 */
public class Assert {

    public static final String DEFAULT_FALSE_ASSERTION_MESSAGE = "Expression was false";

    public static void That(boolean expression) {
        That(expression, DEFAULT_FALSE_ASSERTION_MESSAGE);
    }

    public static void That(boolean expression, String message) {
        if (!expression) throw new AssertionError(message);
    }

    public static void That(Object object, Constraint constraint) {
        That(object, constraint, "Fail");
    }

    public static void That(Object object, Constraint constraint, String message) {
        if (!constraint.satisfiedByObject(object)) {
            throw new AssertionError(message);
        }
    }
}
