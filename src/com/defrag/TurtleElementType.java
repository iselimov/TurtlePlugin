package com.defrag;

import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NotNull;

public class TurtleElementType extends IElementType {
    public TurtleElementType(@NotNull String debugName) {
        super(debugName, TurtleLanguage.INSTANCE);
    }

    @Override
    public String toString() {
        return "Turtle:" + super.toString();
    }
}
