grammar STL;

//开始的变量
prog: form perturbation* EOF # Program_ ;

    form
        : NAME '=' expr # Formula_ ;
    expr: monocularTemporalop expr # EventualAlways_
        | NOT expr # NotExpr
        | expr (AND|OR|IMPLY|until)  expr # AndOrImplyUntil_
        | LPAREN expr RPAREN # Parens_
        | Signal (GT| LT| GE| LE) (NUMBER|NNUMBER) # Predicates_;

    monocularTemporalop: (F|G) LB NUMBER COMMA NUMBER RB  # MonocularTemporalop_;
   // always: G LB NUMBER COMMA NUMBER RB  # Always_;
    until: U LB NUMBER COMMA NUMBER RB  # Until_;
    //interval:LB NUMBER COMMA NUMBER RB # Interval_;
    //intvalue: NUMBER;//不考虑时间区间值为变量的情况

    perturbation : SignalPert '=' (NUMBER|NNUMBER) # Perturbation_;

    //realnum:  ;

/**Tokens**/
//operators
AND: 'AND';
OR: 'OR';
IMPLY:'-->';
NOT:'NOT';
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








