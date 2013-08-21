package com.compscidave.swishassert.constraints.collections;

import com.compscidave.swishassert.constraints.Constraint;

import java.util.Collection;


public abstract class CollectionConstraint extends Constraint<Collection> {
    protected String formatArrayAsList(Object[] array) {
        StringBuilder builder = new StringBuilder();
        boolean firstItem = true;

        for (Object item : array) {
            if (firstItem) firstItem = false;
            else {
                builder.append(", ");
            }

            builder.append(item.toString());
        }

        return builder.toString();
    }
}
