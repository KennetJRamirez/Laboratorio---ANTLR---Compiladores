// Generated from C:\Users\Joab Ramirez\Desktop\Laboratorio Compiladores\LabCompiladores\src\operaciones_aritmeticas_ejercicio1\GramaticaExpresiones.g4 by ANTLR 4.1
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GramaticaExpresionesParser}.
 */
public interface GramaticaExpresionesListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GramaticaExpresionesParser#signedAtom}.
	 * @param ctx the parse tree
	 */
	void enterSignedAtom(@NotNull GramaticaExpresionesParser.SignedAtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaExpresionesParser#signedAtom}.
	 * @param ctx the parse tree
	 */
	void exitSignedAtom(@NotNull GramaticaExpresionesParser.SignedAtomContext ctx);

	/**
	 * Enter a parse tree produced by {@link GramaticaExpresionesParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(@NotNull GramaticaExpresionesParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaExpresionesParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(@NotNull GramaticaExpresionesParser.ExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link GramaticaExpresionesParser#equation}.
	 * @param ctx the parse tree
	 */
	void enterEquation(@NotNull GramaticaExpresionesParser.EquationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaExpresionesParser#equation}.
	 * @param ctx the parse tree
	 */
	void exitEquation(@NotNull GramaticaExpresionesParser.EquationContext ctx);

	/**
	 * Enter a parse tree produced by {@link GramaticaExpresionesParser#scientific}.
	 * @param ctx the parse tree
	 */
	void enterScientific(@NotNull GramaticaExpresionesParser.ScientificContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaExpresionesParser#scientific}.
	 * @param ctx the parse tree
	 */
	void exitScientific(@NotNull GramaticaExpresionesParser.ScientificContext ctx);

	/**
	 * Enter a parse tree produced by {@link GramaticaExpresionesParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(@NotNull GramaticaExpresionesParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaExpresionesParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(@NotNull GramaticaExpresionesParser.VariableContext ctx);

	/**
	 * Enter a parse tree produced by {@link GramaticaExpresionesParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(@NotNull GramaticaExpresionesParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaExpresionesParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(@NotNull GramaticaExpresionesParser.TermContext ctx);

	/**
	 * Enter a parse tree produced by {@link GramaticaExpresionesParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(@NotNull GramaticaExpresionesParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaExpresionesParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(@NotNull GramaticaExpresionesParser.FactorContext ctx);

	/**
	 * Enter a parse tree produced by {@link GramaticaExpresionesParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom(@NotNull GramaticaExpresionesParser.AtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaExpresionesParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom(@NotNull GramaticaExpresionesParser.AtomContext ctx);

	/**
	 * Enter a parse tree produced by {@link GramaticaExpresionesParser#relop}.
	 * @param ctx the parse tree
	 */
	void enterRelop(@NotNull GramaticaExpresionesParser.RelopContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaExpresionesParser#relop}.
	 * @param ctx the parse tree
	 */
	void exitRelop(@NotNull GramaticaExpresionesParser.RelopContext ctx);
}