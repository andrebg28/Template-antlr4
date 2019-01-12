grammar Hello;

@header{
	package com.andrebg28.template.parser;
}

linhas: linha+;
linha   : OLA MUNDO ID | OLA ID | OLA;
MUNDO : 'world';
OLA : 'hello'; 
ID  : [a-z]+ ;
WS  : [ \t\r\n]+ -> skip ;