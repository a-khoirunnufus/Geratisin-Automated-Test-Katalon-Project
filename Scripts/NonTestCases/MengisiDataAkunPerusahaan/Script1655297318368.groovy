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

WebUI.navigateToUrl('http://108.136.150.164/company/login')

WebUI.click(findTestObject('Object Repository/NonTC_OR/Page_Login Perusahaan  Geratisin/a_Mendaftar sekarang'))

WebUI.setText(findTestObject('Object Repository/NonTC_OR/Page_Mendaftar Perusahaan  Geratisin/input_Nama Perusahaan_name'), 
    'Test Company One')

WebUI.setText(findTestObject('Object Repository/NonTC_OR/Page_Mendaftar Perusahaan  Geratisin/input_Email_email'), 'testcompany1@email.com')

WebUI.setText(findTestObject('Object Repository/NonTC_OR/Page_Mendaftar Perusahaan  Geratisin/input_Username_username'), 
    'testcompany1')

WebUI.setEncryptedText(findTestObject('Object Repository/NonTC_OR/Page_Mendaftar Perusahaan  Geratisin/input_Password_password'), 
    '8SQVv/p9jVScEs4/2CZsLw==')

WebUI.click(findTestObject('Object Repository/NonTC_OR/Page_Mendaftar Perusahaan  Geratisin/button_Mendaftar'))

WebUI.click(findTestObject('Object Repository/NonTC_OR/Page_Login Perusahaan  Geratisin/a_Mendaftar sekarang'))

WebUI.setText(findTestObject('Object Repository/NonTC_OR/Page_Mendaftar Perusahaan  Geratisin/input_Nama Perusahaan_name'), 
    'Test Company Two')

WebUI.setText(findTestObject('Object Repository/NonTC_OR/Page_Mendaftar Perusahaan  Geratisin/input_Email_email'), 'testcompany2@email.com')

WebUI.setText(findTestObject('Object Repository/NonTC_OR/Page_Mendaftar Perusahaan  Geratisin/input_Username_username'), 
    'testcompany2')

WebUI.setEncryptedText(findTestObject('Object Repository/NonTC_OR/Page_Mendaftar Perusahaan  Geratisin/input_Password_password'), 
    '8SQVv/p9jVScEs4/2CZsLw==')

WebUI.click(findTestObject('Object Repository/NonTC_OR/Page_Mendaftar Perusahaan  Geratisin/button_Mendaftar'))

WebUI.closeBrowser()

