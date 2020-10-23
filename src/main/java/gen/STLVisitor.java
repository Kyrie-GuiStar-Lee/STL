// Generated from E:/STL/src/main/resources\STL.g4 by ANTLR 4.8
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
	 * Visit a parse tree produced by the {@code NotExpr}
	 * labeled alternative in {@link STLParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotExpr(STLParser.NotExprContext ctx);
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
	 * Visit a parse tree produced by the {@code MonocularTemporalop_}
	 * labeled alternative in {@link STLParser#monocularTemporalop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMonocularTemporalop_(STLParser.MonocularTemporalop_Context ctx);
	/**
	 * Visit a parse tree produced by the {@code Until_}
	 * labeled alternative in {@link STLParser#until}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUntil_(STLParser.Until_Context ctx);
	/**
	 * Visit a parse tree produced by the {@code Perturbation_}
	 * labeled alternative in {@link STLParser#perturbation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPerturbation_(STLParser.Perturbation_Context ctx);
}