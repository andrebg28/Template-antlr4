package com.andrebg28.template.app;

import java.io.InputStream;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import com.andrebg28.template.parser.HelloLexer;
import com.andrebg28.template.parser.HelloParser;


public class App {
  public static void main( String[] args) throws Exception 
  {

      
    InputStream inputStream = App.class.getResourceAsStream("test.txt");
    //System.out.println(CharStreams.fromStream(inputStream));
    
    HelloLexer lexer = new HelloLexer( CharStreams.fromStream(inputStream) );
      
    
    CommonTokenStream tokens = new CommonTokenStream( lexer );
    HelloParser parser = new HelloParser( tokens );
    ParseTree tree = parser.linhas();
    ParseTreeWalker walker = new ParseTreeWalker();
    
    walker.walk( new HelloWalker(), tree );
    
  }
}
