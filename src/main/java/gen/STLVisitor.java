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
	 * Visit a parse tree produced by the {@code Imply_}
	 * labeled alternative in {@link STLParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImply_(STLParser.Imply_Context ctx);
	/**
	 * Visit a parse tree produced by the {@code Until_}
	 * labeled alternative in {@link STLParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUntil_(STLParser.Until_Context ctx);
	/**
	 * Visit a parse tree produced by the {@code And_}
	 * labeled alternative in {@link STLParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd_(STLParser.And_Context ctx);
	/**
	 * Visit a parse tree produced by the {@code UnaryExpression_}
	 * labeled alternative in {@link STLParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpression_(STLParser.UnaryExpression_Context ctx);
	/**
	 * Visit a parse tree produced by the {@code Parens_}
	 * labeled alternative in {@link STLParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParens_(STLParser.Parens_Context ctx);
	/**
	 * Visit a parse tree produced by the {@code Or_}
	 * labeled alternative in {@link STLParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOr_(STLParser.Or_Context ctx);
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
	 * Visit a parse tree produced by the {@code Global_}
	 * labeled alternative in {@link STLParser#global}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobal_(STLParser.Global_Context ctx);
	/**
	 * Visit a parse tree produced by the {@code Not_}
	 * labeled alternative in {@link STLParser#not}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNot_(STLParser.Not_Context ctx);
	/**
	 * Visit a parse tree produced by the {@code GT_}
	 * labeled alternative in {@link STLParser#relop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGT_(STLParser.GT_Context ctx);
	/**
	 * Visit a parse tree produced by the {@code LT_}
	 * labeled alternative in {@link STLParser#relop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLT_(STLParser.LT_Context ctx);
	/**
	 * Visit a parse tree produced by the {@code GE_}
	 * labeled alternative in {@link STLParser#relop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGE_(STLParser.GE_Context ctx);
	/**
	 * Visit a parse tree produced by the {@code LE_}
	 * labeled alternative in {@link STLParser#relop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLE_(STLParser.LE_Context ctx);
	/**
	 * Visit a parse tree produced by the {@code Perturbation_}
	 * labeled alternative in {@link STLParser#perturbation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPerturbation_(STLParser.Perturbation_Context ctx);
}