


grammar foplGram;

@header {
package assignmentLexPar;
}

prog: globals* funcDeclare+;

string:
	'#'(WORD|NUMBER|SYMBOL|WS)*'#';
value:
	NUMBER|BOOLVAL|WORD|string;
operation:
	(NUMBER|WORD) OPERATOR (NUMBER|WORD);

rtn:
	'return' value TERM;

globals:
	TYPE WORD ('=' value)? '::global'TERM;

funcDeclare:
	TYPE WORD '(' (TYPE WORD COMMA?)* ')'
	BLOCKOPEN
		statement+
		rtn
	BLOCKCLOSE;

funcCall:
	WORD '('(WORD COMMA?)*')'TERM;

varDec:
	TYPE WORD (COMMA WORD)* TERM;

assignment:
	WORD '=' value TERM
	|WORD '=' WORD '+' WORD TERM;

comparison:
	value COMPARATOR value;

output:
	'out('( string ('+' value WORD)?)*')'TERM;
	
input:
	'in('WORD')'TERM;

doWhile:
	'do'
	BLOCKOPEN
		statement+
	BLOCKCLOSE 'while ('comparison (('and'|'or') comparison)*')' TERM;

routeCaseroute:
	'route(' WORD ')'
	BLOCKOPEN
		rCase*
		def
	BLOCKCLOSE;
rCase:
	'case' comparison ':'
	BLOCKOPEN
		statement+
		'drop' TERM
	BLOCKCLOSE;
def:
	'def :'
	BLOCKOPEN
		statement+
	BLOCKCLOSE;

whileLoop:
	'while ('comparison (('and'|'or')comparison)*')'
	BLOCKOPEN
		statement+
	BLOCKCLOSE;

forLoop:
	'for (float' WORD '=' value '->' value COMPARATOR value '->' assignment ')'
	BLOCKOPEN
		statement+
	BLOCKCLOSE;

ifState:
	'if ('comparison (('and'|'or')comparison)*')'
	BLOCKOPEN
		statement+
	BLOCKCLOSE;
elseif:
	'elseif ('comparison (('and'|'or')comparison)*')'
	BLOCKOPEN
		statement+
	BLOCKCLOSE;
elseState:
	'else'
	BLOCKOPEN
		statement+
	BLOCKCLOSE;

arrayDec:
	'array' WORD '['value']' TERM;

arrayAssign:
	WORD '['value arrayMid value TERM;
	
arrayMid:
	'] = '; 



statement:
	funcCall
	|varDec
	|assignment
	|output
	|input
	|doWhile
	|routeCaseroute
	|rCase
	|def
	|whileLoop
	|forLoop
	|ifState
	|elseif
	|elseState
	|arrayDec
	|arrayAssign
	|operation
	|rtn;

fragment LCASE : [a-z];
fragment UCASE : [A-Z];
fragment DIGIT : [0-9];

POINT: '.';
COMMA: ',';
TERM: ';';

SYMBOL: '!'|':'|'@';

COMPARATOR: '~'|'^='|'=~'|'^'|'=='|'!=';
OPERATOR: '+'|'-'|'/'|'*'|'%';

TYPE : 'float'|'string'|'boolean';
LETTER: LCASE|UCASE;
WORD: LETTER+;
BOOLVAL: 'true'|'false';
NUMBER: DIGIT+ POINT DIGIT+;

BLOCKOPEN: '{';
BLOCKCLOSE: '}';
WS: [ \n\t\r] -> skip;


