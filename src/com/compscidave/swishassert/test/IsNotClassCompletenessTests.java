package com.compscidave.swishassert.test;


import com.compscidave.swishassert.Is;
import com.compscidave.swishassert.IsNot;
import org.junit.Test;

import java.lang.reflect.Method;

import static org.junit.Assert.fail;

public class IsNotClassCompletenessTests {
    @Test
    public void IsNotContainsAllMethodsFromIs() {
        Class isClass = Is.class;
        Class isNotClass = IsNot.class;

        Method[] isNotClassMethods = isNotClass.getMethods();

        for (Method method : isClass.getMethods()) {
            String name = method.getName();
            if (name.equals("not")) continue;  // IsNot should not contain the not() method again

            boolean found = false;
            for (Method isNotClassMethod : isNotClassMethods) {
                if (isNotClassMethod.getName().equals(name)) {
                    found = true;
                }
            }

            if (!found) {
                fail(String.format("Missing method: %s is declared in Is but not in IsNot", name));
            }
        }
    }
}
