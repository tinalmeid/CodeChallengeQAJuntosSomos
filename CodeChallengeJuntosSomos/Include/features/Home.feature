#Author: tinaleidl@gmail.com
# Feature: Lista de cenários.
# Cenário: Regra de negócios por etapas 
#Given: Pré-condição
#Quando: Ações principais
#Then: Resultados ou validação
# And, But: Enumerar mais etapas Dado, Quando e Então
## (Comentários)

Feature: Home
	Eu como usuário, desejo realizar o acesso a Home da aplicação
	Para que eu possa ter acesso aos menus presentes na Home da aplicação
	
	@web
	Scenario Outline: O usuário pode ter acesso a Home da aplicação
		Given que eu tenho acesso a internet
		When o usuário informar a url principal da página da aplicação
		Then a página Home é exibida
		