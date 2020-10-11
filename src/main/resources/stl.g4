grammar stl;
@header {
 package cn.ecnu.tool.antlr;
}
//开始的变量
prog: formula epsilon EOF;

    formula
        : formulaName equal expr;
    formulaName: NAME;
    expr: eventually expr
        | always expr
        | expr AND expr
        | expr OR expr
        | expr IMPLY expr
        | expr until expr
        | predicates
        ;
    eventually: F interval;
    always: G interval;
    until: U interval;
    interval:LB intvalue COMMA intvalue RB;
    intvalue: PRealnumber|Letter;

    predicates
            :
            Signal relop Realnumber;
    relop
       : GT
       | LT
       | GE
       | LE
       ;

    epsilon
            :
            LINEJUMP
            | LINEJUMP NAME equal Realnumber epsilon;
    equal: Equal;

/**Tokens**/
//operators
AND: 'AND';
OR: 'OR';
IMPLY:'-->';
F:'F_';
G:'G_';
U:'U_';
LT: '<';
GT: '>';
LE: '<=';
GE: '>=';
Equal: '=' ;

SpaceOrTab: [ \t\n]+ -> skip;
Comment: '--' ~[\r\n]* ->skip;

Letter : [a-zA-Z];
LP:'(';
RP:')';
LB:'[';
RB:']';
COMMA:',';
LINEJUMP: [\n]+;

PRealnumber:('0' | [1-9][0-9]*)|([0-9]*'.'?[1-9][0-9]*);
NRealnumber:('-'?[1-9][0-9]*)|('-'?[1-9][0-9]*'.'?[1-9][0-9]*);
Realnumber: NRealnumber|PRealnumber;
NAME: Letter (Letter|[0-9]*|'_')*;
Signal: NAME'(t)';








