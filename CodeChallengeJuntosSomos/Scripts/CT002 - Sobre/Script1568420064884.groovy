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

//Acessa o menu Sobre na Home da aplicacao
WebUI.click(findTestObject('PageHome/menuSobre'))
WebUI.delay(GlobalVariable.timeOutSmall)

//Verifica Objeto presente na page Sobre
Object descricaoSobre = 'PageSobre/frameDescricaoSobre'
String textDescricaoSobre = 'O Juntos Somos + nasceu para fortalecer o varejo da construção e transformar a vida dos profissionais que constroem sonhos. Somos o maior programa de fidelidade do varejo de material de construção levando qualificação e benefícios para lojistas, vendedores e profissionais da obra.'
WebUI.verifyElementPresent(findTestObject(descricaoSobre), GlobalVariable.timeOutSmall)
def labelDescricaoSobre = WebUI.getText(findTestObject(descricaoSobre))
println labelDescricaoSobre
def labelDescricao = WebUI.getText(findTestObject(descricaoSobre))
println(labelDescricao)
boolean validaLabelDescricao = WebUI.verifyEqual(labelDescricao, textDescricaoSobre)
if (validaLabelDescricao == true) {
	println 'Passou'
} else
	{println 'Erro page Sobre'}
	
/**
 * End
 * @After
 */