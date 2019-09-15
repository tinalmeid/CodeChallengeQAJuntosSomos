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
WebUI.click(findTestObject('PageHome/menuJuntePontos'))
WebUI.delay(GlobalVariable.timeOutSmall)

//Verifica Objeto presente na page Junte pontos
Object descricaoJunte = 'PageJunte/frameDescricaoEntreGanhe'
String textDescricaoJunte = 'Entre e ganhe a vontade'
WebUI.verifyElementPresent(findTestObject(descricaoJunte), GlobalVariable.timeOutSmall)
def labelDescricaoJunte = WebUI.getText(findTestObject(descricaoJunte))
println(labelDescricaoJunte)
def labelDescricao = WebUI.getText(findTestObject(descricaoJunte))
println(labelDescricao)
boolean validaLabelDescricao = WebUI.verifyEqual(labelDescricao, textDescricaoJunte)
if (validaLabelDescricao == true) {
    println('Passou')
} else {
    println('Erro menu Descrição Junte pontos')
}

/**
 * End
 * @After
 */