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

WebUI.setText(findTestObject('Object Repository/TC13_OR/Page_Login Perusahaan  Geratisin/input_Username_username'), 'testcomp')

WebUI.setText(findTestObject('Object Repository/TC13_OR/Page_Login Perusahaan  Geratisin/input_Password_password'), 'password')

WebUI.click(findTestObject('Object Repository/TC13_OR/Page_Login Perusahaan  Geratisin/button_Login'))

WebUI.mouseOver(findTestObject('TC13_OR/Page_Home Perusahaan  Geratisin/a_Test Company'))

WebUI.click(findTestObject('Object Repository/TC13_OR/Page_Home Perusahaan  Geratisin/a_Profile'))

WebUI.click(findTestObject('Object Repository/TC13_OR/Page_Profil Perusahaan  Geratisin/a_Verifikasi Perusahaan'))

WebUI.uploadFile(findTestObject('TC13_OR/Page_Verifikasi Perusahaan  Geratisin/input_Upload Dokumen Verifikasi_document'), 
    GlobalVariable.sample_document_path)

WebUI.click(findTestObject('Object Repository/TC13_OR/Page_Verifikasi Perusahaan  Geratisin/button_Ajukan Verifikasi Perusahaan'))

WebUI.verifyTextPresent('sukses mengajukan verifikasi', false)

WebUI.closeBrowser()

