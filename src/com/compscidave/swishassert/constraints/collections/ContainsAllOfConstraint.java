package com.compscidave.swishassert.constraints.collections;


import java.util.Collection;

public class ContainsAllOfConstraint extends CollectionContainsConstraint {
    public ContainsAllOfConstraint(Object[] items) {
        super(items);
    }

    @Override
    public boolean isSatisfiedBy(Collection collection) {
        for (Object item : items) {
            if (!collection.contains(item)) return false;
        }

        return true;
    }

    @Override
    public String generateFailureMessage() {
        return String.format("collection containing %s", formatArrayAsList(items));
    }
}
