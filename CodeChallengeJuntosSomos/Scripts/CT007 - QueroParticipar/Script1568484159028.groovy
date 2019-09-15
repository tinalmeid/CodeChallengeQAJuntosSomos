import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

//Abre navegador e navega para pagina da aplicacao
CustomKeywords.'home.AcessarHome.refreshBrowser'()

//Acessa o menu Entrar na Home da aplicacao
WebUI.click(findTestObject('PageHome/btnQueroParticipar'))
WebUI.delay(GlobalVariable.timeOutSmall)

//Verifica Objeto presente card Quero Cadastrar
Object titleCardParticipar = 'Participar/frameQualProfissao'
String hintTitleParticipar = 'Qual é a sua profissão?'
WebUI.verifyElementPresent(findTestObject(titleCardParticipar), GlobalVariable.timeOutSmall)

Object radioTrabalhaLoja = 'Participar/labelTrabalhoLoja'
String hintTrabalhoLoja = 'Trabalho em loja de materiais de construção'
WebUI.verifyElementPresent(findTestObject(radioTrabalhaLoja), GlobalVariable.timeOutSmall)
def textRadioTrabalhoLoja = WebUI.getText(findTestObject(radioTrabalhaLoja))
println(textRadioTrabalhoLoja)
boolean validaRadioTrabalhoLoja = WebUI.verifyEqual(textRadioTrabalhoLoja, hintTrabalhoLoja)
if (validaRadioTrabalhoLoja == true) {
	println('Passou')
} else {
	println('Erro Titulo Card Quero Participar')
}

Object radioTrabalhaObras = 'Participar/labelTrabalhoObras'
String hintTrabalhoObras = 'Trabalho em obras ou reformas'
WebUI.verifyElementPresent(findTestObject(radioTrabalhaObras), GlobalVariable.timeOutSmall)
def textRadioTrabalhoObras = WebUI.getText(findTestObject(radioTrabalhaObras))
println(textRadioTrabalhoObras)
boolean validaRadioTrabalhoObras = WebUI.verifyEqual(textRadioTrabalhoObras, hintTrabalhoObras)
if (validaRadioTrabalhoObras == true) {
	println('Passou')
} else {
	println('Erro Titulo Card Quero Participar')
}

Object btnParticipar = 'Participar/btnParticipar'
String hintBtnParticipar = 'Participar agora'
WebUI.verifyElementPresent(findTestObject(btnParticipar), GlobalVariable.timeOutSmall)
def textBtnParticipar = WebUI.getText(findTestObject(btnParticipar))
println(textBtnParticipar)
boolean validaBtnParticipar = WebUI.verifyEqual(textBtnParticipar, hintBtnParticipar)
if (validaBtnParticipar == true) {
	println('Passou')
} else {
	println('Erro Titulo Card Quero Participar')
}