grammar stl;
@header {
 package cn.ecnu.tool.antlr;
}
//开始的变量
prog: expr+ EOF
    ;

    expr: F expr
        | G expr
        | expr AND expr
        | expr OR expr
        | expr IMPLY expr
        | expr U expr
        | predicates
        ;
    predicates
            :
            Signal relop Realnumber;
    relop
       : GT
       | LT
       | GE
       | LE
       ;

/**Tokens**/

Letter : [a-zA-Z];
Number :'0' | '-'?[1-9][0-9]*;
Realnumber:Number|Number*'.'?[1-9][0-9]*;
RealnumberP:[1-9][0-9]*|[1-9][0-9]*'.'?[1-9][0-9]*;
FormulaName:Letter(Letter|Number|'_'|SpaceOrTab)*;
SignalName: Letter(Letter|Number|'_');
Interval: '{'RealnumberP','RealnumberP'}';
Signal: SignalName'(t)';
EPSILON: (SpaceOrTab)*'='(SpaceOrTab)* Realnumber (SpaceOrTab)* ;
SpaceOrTab: [ \t\n]+ -> skip;
Comment: '--' ~[\r\n]* ->skip;
//operators
AND: 'AND';
OR: 'OR';
IMPLY:'-->';
F: 'F_'Interval;
G:'G_'Interval;
U:'U_'Interval;

LT: '<';
GT: '>';
LE: '<=';
GE: '>=';



