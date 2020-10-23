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
	 * Enter a parse tree produced by the {@code Imply_}
	 * labeled alternative in {@link STLParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterImply_(STLParser.Imply_Context ctx);
	/**
	 * Exit a parse tree produced by the {@code Imply_}
	 * labeled alternative in {@link STLParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitImply_(STLParser.Imply_Context ctx);
	/**
	 * Enter a parse tree produced by the {@code Until_}
	 * labeled alternative in {@link STLParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterUntil_(STLParser.Until_Context ctx);
	/**
	 * Exit a parse tree produced by the {@code Until_}
	 * labeled alternative in {@link STLParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitUntil_(STLParser.Until_Context ctx);
	/**
	 * Enter a parse tree produced by the {@code And_}
	 * labeled alternative in {@link STLParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAnd_(STLParser.And_Context ctx);
	/**
	 * Exit a parse tree produced by the {@code And_}
	 * labeled alternative in {@link STLParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAnd_(STLParser.And_Context ctx);
	/**
	 * Enter a parse tree produced by the {@code UnaryExpression_}
	 * labeled alternative in {@link STLParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpression_(STLParser.UnaryExpression_Context ctx);
	/**
	 * Exit a parse tree produced by the {@code UnaryExpression_}
	 * labeled alternative in {@link STLParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpression_(STLParser.UnaryExpression_Context ctx);
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
	 * Enter a parse tree produced by the {@code Or_}
	 * labeled alternative in {@link STLParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterOr_(STLParser.Or_Context ctx);
	/**
	 * Exit a parse tree produced by the {@code Or_}
	 * labeled alternative in {@link STLParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitOr_(STLParser.Or_Context ctx);
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
	 * Enter a parse tree produced by the {@code Eventually_}
	 * labeled alternative in {@link STLParser#eventually}.
	 * @param ctx the parse tree
	 */
	void enterEventually_(STLParser.Eventually_Context ctx);
	/**
	 * Exit a parse tree produced by the {@code Eventually_}
	 * labeled alternative in {@link STLParser#eventually}.
	 * @param ctx the parse tree
	 */
	void exitEventually_(STLParser.Eventually_Context ctx);
	/**
	 * Enter a parse tree produced by the {@code Global_}
	 * labeled alternative in {@link STLParser#global}.
	 * @param ctx the parse tree
	 */
	void enterGlobal_(STLParser.Global_Context ctx);
	/**
	 * Exit a parse tree produced by the {@code Global_}
	 * labeled alternative in {@link STLParser#global}.
	 * @param ctx the parse tree
	 */
	void exitGlobal_(STLParser.Global_Context ctx);
	/**
	 * Enter a parse tree produced by the {@code Not_}
	 * labeled alternative in {@link STLParser#not}.
	 * @param ctx the parse tree
	 */
	void enterNot_(STLParser.Not_Context ctx);
	/**
	 * Exit a parse tree produced by the {@code Not_}
	 * labeled alternative in {@link STLParser#not}.
	 * @param ctx the parse tree
	 */
	void exitNot_(STLParser.Not_Context ctx);
	/**
	 * Enter a parse tree produced by the {@code GT_}
	 * labeled alternative in {@link STLParser#relop}.
	 * @param ctx the parse tree
	 */
	void enterGT_(STLParser.GT_Context ctx);
	/**
	 * Exit a parse tree produced by the {@code GT_}
	 * labeled alternative in {@link STLParser#relop}.
	 * @param ctx the parse tree
	 */
	void exitGT_(STLParser.GT_Context ctx);
	/**
	 * Enter a parse tree produced by the {@code LT_}
	 * labeled alternative in {@link STLParser#relop}.
	 * @param ctx the parse tree
	 */
	void enterLT_(STLParser.LT_Context ctx);
	/**
	 * Exit a parse tree produced by the {@code LT_}
	 * labeled alternative in {@link STLParser#relop}.
	 * @param ctx the parse tree
	 */
	void exitLT_(STLParser.LT_Context ctx);
	/**
	 * Enter a parse tree produced by the {@code GE_}
	 * labeled alternative in {@link STLParser#relop}.
	 * @param ctx the parse tree
	 */
	void enterGE_(STLParser.GE_Context ctx);
	/**
	 * Exit a parse tree produced by the {@code GE_}
	 * labeled alternative in {@link STLParser#relop}.
	 * @param ctx the parse tree
	 */
	void exitGE_(STLParser.GE_Context ctx);
	/**
	 * Enter a parse tree produced by the {@code LE_}
	 * labeled alternative in {@link STLParser#relop}.
	 * @param ctx the parse tree
	 */
	void enterLE_(STLParser.LE_Context ctx);
	/**
	 * Exit a parse tree produced by the {@code LE_}
	 * labeled alternative in {@link STLParser#relop}.
	 * @param ctx the parse tree
	 */
	void exitLE_(STLParser.LE_Context ctx);
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