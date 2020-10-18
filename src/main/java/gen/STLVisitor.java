// Generated from /Users/jun/Documents/project/STL/src/main/resources/STL.g4 by ANTLR 4.8
package gen;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link STLParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface STLVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link STLParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(STLParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link STLParser#formula}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormula(STLParser.FormulaContext ctx);
	/**
	 * Visit a parse tree produced by {@link STLParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(STLParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link STLParser#eventually}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEventually(STLParser.EventuallyContext ctx);
	/**
	 * Visit a parse tree produced by {@link STLParser#always}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlways(STLParser.AlwaysContext ctx);
	/**
	 * Visit a parse tree produced by {@link STLParser#until}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUntil(STLParser.UntilContext ctx);
	/**
	 * Visit a parse tree produced by {@link STLParser#interval}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterval(STLParser.IntervalContext ctx);
	/**
	 * Visit a parse tree produced by {@link STLParser#intvalue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntvalue(STLParser.IntvalueContext ctx);
	/**
	 * Visit a parse tree produced by {@link STLParser#predicates}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPredicates(STLParser.PredicatesContext ctx);
	/**
	 * Visit a parse tree produced by {@link STLParser#relop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelop(STLParser.RelopContext ctx);
	/**
	 * Visit a parse tree produced by {@link STLParser#perturbation_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPerturbation_list(STLParser.Perturbation_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link STLParser#realnum}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRealnum(STLParser.RealnumContext ctx);
}