#Author: tinaleidl@gmail.com
# Feature: Lista de cenários.
# Cenário: Regra de negócios por etapas 
#Given: Pré-condição
#Quando: Ações principais
#Then: Resultados ou validação
# And, But: Enumerar mais etapas Dado, Quando e Então
## (Comentários)

Feature: Sobre
	Eu como usuário, desejo realizar o acesso ao Menu Sobre na Home da aplicação
	Para que eu possa ter acesso as informações da página Sobre
	
	@web
	Scenario Outline: O usuário pode ter acesso a página Sobre da aplicação
		Given que eu tenha acesso a Home da aplicação
		When o usuário clicar no menu Sobre da Home da aplicação
		Then a página Sobre é exibida