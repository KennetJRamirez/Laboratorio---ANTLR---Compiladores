package sql_ejercicio2;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class MainSQL {
    public static void main(String[] args) throws Exception {
        // Crear un analizador léxico
        SQLLexer lexer = new SQLLexer(CharStreams.fromFileName("src/sql_ejercicio2/input2.txt"));

        // Crear un flujo de tokens para el analizador léxico
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        // Crear un analizador sintáctico
        SQLParser parser = new SQLParser(tokens);

        // Iniciar el análisis sintáctico desde la regla inicial 'sqlStatement'
        ParseTree tree = parser.sqlStatement();

        // Imprimir el árbol de análisis sintáctico generado
        System.out.println("Salida de la Expresion Procesada por ANTLR: ");
        System.out.println(tree.toStringTree(parser));
    }
}
