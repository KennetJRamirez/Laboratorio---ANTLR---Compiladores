// Generated from C:/Users/Joab Ramirez/Desktop/Laboratorio Compiladores/LabCompiladores/src/operaciones_aritmeticas_ejercicio1/GramaticaExpresiones.g4 by ANTLR 4.13.1
package operaciones_aritmeticas_ejercicio1;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GramaticaExpresionesParser}.
 */
public interface GramaticaExpresionesListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GramaticaExpresionesParser#equation}.
	 * @param ctx the parse tree
	 */
	void enterEquation(GramaticaExpresionesParser.EquationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaExpresionesParser#equation}.
	 * @param ctx the parse tree
	 */
	void exitEquation(GramaticaExpresionesParser.EquationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaExpresionesParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(GramaticaExpresionesParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaExpresionesParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(GramaticaExpresionesParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaExpresionesParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(GramaticaExpresionesParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaExpresionesParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(GramaticaExpresionesParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaExpresionesParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(GramaticaExpresionesParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaExpresionesParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(GramaticaExpresionesParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaExpresionesParser#signedAtom}.
	 * @param ctx the parse tree
	 */
	void enterSignedAtom(GramaticaExpresionesParser.SignedAtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaExpresionesParser#signedAtom}.
	 * @param ctx the parse tree
	 */
	void exitSignedAtom(GramaticaExpresionesParser.SignedAtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaExpresionesParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom(GramaticaExpresionesParser.AtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaExpresionesParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom(GramaticaExpresionesParser.AtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaExpresionesParser#scientific}.
	 * @param ctx the parse tree
	 */
	void enterScientific(GramaticaExpresionesParser.ScientificContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaExpresionesParser#scientific}.
	 * @param ctx the parse tree
	 */
	void exitScientific(GramaticaExpresionesParser.ScientificContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaExpresionesParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(GramaticaExpresionesParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaExpresionesParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(GramaticaExpresionesParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaExpresionesParser#relop}.
	 * @param ctx the parse tree
	 */
	void enterRelop(GramaticaExpresionesParser.RelopContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaExpresionesParser#relop}.
	 * @param ctx the parse tree
	 */
	void exitRelop(GramaticaExpresionesParser.RelopContext ctx);
}