package com.compscidave.swishassert;

import com.compscidave.swishassert.constraints.*;
import com.compscidave.swishassert.constraints.bool.FalseConstraint;
import com.compscidave.swishassert.constraints.bool.TrueConstraint;
import com.compscidave.swishassert.constraints.collections.CollectionEmptyConstraint;import com.compscidave.swishassert.constraints.comparison.BetweenConstraint;
import com.compscidave.swishassert.constraints.comparison.GreaterThanConstraint;
import com.compscidave.swishassert.constraints.comparison.LessThanConstraint;
import com.compscidave.swishassert.constraints.numeric.NumericEqualityConstraint;
import com.compscidave.swishassert.constraints.string.EmptyStringConstraint;
import com.compscidave.swishassert.constraints.string.matching.StringContainsConstraint;
import com.compscidave.swishassert.constraints.string.matching.StringEndsWithConstraint;
import com.compscidave.swishassert.constraints.string.matching.StringMatchingConstraint;
import com.compscidave.swishassert.constraints.string.matching.StringStartsWithConstraint;
import com.compscidave.swishassert.constraints.type.AssignableFromConstraint;
import com.compscidave.swishassert.constraints.type.InstanceOfConstraint;
import com.compscidave.swishassert.constraints.type.TypeEqualityConstraint;

import java.lang.reflect.Type;


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

    public static Constraint lessThanOrEqualTo(Comparable other) {
        return Is.lessThan(other).or(Is.equalTo(other));
    }

    public static Constraint greaterThanOrEqualTo(Comparable other) {
        return Is.greaterThan(other).or(Is.equalTo(other));
    }

    public static Constraint atMost(Comparable other) {
        return Is.lessThanOrEqualTo(other);
    }

    public static Constraint atLeast(Comparable other) {
        return Is.greaterThanOrEqualTo(other);
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

    public static ReferenceEqualConstraint sameAs(Object other) {
        return new ReferenceEqualConstraint(other);
    }

    public static TypeEqualityConstraint sameTypeAs(Object other) {
        return new TypeEqualityConstraint(other.getClass());
    }

    public static InstanceOfConstraint instanceOf(Type type) {
        return new InstanceOfConstraint(type);
    }

    public static AssignableFromConstraint assignableFrom(Type type) {
        return new AssignableFromConstraint(type);
    }

    public static CollectionEmptyConstraint empty() {
        return new CollectionEmptyConstraint();
    }

    public static EmptyStringConstraint emptyString() {
        return new EmptyStringConstraint();
    }

    public static StringContainsConstraint stringContaining(String string) {
        return new StringContainsConstraint(string);
    }

    public static StringMatchingConstraint stringMatching(String string) {
        return new StringMatchingConstraint(string);
    }

    public static StringStartsWithConstraint stringStartingWith(String string) {
        return new StringStartsWithConstraint(string);
    }

    public static StringEndsWithConstraint stringEndingWith(String string) {
        return new StringEndsWithConstraint(string);
    }

    public static IsNot not() {
        return new IsNot();
    }
}
