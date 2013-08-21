package com.compscidave.swishassert.constraints.collections;


import java.util.Collection;

public class ContainsSomeOfConstraint extends CollectionContainsConstraint {
    public ContainsSomeOfConstraint(Object... items) {
        super(items);
    }

    @Override
    public boolean isSatisfiedBy(Collection collection) {
        for (Object item : items) {
            if (collection.contains(item)) return true;
        }

        return false;
    }

    @Override
    public String generateFailureMessage() {
        return String.format("collection containing some of %s", formatArrayAsList(items));
    }
}
