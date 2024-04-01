grammar SQL;
// Lexer rules
CREATE          : 'CREATE';
TABLE           : 'TABLE';
INT             : 'INT';
PRIMARY         : 'PRIMARY';
KEY             : 'KEY';
TEXT            : 'TEXT';
INSERT          : 'INSERT';
INTO            : 'INTO';
VALUES          : 'VALUES';
SELECT          : 'SELECT';
FROM            : 'FROM';
WHERE           : 'WHERE';
GT              : '>';
NUMBER_LITERAL  : [0-9]+;
STRING_LITERAL  : '\'' ( ~'\'' | '\'\'')* '\'';
ID              : [a-zA-Z_][a-zA-Z0-9_]*;
COMMA           : ',';
LPAREN          : '(';
RPAREN          : ')';
SEMICOLON       : ';';
WS              : [ \t\r\n]+ -> skip;

// Parser rules
sqlStatement
    : createTableStatement
    | insertStatement
    | selectStatement
    ;

createTableStatement
    : CREATE TABLE ID LPAREN columnDefinition (COMMA columnDefinition)* RPAREN SEMICOLON
    ;

columnDefinition
    : ID dataType (PRIMARY KEY)?
    ;

dataType
    : INT
    | TEXT
    ;

insertStatement
    : INSERT INTO ID LPAREN ID (COMMA ID)* RPAREN VALUES LPAREN literalValue (COMMA literalValue)* RPAREN SEMICOLON
    ;

literalValue
    : NUMBER_LITERAL
    | STRING_LITERAL
    ;

selectStatement
    : SELECT '*' FROM ID (WHERE expression)?
    ;

expression
    : ID GT NUMBER_LITERAL
    ;