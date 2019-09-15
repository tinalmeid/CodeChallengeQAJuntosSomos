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

//Informa valores campos
WebUI.click(findTestObject('QueroParticipar/frameTrabalhoObras'))

WebUI.click(findTestObject('QueroParticipar/campoSelecioneProfissao'))

WebUI.click(findTestObject('QueroParticipar/selecaoUsuarioArquiteto'))
WebUI.delay(GlobalVariable.timeOutSmall)

WebUI.setText(findTestObject('QueroParticipar/campoCPFArquiteto'), GlobalVariable.CPFUsuario)