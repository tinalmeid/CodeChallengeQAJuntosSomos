#Author: tinaleidl@gmail.com
# Feature: Lista de cenários.
# Cenário: Regra de negócios por etapas 
#Given: Pré-condição
#Quando: Ações principais
#Then: Resultados ou validação
# And, But: Enumerar mais etapas Dado, Quando e Então
## (Comentários)

Feature: Login
	Eu como usuário, desejo informar o login
	Para que eu possa realizar login na aplicação
	
	@web
	Scenario Outline: O usuário pode informar seu login para acesso a aplicação
		Given que eu tenha acesso a Home da aplicação
		When o usuário clicar no menu Entrar
		Then o card para informar usuário e senha é exibido