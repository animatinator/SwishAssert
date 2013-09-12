package com.compscidave.swishassert.constraints.collections;


import java.util.Collection;

public class CollectionEmptyConstraint extends CollectionConstraint {

    @Override
    public boolean isSatisfiedBy(Collection object) {
        return object.isEmpty();
    }

    @Override
    public String generateFailureMessage() {
        return "empty collection";
    }
}
