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

//Verifica os Objetos do menu da Home da aplicacao
CustomKeywords.'home.AcessarHome.isElementPresent'()

//Valida text menu Sobre da Home da aplicacao
Object menuSobre = 'PageHome/menuSobre'
String textMenuSobre = 'Sobre'
def labelSobre = WebUI.getText(findTestObject(menuSobre))
println(labelSobre)
boolean validaLabelSobre = WebUI.verifyEqual(labelSobre, textMenuSobre)
if (validaLabelSobre == true) {
	println 'Passou'
} else
	{println 'Erro menu Sobre'}

//Valida text menu Junte Pontos da Home da aplicacao
Object menuJunte = 'PageHome/menuJuntePontos'
String textMenuJunte = 'Junte pontos'
def labelJunte = WebUI.getText(findTestObject(menuJunte))
println(labelJunte)
boolean validaLabelJunte = WebUI.verifyEqual(labelJunte, textMenuJunte)
if (validaLabelJunte == true) {
	println 'Passou'
} else
	{println 'Erro menu Junte pontos'}

//Valida text menu Ganhe Premios da Home da aplicacao
Object menuGanhe = 'PageHome/menuGanhePremios'
String textMenuGanhe = 'Ganhe prêmios'
def labelGanhe = WebUI.getText(findTestObject(menuGanhe))
println(labelGanhe)
boolean validaLabelGanhe = WebUI.verifyEqual(labelGanhe, textMenuGanhe)
if (validaLabelGanhe == true) {
	println 'Passou'
} else
	{println 'Erro menu Ganhe prêmios'}

//Valida text menu Loja Virtual da Home da aplicacao
Object lojaVirtual = 'PageHome/menuLojaVirtual'
String textMenuLoja = 'Loja virtual'
def labelLoja = WebUI.getText(findTestObject(lojaVirtual))
println(labelLoja)
boolean validaLabelLoja = WebUI.verifyEqual(labelLoja, textMenuLoja)
if (validaLabelLoja == true) {
	println 'Passou'
} else
	{println 'Erro menu Loja Virtual'}

//Valida text menu Entrar da Home da aplicacao
Object btnEntrar = 'PageHome/btnEntrar'
String hintBtnEntrar = 'Entrar'
def txtBtnEntrar = WebUI.getText(findTestObject(btnEntrar))
println(txtBtnEntrar)
boolean validaBtnEntrar = WebUI.verifyEqual(txtBtnEntrar, hintBtnEntrar)
if (validaBtnEntrar == true) {
	println 'Passou'
} else
	{println 'Erro menu Entrar'}

//Valida text menu Quero Participar da Home da aplicacao
Object btnParticipar = 'PageHome/btnQueroParticipar'
String hintBtnParticipar = 'Quero participar'
def textBtnParticipar = WebUI.getText(findTestObject(btnParticipar))
println(textBtnParticipar)
boolean validaBtnParticipar = WebUI.verifyEqual(textBtnParticipar, hintBtnParticipar)
if (validaBtnParticipar == true) {
	println 'Passou'
} else
	{println 'Erro menu Quero Participar'}
	
/**
 * End
 * @After
 */