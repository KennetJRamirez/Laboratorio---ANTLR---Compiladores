// Generated from C:/Users/Joab Ramirez/Desktop/Laboratorio Compiladores/LabCompiladores/src/operaciones_aritmeticas_ejercicio1/GramaticaExpresiones.g4 by ANTLR 4.13.1
package operaciones_aritmeticas_ejercicio1;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link GramaticaExpresionesParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface GramaticaExpresionesVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link GramaticaExpresionesParser#equation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEquation(GramaticaExpresionesParser.EquationContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaExpresionesParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(GramaticaExpresionesParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaExpresionesParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(GramaticaExpresionesParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaExpresionesParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(GramaticaExpresionesParser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaExpresionesParser#signedAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSignedAtom(GramaticaExpresionesParser.SignedAtomContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaExpresionesParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtom(GramaticaExpresionesParser.AtomContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaExpresionesParser#scientific}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScientific(GramaticaExpresionesParser.ScientificContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaExpresionesParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(GramaticaExpresionesParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaExpresionesParser#relop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelop(GramaticaExpresionesParser.RelopContext ctx);
}