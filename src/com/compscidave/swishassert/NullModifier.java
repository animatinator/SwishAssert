package com.compscidave.swishassert;


public class NullModifier implements BooleanModifier {
    @Override
    public boolean modify(boolean input) {
        return input;
    }
}
