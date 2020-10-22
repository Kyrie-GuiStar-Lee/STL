package test;


import gen.STLLexer;
import gen.STLParser;
import gen.STLVisitor;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CodePointCharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class Main {
    public static void main(String[] args) {

        CodePointCharStream inputStream = CharStreams.fromString("werr = G_[a,b] ((s(t)>1 OR F_[0.2,3] r(t)<=-0.2))\ns(t)_pert = 0.9\n" +
                "r(t)_pert = 2");
        STLLexer lexer = new STLLexer(inputStream);
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        STLParser parser = new STLParser(tokenStream);
        ParseTree parseTree = parser.prog();
        System.out.println();
    }
}
