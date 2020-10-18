// Generated from /Users/jun/Documents/project/STL/src/main/resources/STL.g4 by ANTLR 4.8
package gen;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link STLParser}.
 */
public interface STLListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link STLParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(STLParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link STLParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(STLParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link STLParser#formula}.
	 * @param ctx the parse tree
	 */
	void enterFormula(STLParser.FormulaContext ctx);
	/**
	 * Exit a parse tree produced by {@link STLParser#formula}.
	 * @param ctx the parse tree
	 */
	void exitFormula(STLParser.FormulaContext ctx);
	/**
	 * Enter a parse tree produced by {@link STLParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(STLParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link STLParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(STLParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link STLParser#eventually}.
	 * @param ctx the parse tree
	 */
	void enterEventually(STLParser.EventuallyContext ctx);
	/**
	 * Exit a parse tree produced by {@link STLParser#eventually}.
	 * @param ctx the parse tree
	 */
	void exitEventually(STLParser.EventuallyContext ctx);
	/**
	 * Enter a parse tree produced by {@link STLParser#always}.
	 * @param ctx the parse tree
	 */
	void enterAlways(STLParser.AlwaysContext ctx);
	/**
	 * Exit a parse tree produced by {@link STLParser#always}.
	 * @param ctx the parse tree
	 */
	void exitAlways(STLParser.AlwaysContext ctx);
	/**
	 * Enter a parse tree produced by {@link STLParser#until}.
	 * @param ctx the parse tree
	 */
	void enterUntil(STLParser.UntilContext ctx);
	/**
	 * Exit a parse tree produced by {@link STLParser#until}.
	 * @param ctx the parse tree
	 */
	void exitUntil(STLParser.UntilContext ctx);
	/**
	 * Enter a parse tree produced by {@link STLParser#interval}.
	 * @param ctx the parse tree
	 */
	void enterInterval(STLParser.IntervalContext ctx);
	/**
	 * Exit a parse tree produced by {@link STLParser#interval}.
	 * @param ctx the parse tree
	 */
	void exitInterval(STLParser.IntervalContext ctx);
	/**
	 * Enter a parse tree produced by {@link STLParser#intvalue}.
	 * @param ctx the parse tree
	 */
	void enterIntvalue(STLParser.IntvalueContext ctx);
	/**
	 * Exit a parse tree produced by {@link STLParser#intvalue}.
	 * @param ctx the parse tree
	 */
	void exitIntvalue(STLParser.IntvalueContext ctx);
	/**
	 * Enter a parse tree produced by {@link STLParser#predicates}.
	 * @param ctx the parse tree
	 */
	void enterPredicates(STLParser.PredicatesContext ctx);
	/**
	 * Exit a parse tree produced by {@link STLParser#predicates}.
	 * @param ctx the parse tree
	 */
	void exitPredicates(STLParser.PredicatesContext ctx);
	/**
	 * Enter a parse tree produced by {@link STLParser#relop}.
	 * @param ctx the parse tree
	 */
	void enterRelop(STLParser.RelopContext ctx);
	/**
	 * Exit a parse tree produced by {@link STLParser#relop}.
	 * @param ctx the parse tree
	 */
	void exitRelop(STLParser.RelopContext ctx);
	/**
	 * Enter a parse tree produced by {@link STLParser#perturbation_list}.
	 * @param ctx the parse tree
	 */
	void enterPerturbation_list(STLParser.Perturbation_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link STLParser#perturbation_list}.
	 * @param ctx the parse tree
	 */
	void exitPerturbation_list(STLParser.Perturbation_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link STLParser#realnum}.
	 * @param ctx the parse tree
	 */
	void enterRealnum(STLParser.RealnumContext ctx);
	/**
	 * Exit a parse tree produced by {@link STLParser#realnum}.
	 * @param ctx the parse tree
	 */
	void exitRealnum(STLParser.RealnumContext ctx);
}