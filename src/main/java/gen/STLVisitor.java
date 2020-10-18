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
	 * Visit a parse tree produced by the {@code Program_}
	 * labeled alternative in {@link STLParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram_(STLParser.Program_Context ctx);
	/**
	 * Visit a parse tree produced by the {@code Formula_}
	 * labeled alternative in {@link STLParser#form}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormula_(STLParser.Formula_Context ctx);
	/**
	 * Visit a parse tree produced by the {@code EventualAlways_}
	 * labeled alternative in {@link STLParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEventualAlways_(STLParser.EventualAlways_Context ctx);
	/**
	 * Visit a parse tree produced by the {@code Parens_}
	 * labeled alternative in {@link STLParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParens_(STLParser.Parens_Context ctx);
	/**
	 * Visit a parse tree produced by the {@code AndOrImplyUntil_}
	 * labeled alternative in {@link STLParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndOrImplyUntil_(STLParser.AndOrImplyUntil_Context ctx);
	/**
	 * Visit a parse tree produced by the {@code Predicates_}
	 * labeled alternative in {@link STLParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPredicates_(STLParser.Predicates_Context ctx);
	/**
	 * Visit a parse tree produced by the {@code Eventually_}
	 * labeled alternative in {@link STLParser#eventually}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEventually_(STLParser.Eventually_Context ctx);
	/**
	 * Visit a parse tree produced by the {@code Always_}
	 * labeled alternative in {@link STLParser#always}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlways_(STLParser.Always_Context ctx);
	/**
	 * Visit a parse tree produced by the {@code Until_}
	 * labeled alternative in {@link STLParser#until}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUntil_(STLParser.Until_Context ctx);
	/**
	 * Visit a parse tree produced by the {@code Interval_}
	 * labeled alternative in {@link STLParser#interval}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterval_(STLParser.Interval_Context ctx);
	/**
	 * Visit a parse tree produced by {@link STLParser#intvalue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntvalue(STLParser.IntvalueContext ctx);
	/**
	 * Visit a parse tree produced by {@link STLParser#relop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelop(STLParser.RelopContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Perturbation_}
	 * labeled alternative in {@link STLParser#perturbation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPerturbation_(STLParser.Perturbation_Context ctx);
	/**
	 * Visit a parse tree produced by {@link STLParser#realnum}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRealnum(STLParser.RealnumContext ctx);
}