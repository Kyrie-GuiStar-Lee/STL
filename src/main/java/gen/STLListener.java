// Generated from /Users/jun/Documents/project/STL/src/main/resources/STL.g4 by ANTLR 4.8
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
	 * Enter a parse tree produced by the {@code Always_}
	 * labeled alternative in {@link STLParser#always}.
	 * @param ctx the parse tree
	 */
	void enterAlways_(STLParser.Always_Context ctx);
	/**
	 * Exit a parse tree produced by the {@code Always_}
	 * labeled alternative in {@link STLParser#always}.
	 * @param ctx the parse tree
	 */
	void exitAlways_(STLParser.Always_Context ctx);
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
	 * Enter a parse tree produced by the {@code Interval_}
	 * labeled alternative in {@link STLParser#interval}.
	 * @param ctx the parse tree
	 */
	void enterInterval_(STLParser.Interval_Context ctx);
	/**
	 * Exit a parse tree produced by the {@code Interval_}
	 * labeled alternative in {@link STLParser#interval}.
	 * @param ctx the parse tree
	 */
	void exitInterval_(STLParser.Interval_Context ctx);
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
	 * Enter a parse tree produced by the {@code PerturbationList_}
	 * labeled alternative in {@link STLParser#perturbation_list}.
	 * @param ctx the parse tree
	 */
	void enterPerturbationList_(STLParser.PerturbationList_Context ctx);
	/**
	 * Exit a parse tree produced by the {@code PerturbationList_}
	 * labeled alternative in {@link STLParser#perturbation_list}.
	 * @param ctx the parse tree
	 */
	void exitPerturbationList_(STLParser.PerturbationList_Context ctx);
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