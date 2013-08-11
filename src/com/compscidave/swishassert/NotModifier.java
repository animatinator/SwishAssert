package com.compscidave.swishassert;


public class NotModifier implements BooleanModifier {
    @Override
    public boolean modify(boolean input) {
        return !input;
    }
}
