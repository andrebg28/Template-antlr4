package com.andrebg28.template.app;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import com.andrebg28.template.parser.HelloBaseListener;
import com.andrebg28.template.parser.HelloParser;



public class HelloWalker extends HelloBaseListener {
  public void enterLinha(HelloParser.LinhaContext ctx ) {
    System.out.println( "Entering ID : " + ctx.ID().getText() );
    System.out.println( "Entering OLA : " + ctx.OLA().getText() );
    //System.out.println( "Entering WORLD : " + ctx.MUNDO().getText() );
  }

  public void exitLinha(HelloParser.LinhaContext ctx ) {
    System.out.println( "Exiting R" );
  }
  
  public void enterEveryRule(ParserRuleContext ctx) {
	  System.out.println("Entrada RULE: \t" +  ctx.getText() );
  }

 public void exitEveryRule(ParserRuleContext ctx) { 
	 
 }

 public void visitTerminal(TerminalNode node) { 
	 System.out.println("Entrada NODE: \t" + node.getText() );
 }

 public void visitErrorNode(ErrorNode node) { 
	 
 }
}