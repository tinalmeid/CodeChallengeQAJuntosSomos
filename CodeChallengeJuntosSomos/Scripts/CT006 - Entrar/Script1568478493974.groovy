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
WebUI.click(findTestObject('PageHome/btnEntrar'))
WebUI.delay(GlobalVariable.timeOutSmall)

//Verifica Objeto presente card Login
Object titleCardLogin = 'Entrar/frameAreaRestrita'
String hintTitleLogin = 'Acesse aqui sua área restrita'
WebUI.verifyElementPresent(findTestObject(titleCardLogin), GlobalVariable.timeOutSmall)
def labelTitleCard = WebUI.getText(findTestObject(titleCardLogin))
println(labelTitleCard)
boolean validaLabelTitle = WebUI.verifyEqual(labelTitleCard, hintTitleLogin)
if (validaLabelTitle == true) {
	println('Passou')
} else {
	println('Erro Titulo Card Acesso')
}

Object campoUsuario = 'Entrar/campoCPF'
Object labelUsuario = 'Entrar/labelCPF'
String hintLabelUsuario = 'CPF :'
WebUI.verifyElementPresent(findTestObject(campoUsuario), GlobalVariable.timeOutSmall)
WebUI.verifyElementPresent(findTestObject(labelUsuario), GlobalVariable.timeOutSmall)
def textLabelCPF = WebUI.getText(findTestObject(labelUsuario))
println(textLabelCPF)
boolean validaTextLabelCPF = WebUI.verifyEqual(textLabelCPF, hintLabelUsuario)
if (validaTextLabelCPF == true) {
	println('Passou')
} else {
	println('Erro campo CPF login')
}

Object campoSenha = 'Entrar/campoSenha'
Object labelSenha = 'Entrar/labelSenha'
String hintLabelSenha = 'Senha:'
WebUI.verifyElementPresent(findTestObject(campoSenha), GlobalVariable.timeOutSmall)
WebUI.verifyElementPresent(findTestObject(labelSenha), GlobalVariable.timeOutSmall)
def textLabelSenha = WebUI.getText(findTestObject(labelSenha))
println(textLabelSenha)
boolean validaTextLabelSenha = WebUI.verifyEqual(textLabelSenha, hintLabelSenha)
if (validaTextLabelSenha == true) {
	println('Passou')
} else {
	println('Erro campo Senha login')
}

Object btnEntrar = 'Entrar/btnEntrar'
String hintEntrar = 'Entrar'
WebUI.verifyElementPresent(findTestObject(btnEntrar), GlobalVariable.timeOutSmall)
def btnLabelEntrar = WebUI.getText(findTestObject(btnEntrar))
println(btnLabelEntrar)
boolean validaBtnLabelEntrar = WebUI.verifyEqual(btnLabelEntrar, hintEntrar)
if (validaBtnLabelEntrar == true) {
	println('Passou')
} else {
	println('Erro comando Entrar')
}

Object btnEsqueciSenha = 'Entrar/btnEsqueciSenha'
String hintEsqueciSenha = 'Não sei a senha'
WebUI.verifyElementPresent(findTestObject(btnEsqueciSenha), GlobalVariable.timeOutSmall)
def btnLabelEsqueci = WebUI.getText(findTestObject(btnEsqueciSenha))
println(btnLabelEsqueci)
boolean validaBtnLabelEsqueci = WebUI.verifyEqual(btnLabelEsqueci, hintEsqueciSenha)
if (validaBtnLabelEsqueci == true) {
	println('Passou')
} else {
	println('Erro comando Esqueci Senha')
}

Object frameNaoTemConta = 'Entrar/frameNaotemConta'
String hintNaoTemConta = 'Não tem uma conta?'+ "\n"+ 'Clique em Quero participar'
WebUI.verifyElementPresent(findTestObject(frameNaoTemConta), GlobalVariable.timeOutSmall)
def textFrameNaoTem = WebUI.getText(findTestObject(frameNaoTemConta))
println(textFrameNaoTem)
boolean validaFrameNaoTem = WebUI.verifyEqual(textFrameNaoTem, hintNaoTemConta)
if (validaFrameNaoTem == true) {
	println('Passou')
} else {
	println('Erro Frame Não tem conta')
}
/**
 * End
 * @After
 */