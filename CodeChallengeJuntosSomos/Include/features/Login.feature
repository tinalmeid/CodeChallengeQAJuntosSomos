#Author: tinaleidl@gmail.com
# Feature: Lista de cenários.
# Cenário: Regra de negócios por etapas 
#Given: Pré-condição
#Quando: Ações principais
#Then: Resultados ou validação
# And, But: Enumerar mais etapas Dado, Quando e Então
## (Comentários)

Feature: Login
	Eu como usuário, desejo realizar o login
	Para que eu possa ter acesso as funcionalidades da aplicação
	
	@web
	Scenario Outline: O usuário pode realizar seu login na aplicação
		Given que eu estou no card de login
		When o usuário realizar login com usuário válido
		Then o login é realizado com sucesso
