grammar PseudoCode;
ID: [a-zA-Z_][a-zA-Z0-9_-]*;
INTEGER: '-'? [0-9]+;
WS: [ \t\n\r]+ -> skip;

ADD: '+';
SUB: '-';
MUL: '*';
DIV: '/';

expr: INTEGER
    | ID
    | <assoc=left> expr ADD expr
    ;
stmt: assignment | dump;

declaration: ID ':' type;

assignment: ID '<-' expr;
dump: 'dump' expr;

INT_TYPE: 'int';
dynamicArrayType: 'int' '[' ']';
type: INT_TYPE | dynamicArrayType;


program: stmt*;
