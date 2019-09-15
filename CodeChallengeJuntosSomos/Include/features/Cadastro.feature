#Author: tinaleidl@gmail.com
# Feature: Lista de cenários.
# Cenário: Regra de negócios por etapas 
#Given: Pré-condição
#Quando: Ações principais
#Then: Resultados ou validação
# And, But: Enumerar mais etapas Dado, Quando e Então
## (Comentários)

Feature: Quero Participar
	Eu como usuário, desejo realizar cadastro
	Para que eu possa ter login na aplicação
	
	@web
	Scenario Outline: O usuário pode cadastrar para ter login de acesso
		Given que eu tenha acesso a Home da aplicação
		When o usuário clicar no menu Quero Participar
		Then o card com opções de cadastro é exibido