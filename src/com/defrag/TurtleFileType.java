package com.defrag;

import com.intellij.openapi.fileTypes.LanguageFileType;
import com.intellij.openapi.util.IconLoader;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class TurtleFileType extends LanguageFileType {
    public static final TurtleFileType INSTANCE = new TurtleFileType();
    public static final String EXTENSION = "ttl";

    private TurtleFileType() {
        super(TurtleLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public String getName() {
        return "Turtle";
    }

    @NotNull
    @Override
    public String getDescription() {
        return "Turtle description";
    }

    @NotNull
    @Override
    public String getDefaultExtension() {
        return EXTENSION;
    }

    @Nullable
    @Override
    public Icon getIcon() {
        return IconLoader.getIcon("turtle.png");
    }
}
