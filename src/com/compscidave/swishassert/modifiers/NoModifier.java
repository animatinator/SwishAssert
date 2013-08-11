package com.compscidave.swishassert.modifiers;


public class NoModifier implements BooleanModifier {
    @Override
    public boolean modify(boolean input) {
        return input;
    }
}
