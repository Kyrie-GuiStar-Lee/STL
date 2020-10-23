// Generated from E:/STL/src/main/resources\STL.g4 by ANTLR 4.8
package gen;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link STLParser}.
 */
public interface STLListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code Program_}
	 * labeled alternative in {@link STLParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProgram_(STLParser.Program_Context ctx);
	/**
	 * Exit a parse tree produced by the {@code Program_}
	 * labeled alternative in {@link STLParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProgram_(STLParser.Program_Context ctx);
	/**
	 * Enter a parse tree produced by the {@code Formula_}
	 * labeled alternative in {@link STLParser#form}.
	 * @param ctx the parse tree
	 */
	void enterFormula_(STLParser.Formula_Context ctx);
	/**
	 * Exit a parse tree produced by the {@code Formula_}
	 * labeled alternative in {@link STLParser#form}.
	 * @param ctx the parse tree
	 */
	void exitFormula_(STLParser.Formula_Context ctx);
	/**
	 * Enter a parse tree produced by the {@code EventualAlways_}
	 * labeled alternative in {@link STLParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterEventualAlways_(STLParser.EventualAlways_Context ctx);
	/**
	 * Exit a parse tree produced by the {@code EventualAlways_}
	 * labeled alternative in {@link STLParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitEventualAlways_(STLParser.EventualAlways_Context ctx);
	/**
	 * Enter a parse tree produced by the {@code Parens_}
	 * labeled alternative in {@link STLParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParens_(STLParser.Parens_Context ctx);
	/**
	 * Exit a parse tree produced by the {@code Parens_}
	 * labeled alternative in {@link STLParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParens_(STLParser.Parens_Context ctx);
	/**
	 * Enter a parse tree produced by the {@code NotExpr}
	 * labeled alternative in {@link STLParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNotExpr(STLParser.NotExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NotExpr}
	 * labeled alternative in {@link STLParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNotExpr(STLParser.NotExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AndOrImplyUntil_}
	 * labeled alternative in {@link STLParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAndOrImplyUntil_(STLParser.AndOrImplyUntil_Context ctx);
	/**
	 * Exit a parse tree produced by the {@code AndOrImplyUntil_}
	 * labeled alternative in {@link STLParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAndOrImplyUntil_(STLParser.AndOrImplyUntil_Context ctx);
	/**
	 * Enter a parse tree produced by the {@code Predicates_}
	 * labeled alternative in {@link STLParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterPredicates_(STLParser.Predicates_Context ctx);
	/**
	 * Exit a parse tree produced by the {@code Predicates_}
	 * labeled alternative in {@link STLParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitPredicates_(STLParser.Predicates_Context ctx);
	/**
	 * Enter a parse tree produced by the {@code UnaryTemporalop_}
	 * labeled alternative in {@link STLParser#unaryTemporalop}.
	 * @param ctx the parse tree
	 */
	void enterUnaryTemporalop_(STLParser.UnaryTemporalop_Context ctx);
	/**
	 * Exit a parse tree produced by the {@code UnaryTemporalop_}
	 * labeled alternative in {@link STLParser#unaryTemporalop}.
	 * @param ctx the parse tree
	 */
	void exitUnaryTemporalop_(STLParser.UnaryTemporalop_Context ctx);
	/**
	 * Enter a parse tree produced by the {@code Until_}
	 * labeled alternative in {@link STLParser#until}.
	 * @param ctx the parse tree
	 */
	void enterUntil_(STLParser.Until_Context ctx);
	/**
	 * Exit a parse tree produced by the {@code Until_}
	 * labeled alternative in {@link STLParser#until}.
	 * @param ctx the parse tree
	 */
	void exitUntil_(STLParser.Until_Context ctx);
	/**
	 * Enter a parse tree produced by the {@code Perturbation_}
	 * labeled alternative in {@link STLParser#perturbation}.
	 * @param ctx the parse tree
	 */
	void enterPerturbation_(STLParser.Perturbation_Context ctx);
	/**
	 * Exit a parse tree produced by the {@code Perturbation_}
	 * labeled alternative in {@link STLParser#perturbation}.
	 * @param ctx the parse tree
	 */
	void exitPerturbation_(STLParser.Perturbation_Context ctx);
}