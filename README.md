# Template antlr4

Um modelo para iniciar um projeto antlr4.

## IDE

Esse projeto/template foi desenvolvido no eclipse.

### Ferramentas recomendadas

Para geração automática dos arquivos que compõem o analisador, instale o plugin ANTLR 4 IDE. Ele faz com que o antlr4 gere o analisador todas as vezes em que você salvar a sua gramatica.

Na data da criação desse projeto/template, a versão disponível era a 0.3.6 ( ANTLR 4 IDE 0.3.6 ).

### Instalando

Para instalar o ANTLR 4 IDE, siga os passos:

1- Na barra de menu do eclipse, selecione "Help > Eclipse Marketplace..."

2- Na aba “Search”, no campo “Find”, pesquise por: antlr 4 ide.

3- Procure na lista o plugin desejado e clique em instalar.



## Arquivos e configurações

O projeto já possui uma gramatica de exemplo chamada "Hello.g4", localizada em src/main/antl4. Substitua arquivo pelo seu, com o nome que julgar conveniente, mantendo apenas a extensão do arquivo como ".g4".

O nome da gramatica deve ser configurado no "pompom", na tag "grammars" e o local onde o analisador sera gerado deve ser configurado na tag "outputDirectory", ambos no plugin "antlr4-maven-plugin".

``

	...
	<plugin>
		<groupId>org.antlr</groupId>
		<artifactId>antlr4-maven-plugin</artifactId>
		<version>${antlr.version}</version>
		<configuration>
			* <grammars>Hello.g4</grammars>
			<visitor>true</visitor>
			<listener>true</listener>
			* <outputDirectory>src/main/java/com/andrebg28/parser</outputDirectory>
		</configuration>
		<executions>
			<execution>
				<goals>
					<goal>antlr4</goal>
				</goals>
			</execution>
		</executions>
	</plugin>

	...

``

Ao atualizar o nome da gramatica,lembre-se de atualizar a primeira linha dentro do minha_gramatica.g4 para que correspondam ao mesmo nome.

Exemplo:
Arquivo: "minha_gramatica.g4"

`` 
	grammar minha_gramatica;
`` 

Por fim atribua o pacote da gramatica em minha_gramatica.g4.

``
	
	...
	@header{
		package com.andrebg28.template.parser;
	}
	...
``


