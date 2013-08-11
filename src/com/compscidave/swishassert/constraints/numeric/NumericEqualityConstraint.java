package com.compscidave.swishassert.constraints.numeric;


public class NumericEqualityConstraint extends NumericConstraint {
    public NumericEqualityConstraint(Number number) {
        super(number);
    }

    @Override
    public boolean isSatisfiedBy(Number otherNumber) {
        return number.equals(otherNumber);
    }

    public TolerantNumericEqualityConstraint withTolerance(Number tolerance) {
        return new TolerantNumericEqualityConstraint(number, tolerance);
    }
}
