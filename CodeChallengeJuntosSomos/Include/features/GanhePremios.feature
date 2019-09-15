#Author: tinaleidl@gmail.com
# Feature: Lista de cenários.
# Cenário: Regra de negócios por etapas 
#Given: Pré-condição
#Quando: Ações principais
#Then: Resultados ou validação
# And, But: Enumerar mais etapas Dado, Quando e Então
## (Comentários)

Feature: Ganhe Prêmios
	Eu como usuário, desejo realizar o acesso ao Menu Ganhe Prêmios na Home da aplicação
	Para que eu possa ter acesso as informações da página Ganhe Prêmios
	
	@web
	Scenario Outline: O usuário pode ter acesso a página Ganhe Prêmios da aplicação
		Given que eu tenha acesso a Home da aplicação
		When o usuário clicar no menu Ganhe Prêmios da aplicação
		Then a página Ganhe Prêmios é exibida
