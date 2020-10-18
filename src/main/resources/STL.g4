grammar STL;

//开始的变量
prog: form perturbation* EOF # Program_ ;

    form
        : NAME '=' expr # Formula_ ;
    expr: (eventually|always) expr # EventualAlways_
        | expr (AND|OR|IMPLY|until)  expr # AndOrImplyUntil_
        | LPAREN expr RPAREN # Parens_
        | Signal relop realnum # Predicates_;

    eventually: F interval # Eventually_;
    always: G interval # Always_;
    until: U interval # Until_;
    interval:LB intvalue COMMA intvalue RB # Interval_;
    intvalue: NUMBER|Letter # IntValue_;
    relop: GT| LT| GE| LE ;

    perturbation : SignalPert '=' realnum # Perturbation_;

    realnum: NUMBER|NNUMBER ;

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

SpaceOrTab: [ \t\n]+ -> skip;
Comment: '--' ~[\r\n]* ->skip;
Letter : [a-zA-Z];
LPAREN
   : '('
   ;
LINEJUMP: '\n';

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
SignalPert: Signal'_pert';








