// Generated from Hello.g4 by ANTLR 4.7.2

	package com.andrebg28.template.parser;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link HelloParser}.
 */
public interface HelloListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link HelloParser#linhas}.
	 * @param ctx the parse tree
	 */
	void enterLinhas(HelloParser.LinhasContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#linhas}.
	 * @param ctx the parse tree
	 */
	void exitLinhas(HelloParser.LinhasContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#linha}.
	 * @param ctx the parse tree
	 */
	void enterLinha(HelloParser.LinhaContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#linha}.
	 * @param ctx the parse tree
	 */
	void exitLinha(HelloParser.LinhaContext ctx);
}