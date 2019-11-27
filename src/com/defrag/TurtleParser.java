package com.defrag;

import com.intellij.lang.ASTNode;
import com.intellij.lang.LighterASTNode;
import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiParser;
import com.intellij.psi.tree.IElementType;
import com.intellij.util.diff.FlyweightCapableTreeStructure;
import org.jetbrains.annotations.NotNull;

public class TurtleParser implements PsiParser {

    @NotNull
    @Override
    public ASTNode parse(@NotNull IElementType iElementType, @NotNull PsiBuilder psiBuilder) {
        doParse(iElementType, psiBuilder);
        return psiBuilder.getTreeBuilt();
    }

    public FlyweightCapableTreeStructure<LighterASTNode> parseLight(IElementType root, PsiBuilder builder) {
        doParse(root, builder);
        return builder.getLightTree();
    }

    private void doParse(IElementType root, PsiBuilder builder) {

    }
}
