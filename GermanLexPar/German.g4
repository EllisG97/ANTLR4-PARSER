grammar German;

@header {
package GermanLexPar;
}

program: globals* funcDeclare+;


fragment LCASE : [a-z];
fragment UCASE : [A-Z];
fragment DIGIT : [0-9];


POINT: '.';
COMMA: ',';
ENDLINE: '¬';

SYMBOL: '!'|':'|'@';

BLOCKSTART: '[';
BLOCKEND: ']';


COMPARATOR: '<'|'<='|'=>'|'>'|'=='|'!=';
OPERATOR: '+'|'-'|'/'|'*'|'%';

TYPE : 'schweben'|'schnur'|'boolean';  //Schweben = Float, Schnur = String
LETTER: LCASE|UCASE;
WORD: LETTER+ DIGIT+;
BOOLEAN: 'wahr'|'falsch';    // Wahr = True, Falsch = False
NUMBER: DIGIT+ POINT DIGIT+;

WHITESPACE: [ \n ];

CLEARSCREEN: 'Bildschirm sauber!';    // Translates to Screen Clean 

CLOSEPROGRAM: 'Auf Wiedersehen';     // 'Goodbye'



string:
	'~'(WORD|NUMBER|SYMBOL|WHITESPACE)*'~';
	
value:
	NUMBER|BOOLEAN|WORD|string;
	




return:
	 value 'ist zurückgekommen' ENDLINE;     // 'Is Returned' 

globals:

	value 'ist ein' TYPE 'namens' WORD 'welches ist weltweit' ENDLINE;  // is a...called...which is global

funcDeclare:
	TYPE WORD '(' (TYPE WORD COMMA?)* ')'
	BLOCKSTART
		statement+
		return
	BLOCKEND;
	
maths:
	(NUMBER) OPERATOR (NUMBER) ENDLINE;
	
stringOp:
    (WORD) OPERATOR (WORD) ENDLINE;
	
funcCall:
	WORD '('(WORD COMMA?)*')'ENDLINE;

declaration:
	TYPE WORD (COMMA WORD)* ENDLINE;

stringAssignment:
	string 'ein' TYPE 'namens' WORD ENDLINE;

intAssignment:
    NUMBER 'eine' TYPE 'namens' WORD ENDLINE;
    
boolAssignment:
    BOOLEAN 'ein' TYPE 'namens' WORD ENDLINE;
	
assignment:
    WORD '=' value ENDLINE | WORD ' = ' WORD ' + ' WORD ENDLINE;	

comparison:
	value COMPARATOR value;

output:
	'anzeige (~'(string '+' value WORD+)'~)'ENDLINE | 'anzeige ('(WORD+)')'ENDLINE ; //anzeige = display 
	
input:
	'benutzereingabe' ENDLINE; // benutzereingabe = user input

doWhile: 
	'während ('comparison (('und'|'oder') comparison)*')'  //while... and|or
	'do'                                                   //same as english 
	BLOCKSTART
		statement+
	BLOCKEND  ENDLINE;


cases:
	('fall' comparison ':' | 'fall' WORD ':' )//case
	BLOCKSTART
		statement+
		'brechen' ENDLINE  //break
	BLOCKEND;
	

whileLoop:
	'während ('comparison (('und'|'oder')comparison)*')'
	BLOCKSTART
		statement+
	BLOCKEND;

forLoop:
	'für (' WORD ' schweben  = ' value  |  value COMPARATOR value  |  maths  | WORD COMPARATOR value ')'  //for 
	BLOCKSTART
		statement+
	BLOCKEND;

ifState:
	'ob ('comparison (('und'|'oder')comparison)*')'    //if
	'dann'
		statement+;
	
elseif:
	'sonst wenn ('comparison (('und'|'oder')comparison)*')'   // otherwise if
	'dann'
		statement+;

elseState:
	'sonst'  //else/otherwise... otherwise is more common in german so translation is a little off
	'dann'
		statement+;


arrayDec:
	'{'value'}' 'ist eine' TYPE  'ansammlung namens' WORD  ENDLINE; //again a bit of an iffy translation as ansammlung means collection

arrayAssign:
	WORD '{'value'} = 'value ENDLINE;

statement:
	funcCall
	|declaration
	|stringAssignment
	|intAssignment
	|boolAssignment
	|assignment
	|output
	|input
	|cases
	|ifState
	|elseif
	|elseState
	|arrayDec
	|arrayAssign
	|maths
	|return	
	|whileLoop  
	|forLoop     
	|doWhile   
	|stringOp;




