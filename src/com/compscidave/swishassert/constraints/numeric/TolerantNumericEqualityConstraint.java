package com.compscidave.swishassert.constraints.numeric;


public class TolerantNumericEqualityConstraint extends NumericConstraint {
    private final Number tolerance;

    public TolerantNumericEqualityConstraint(Number number, Number tolerance) {
        super(number);
        this.tolerance = tolerance;
    }

    @Override
    public boolean isSatisfiedBy(Number otherNumber) {
        return (Math.abs(otherNumber.doubleValue() - number.doubleValue()) < tolerance.doubleValue());
    }
}
