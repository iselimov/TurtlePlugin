package com.defrag;

import com.intellij.lang.*;
import com.intellij.lexer.Lexer;
import com.intellij.openapi.project.Project;
import com.intellij.psi.FileViewProvider;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.intellij.psi.tree.IFileElementType;
import com.intellij.psi.tree.ILightStubFileElementType;
import com.intellij.psi.tree.TokenSet;
import com.intellij.util.diff.FlyweightCapableTreeStructure;
import org.jetbrains.annotations.NotNull;

public class TurtleParserDefinition implements ParserDefinition {

    private static final ILightStubFileElementType FILE = new ILightStubFileElementType(TurtleLanguage.INSTANCE) {
        @Override
        public FlyweightCapableTreeStructure<LighterASTNode> parseContentsLight(ASTNode chameleon) {
            PsiElement psi = chameleon.getPsi();
            assert psi != null : "Bad chameleon: " + chameleon;

            Project project = psi.getProject();
            PsiBuilderFactory factory = PsiBuilderFactory.getInstance();
            PsiBuilder builder = factory.createBuilder(project, chameleon);
            ParserDefinition parserDefinition = LanguageParserDefinitions.INSTANCE.forLanguage(getLanguage());
            assert parserDefinition != null : this;
            TurtleParser parser = new TurtleParser();
            return parser.parseLight(this, builder);
        }
    };

    @NotNull
    @Override
    public Lexer createLexer(Project project) {
        return new TurtleLexer();
    }

    @Override
    public PsiParser createParser(Project project) {
        return new TurtleParser();
    }

    @Override
    public IFileElementType getFileNodeType() {
        return FILE;
    }

    @NotNull
    @Override
    public TokenSet getCommentTokens() {
        return TokenSet.EMPTY;
    }

    @NotNull
    @Override
    public TokenSet getStringLiteralElements() {
        return TokenSet.EMPTY;
    }

    @NotNull
    @Override
    public PsiElement createElement(ASTNode astNode) {
        return astNode.getPsi();
    }

    @Override
    public PsiFile createFile(FileViewProvider fileViewProvider) {
        return new TurtleFileImpl(fileViewProvider);
    }
}
