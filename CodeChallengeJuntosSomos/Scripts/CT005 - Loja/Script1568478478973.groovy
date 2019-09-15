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

//Acessa o menu Loja Virtual na Home da aplicacao
WebUI.click(findTestObject('PageHome/menuLojaVirtual'))
WebUI.delay(GlobalVariable.timeOutSmall)
WebUI.switchToWindowTitle('Loja Juntos Somos +')
WebUI.delay(GlobalVariable.timeOutSmall)

//Verifica Objeto presente na page Loja Virtual
Object btnSerCliente = 'PageLojaVirtual/btnQueroSerCliente'
String textbtnSerCliente = 'QUERO SER CLIENTE'
WebUI.verifyElementPresent(findTestObject(btnSerCliente), GlobalVariable.timeOutSmall)
def labelBtnSerCliente = WebUI.getText(findTestObject(btnSerCliente))
println(labelBtnSerCliente)
boolean validaLabelDescricao = WebUI.verifyEqual(labelBtnSerCliente, textbtnSerCliente)
if (validaLabelDescricao == true) {
    println('Passou')
} else {
    println('Erro Loja Virtual')
}

Object btnSolicitar = 'PageLojaVirtual/btnSolicitarAcesso'
String textBtnSolicitar = 'SOLICITAR ACESSO'
WebUI.verifyElementPresent(findTestObject(btnSolicitar), GlobalVariable.timeOutSmall)
def labelBtnSolicitar = WebUI.getText(findTestObject(btnSolicitar))
println(labelBtnSolicitar)
boolean validaLabelDesc = WebUI.verifyEqual(labelBtnSolicitar, textBtnSolicitar)
if (validaLabelDesc == true) {
	println('Passou')
} else {
	println('Erro Loja Virtual')
}
/**
 * End
 * @After
 */