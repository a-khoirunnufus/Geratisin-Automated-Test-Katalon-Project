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

WebUI.navigateToUrl('http://108.136.150.164/admin/login')

WebUI.setText(findTestObject('Object Repository/TC12_OR/Page_Login Admin  GERATISIN/input_GERATISIN ADMIN_username'), 'admin')

WebUI.setEncryptedText(findTestObject('Object Repository/TC12_OR/Page_Login Admin  GERATISIN/input_GERATISIN ADMIN_password'), 
    '8SQVv/p9jVScEs4/2CZsLw==')

WebUI.click(findTestObject('Object Repository/TC12_OR/Page_Login Admin  GERATISIN/button_Log in'))

WebUI.click(findTestObject('Object Repository/TC12_OR/Page_Dashboard  GERATISIN/a_Beasiswa'))

WebUI.click(findTestObject('Object Repository/TC12_OR/Page_Dashboard  GERATISIN/a_Verifikasi Beasiswa'))

WebUI.verifyTextPresent('Beasiswa pt jaya abadi', false)

WebUI.click(findTestObject('Object Repository/TC12_OR/Page_Verifikasi Beasiswa  GERATISIN/button_Verifikasi'))

WebUI.click(findTestObject('Object Repository/TC12_OR/Page_Verifikasi Beasiswa  GERATISIN/button_Tolak'))

WebUI.verifyTextPresent('Verifikasi beasiswa telah ditolak', false)

WebUI.closeBrowser()

