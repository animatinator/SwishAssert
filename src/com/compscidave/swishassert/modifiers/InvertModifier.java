package com.compscidave.swishassert.modifiers;


public class InvertModifier implements BooleanModifier {
    @Override
    public boolean modify(boolean input) {
        return !input;
    }
}
