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
import groovy.json.JsonSlurper as JsonSlurper

WS.sendRequest(findTestObject('GetInfo'))

WS.sendRequestAndVerify(findTestObject('GetInfo'))

'Send a request and returns its response'
def response = WS.sendRequest(findTestObject('GetInfo'))

'Verify if the response from "REST_Status Codes/POST_201" object returns the 201 status code'
WS.verifyResponseStatusCode(response, 200)

//Verifica Status HTTP//
assert response.getStatusCode() == 200

Number Status = response.getStatusCode()

println('Status Code: ' + Status)

// Imprime o valor do contedo do body
String body = response.getResponseBodyContent()

println('Body: ' + body)
