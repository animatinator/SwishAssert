package com.compscidave.swishassert;

import com.compscidave.swishassert.constraints.EqualityConstraint;

/**
 * Created with IntelliJ IDEA.
 * User: David
 * Date: 10/08/13
 * Time: 21:10
 * To change this template use File | Settings | File Templates.
 */
public class Is {
    public EqualityConstraint equalTo(Object other) {
        return new EqualityConstraint(other);
    }
}
