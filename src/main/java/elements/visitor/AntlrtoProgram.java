package elements.visitor;

import elements.element.Program;
import gen.STLBaseVisitor;
import gen.STLParser;

public class AntlrtoProgram extends STLBaseVisitor<Program> {
    @Override
    public Program visitProgram_(STLParser.Program_Context ctx) {
        return super.visitProgram_(ctx);
    }
}
