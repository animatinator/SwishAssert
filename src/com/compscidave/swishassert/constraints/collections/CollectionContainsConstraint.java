package com.compscidave.swishassert.constraints.collections;


public abstract class CollectionContainsConstraint extends CollectionConstraint {
    protected Object[] items;

    public CollectionContainsConstraint(Object... items) {
        this.items = items;
    }
}
