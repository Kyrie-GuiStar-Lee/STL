grammar STL;

//开始的变量
prog: form perturbation* EOF # Program_ ;

    form
        : NAME '=' expr # Formula_ ;
    expr: (eventually|global|not) # UnaryExpression_
        | expr AND expr # And_
        | expr OR expr # Or_
        | expr IMPLY expr # Imply_
        | expr U LB NUMBER COMMA NUMBER RB expr # Until_
        | LPAREN expr RPAREN # Parens_
        |  relop  # Predicates_;

    eventually: F LB NUMBER COMMA NUMBER RB expr  # Eventually_;
    global: G LB NUMBER COMMA NUMBER RB expr # Global_;
    not: NOT expr # Not_;
    relop:
       Signal GT (NUMBER|NNUMBER) #GT_
        | Signal LT (NUMBER|NNUMBER) #LT_
        | Signal GE (NUMBER|NNUMBER) #GE_
        | Signal LE (NUMBER|NNUMBER) #LE_;
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








