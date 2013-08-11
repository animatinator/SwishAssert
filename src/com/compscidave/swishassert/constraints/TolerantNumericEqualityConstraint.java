package com.compscidave.swishassert.constraints;


public class TolerantNumericEqualityConstraint extends NumericConstraint {
    private final Number tolerance;

    public TolerantNumericEqualityConstraint(Number number, Number tolerance) {
        super(number);
        this.tolerance = tolerance;
    }

    @Override
    public boolean satisfiedBy(Number otherNumber) {
        return (Math.abs(otherNumber.doubleValue() - number.doubleValue()) < tolerance.doubleValue());
    }
}
