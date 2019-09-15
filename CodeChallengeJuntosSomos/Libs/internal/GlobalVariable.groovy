package internal

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase

/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */
public class GlobalVariable {
     
    /**
     * <p>Profile default : URL inicial da aplica&ccedil;&atilde;o</p>
     */
    public static Object urlDefault
     
    /**
     * <p>Profile default : Tempo Sleep default</p>
     */
    public static Object timeOutSmall
     
    /**
     * <p>Profile default : CPF Usuario</p>
     */
    public static Object CPFUsuario
     
    /**
     * <p>Profile default : CNPJ Loja</p>
     */
    public static Object CNPJLoja
     

    static {
        def allVariables = [:]        
        allVariables.put('default', ['urlDefault' : 'https://www.juntossomosmais.com.br/', 'timeOutSmall' : 1, 'CPFUsuario' : '297.996.050-08', 'CNPJLoja' : '18.318.585/0001-58'])
        
        String profileName = RunConfiguration.getExecutionProfile()
        def selectedVariables = allVariables[profileName]
		
		for(object in selectedVariables){
			String overridingGlobalVariable = RunConfiguration.getOverridingGlobalVariable(object.key)
			if(overridingGlobalVariable != null){
				selectedVariables.put(object.key, overridingGlobalVariable)
			}
		}

        urlDefault = selectedVariables["urlDefault"]
        timeOutSmall = selectedVariables["timeOutSmall"]
        CPFUsuario = selectedVariables["CPFUsuario"]
        CNPJLoja = selectedVariables["CNPJLoja"]
        
    }
}
