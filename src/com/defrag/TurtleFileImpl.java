package com.defrag;

import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import org.jetbrains.annotations.NotNull;

public class TurtleFileImpl extends PsiFileBase {

    protected TurtleFileImpl(@NotNull FileViewProvider viewProvider) {
        super(viewProvider, TurtleLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public FileType getFileType() {
        return TurtleFileType.INSTANCE;
    }
}
