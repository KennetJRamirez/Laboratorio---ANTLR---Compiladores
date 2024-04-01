package operaciones_aritmeticas_ejercicio1;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class MainAritmetico {
    public static void main(String[] args) throws Exception {
        // Crear un analizador léxico
        GramaticaExpresionesLexer lexer = new GramaticaExpresionesLexer(CharStreams.fromFileName("src/operaciones_aritmeticas_ejercicio1/input1.txt"));

        // Crear un flujo de tokens para el analizador léxico
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        // Crear un analizador sintáctico
        GramaticaExpresionesParser parser = new GramaticaExpresionesParser(tokens);

        // Iniciar el análisis sintáctico desde la regla inicial 'equation'
        ParseTree tree = parser.equation();

        // Imprimir el árbol de análisis sintáctico generado
        System.out.println("Salida de la Expresion Procesada por ANTLR: ");
        System.out.println(tree.toStringTree(parser));
    }
}
