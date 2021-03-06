package com.compscidave.swishassert;


import com.compscidave.swishassert.constraints.Constraint;
import com.compscidave.swishassert.modifiers.InvertModifier;

import java.lang.reflect.Type;

public class IsNot {
    public Constraint equalTo(Object other) {
        return new InvertModifier(Is.equalTo(other));
    }

    public Constraint equalTo(Number other) {
        return new InvertModifier(Is.equalTo(other));
    }

    public Constraint lessThan(Comparable other) {
        return new InvertModifier(Is.lessThan(other));
    }

    public Constraint greaterThan(Comparable other) {
        return new InvertModifier(Is.greaterThan(other));
    }

    public Constraint lessThanOrEqualTo(Comparable other) {
        return new InvertModifier(Is.lessThanOrEqualTo(other));
    }

    public Constraint greaterThanOrEqualTo(Comparable other) {
        return new InvertModifier(Is.greaterThanOrEqualTo(other));
    }

    public Constraint atMost(Comparable other) {
        return new InvertModifier(Is.atMost(other));
    }

    public Constraint atLeast(Comparable other) {
        return new InvertModifier(Is.atLeast(other));
    }

    public Constraint between(Comparable lowerBound, Comparable upperBound) {
        return new InvertModifier(Is.between(lowerBound, upperBound));
    }

    public Constraint True() {
        return new InvertModifier(Is.True());
    }

    public Constraint False() {
        return new InvertModifier(Is.False());
    }

    public Constraint Null() {
        return new InvertModifier(Is.Null());
    }

    public Constraint NaN() {
        return new InvertModifier(Is.NaN());
    }

    public Constraint sameAs(Object other) {
        return new InvertModifier(Is.sameAs(other));
    }

    public Constraint sameTypeAs(Object other) {
        return new InvertModifier(Is.sameTypeAs(other));
    }

    public Constraint instanceOf(Type type) {
        return new InvertModifier(Is.instanceOf(type));
    }

    public Constraint assignableFrom(Type type) {
        return new InvertModifier(Is.assignableFrom(type));
    }

    public Constraint empty() {
        return new InvertModifier(Is.empty());
    }

    public Constraint emptyString() {
        return new InvertModifier(Is.emptyString());
    }

    public Constraint stringContaining(String string) {
        return new InvertModifier(Is.stringContaining(string));
    }

    public Constraint stringMatching(String string) {
        return new InvertModifier(Is.stringMatching(string));
    }

    public Constraint stringStartingWith(String string) {
        return new InvertModifier(Is.stringStartingWith(string));
    }

    public Constraint stringEndingWith(String string) {
        return new InvertModifier(Is.stringEndingWith(string));
    }
}
