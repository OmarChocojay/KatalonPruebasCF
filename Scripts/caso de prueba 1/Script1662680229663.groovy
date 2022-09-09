import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://mipago-kinal.web.app/login')

WebUI.setText(findTestObject('Object Repository/LogIn Admin/Page_PropuestaProyecto/input_Correo_correo'), 'mipagokinaladmin@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/LogIn Admin/Page_PropuestaProyecto/input_Password_password'), 'uVqg82iDzjzZl7qYc/okePhOdUmQ9dKG')

WebUI.click(findTestObject('Object Repository/LogIn Admin/Page_PropuestaProyecto/a_Ingresar'))

WebUI.click(findTestObject('Object Repository/LogIn Admin/Page_PropuestaProyecto/button_Ver'))

WebUI.click(findTestObject('Object Repository/LogIn Admin/Page_PropuestaProyecto/button_Agregar'))

WebUI.setText(findTestObject('Page_PropuestaProyecto/input_Nombres_nombres'), 'Andrea')

WebUI.setText(findTestObject('Page_PropuestaProyecto/input_Apellidos_apellidos'), 'Cabrera')

WebUI.setText(findTestObject('Page_PropuestaProyecto/input_Nmero de Carnet_carnet'), '2022123')

WebUI.setText(findTestObject('Page_PropuestaProyecto/input_Correo Estudiantil_correo'), 'acabrera@kinal.edu.gt')

WebUI.setEncryptedText(findTestObject('Object Repository/LogIn Admin/Page_PropuestaProyecto/input_Contrasea_password'), 
    'aeHFOx8jV/A=')

WebUI.click(findTestObject('Object Repository/LogIn Admin/Page_PropuestaProyecto/button_Agregar_1'))

WebUI.waitForElementVisible(findTestObject('Page_PropuestaProyecto/button_OK'), 10)

WebUI.navigateToUrl('https://mipago-kinal.web.app/admin/usuarios')

WebUI.closeBrowser()

