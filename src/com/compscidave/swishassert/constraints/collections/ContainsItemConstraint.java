package com.compscidave.swishassert.constraints.collections;


public class ContainsItemConstraint extends ContainsAllOfConstraint {
    private Object item;

    public ContainsItemConstraint(Object item) {
        super(new Object[] {item});
        this.item = item;
    }

    @Override
    public String generateFailureMessage() {
        return String.format("collection containing '%s'", item);
    }
}
