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
        | expr AND  expr
        | expr OR expr
        | expr IMPLY  expr
        | expr  until  expr
        | LPAREN expr RPAREN
        | predicates
        ;
    eventually: F interval;
    always: G interval;
    until: U interval;
    interval:LB intvalue COMMA intvalue RB;
    intvalue
        : NUMBER
        |Letter
        ;

    predicates
            :
             Signal relop realnum ;
    relop
       : GT
       | LT
       | GE
       | LE
       ;

    epsilon
            :
            Signal equal realnum epsilon;
    equal: Equal;
    realnum: NUMBER|NNUMBER;

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
LINEJUMP:'\n';
LPAREN
   : '('
   ;


RPAREN
   : ')'
   ;

LB:'[';
RB:']';
COMMA
   : ','
   ;


 NUMBER
   : ('0' .. '9') + ('.' ('0' .. '9') +)?
   ;
 NNUMBER
   : '-'('0' .. '9') + ('.' ('0' .. '9') +)?
   ;
NAME
    : Letter (Letter|('0' .. '9')+|'_')*
    ;
Signal
    : NAME'(t)'
    ;








