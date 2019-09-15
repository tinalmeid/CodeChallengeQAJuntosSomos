#Author: tinaleidl@gmail.com
# Feature: Lista de cenários.
# Cenário: Regra de negócios por etapas 
#Given: Pré-condição
#Quando: Ações principais
#Then: Resultados ou validação
# And, But: Enumerar mais etapas Dado, Quando e Então
## (Comentários)

Feature: Loja virtual
	Eu como usuário, desejo realizar o acesso ao Menu Loja virtual na Home da aplicação
	Para que eu possa ter acesso as informações da página Loja virtual
	
	@web
	Scenario Outline: O usuário pode ter acesso a página Loja virtual da aplicação
		Given que eu tenha acesso a Home da aplicação
		When o usuário clicar no menu Loja virtual da aplicação
		Then a página Loja virtual é exibida em uma nova aba do browser