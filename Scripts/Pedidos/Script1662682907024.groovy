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

WebUI.setText(findTestObject('Object Repository/Pruerbas Admin CRUD/Page_PropuestaProyecto/input_Correo_correo'), 'arma@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Pruerbas Admin CRUD/Page_PropuestaProyecto/input_Password_password'), 
    'aeHFOx8jV/A=')

WebUI.click(findTestObject('Object Repository/Pruerbas Admin CRUD/Page_PropuestaProyecto/a_Ingresar'))

WebUI.click(findTestObject('Object Repository/Pruerbas Admin CRUD/Page_PropuestaProyecto/button_Ver'))

WebUI.click(findTestObject('Object Repository/Pruerbas Admin CRUD/Page_PropuestaProyecto/button_Fondos'))

WebUI.setText(findTestObject('Object Repository/Pruerbas Admin CRUD/Page_PropuestaProyecto/input_Cantidad a agregar_cantidad'), 
    '100')

WebUI.click(findTestObject('Object Repository/Pruerbas Admin CRUD/Page_PropuestaProyecto/button_Confirmar'))

WebUI.click(findTestObject('Object Repository/Pruerbas Admin CRUD/Page_PropuestaProyecto/button_OK'))

WebUI.click(findTestObject('Object Repository/Pruerbas Admin CRUD/Page_PropuestaProyecto/button_Fondos'))

WebUI.setText(findTestObject('Object Repository/Pruerbas Admin CRUD/Page_PropuestaProyecto/input_Cantidad a agregar_cantidad'), 
    '150')

WebUI.click(findTestObject('Object Repository/Pruerbas Admin CRUD/Page_PropuestaProyecto/button_Confirmar'))

WebUI.click(findTestObject('Object Repository/Pruerbas Admin CRUD/Page_PropuestaProyecto/button_OK'))

WebUI.click(findTestObject('Object Repository/Pruerbas Admin CRUD/Page_PropuestaProyecto/button_Fondos'))

WebUI.setText(findTestObject('Object Repository/Pruerbas Admin CRUD/Page_PropuestaProyecto/input_Cantidad a agregar_cantidad'), 
    '50')

WebUI.click(findTestObject('Object Repository/Pruerbas Admin CRUD/Page_PropuestaProyecto/button_Confirmar'))

WebUI.click(findTestObject('Object Repository/Pruerbas Admin CRUD/Page_PropuestaProyecto/button_OK'))

WebUI.click(findTestObject('Object Repository/Pruerbas Admin CRUD/Page_PropuestaProyecto/a_Productos'))

WebUI.click(findTestObject('Object Repository/Pruerbas Admin CRUD/Page_PropuestaProyecto/button_Agregar'))

WebUI.setText(findTestObject('Object Repository/Pruerbas Admin CRUD/Page_PropuestaProyecto/input_Nombre Producto_nombre'), 
    'Choripan ')

WebUI.setText(findTestObject('Object Repository/Pruerbas Admin CRUD/Page_PropuestaProyecto/input_Precio Producto_precio'), 
    '10')

WebUI.setText(findTestObject('Object Repository/Pruerbas Admin CRUD/Page_PropuestaProyecto/input_Cantidad a agregar_cantidad'), 
    '20')

WebUI.click(findTestObject('Object Repository/Pruerbas Admin CRUD/Page_PropuestaProyecto/button_Agregar_1'))

WebUI.waitForElementClickable(findTestObject('Page_PropuestaProyecto/button_OK'), 0)

WebUI.click(findTestObject('Object Repository/Pruerbas Admin CRUD/Page_PropuestaProyecto/button_Editar'))

WebUI.setText(findTestObject('Object Repository/Pruerbas Admin CRUD/Page_PropuestaProyecto/input_Cantidad Producto_cantidad'), 
    '5')

WebUI.click(findTestObject('Object Repository/Pruerbas Admin CRUD/Page_PropuestaProyecto/button_Confirmar'))

WebUI.waitForElementClickable(findTestObject('Page_PropuestaProyecto/button_OK'), 0)

WebUI.click(findTestObject('Object Repository/Pruerbas Admin CRUD/Page_PropuestaProyecto/a_Pedidos'))

WebUI.click(findTestObject('Object Repository/Pruerbas Admin CRUD/Page_PropuestaProyecto/button_Entregar'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Pruerbas Admin CRUD/Page_PropuestaProyecto/button_OK'))

WebUI.click(findTestObject('Object Repository/Pruerbas Admin CRUD/Page_PropuestaProyecto/a_Marbetes'))

WebUI.click(findTestObject('Object Repository/Pruerbas Admin CRUD/Page_PropuestaProyecto/button_Salir'))

