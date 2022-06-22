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

WebUI.navigateToUrl(GlobalVariable.company_register_url)

WebUI.setText(findTestObject('Object Repository/TC13_OR/Page_Mendaftar Perusahaan  Geratisin/input_Nama Perusahaan_name'), 
    'Perusahaan TCenambelas')

WebUI.setText(findTestObject('Object Repository/TC13_OR/Page_Mendaftar Perusahaan  Geratisin/input_Email_email'), 'ptc16@email.com')

WebUI.setText(findTestObject('Object Repository/TC13_OR/Page_Mendaftar Perusahaan  Geratisin/input_Username_username'), 
    'ptc16')

WebUI.setEncryptedText(findTestObject('Object Repository/TC13_OR/Page_Mendaftar Perusahaan  Geratisin/input_Password_password'), 
    '8SQVv/p9jVScEs4/2CZsLw==')

WebUI.click(findTestObject('Object Repository/TC13_OR/Page_Mendaftar Perusahaan  Geratisin/button_Mendaftar'))

WebUI.verifyTextPresent('Anda telah sukses mendaftar', false)

WebUI.navigateToUrl(GlobalVariable.company_login_url)

WebUI.setText(findTestObject('Object Repository/TC13_OR/Page_Login Perusahaan  Geratisin/input_Username_username'), 'ptc16')

WebUI.setEncryptedText(findTestObject('Object Repository/TC13_OR/Page_Login Perusahaan  Geratisin/input_Password_password'), 
    '8SQVv/p9jVScEs4/2CZsLw==')

WebUI.click(findTestObject('Object Repository/TC13_OR/Page_Login Perusahaan  Geratisin/button_Login'))

WebUI.mouseOver(findTestObject('Object Repository/TC13_OR/Page_Home Perusahaan  Geratisin/a_Perusahaan TCtigabelas'))

WebUI.click(findTestObject('Object Repository/TC13_OR/Page_Home Perusahaan  Geratisin/a_Profile'))

WebUI.click(findTestObject('Object Repository/TC13_OR/Page_Profil Perusahaan  Geratisin/a_Verifikasi Perusahaan'))

WebUI.uploadFile(findTestObject('TC13_OR/Page_Verifikasi Perusahaan  Geratisin/input_Upload Dokumen Verifikasi_document'), 
    GlobalVariable.sample_document_path)

WebUI.click(findTestObject('Object Repository/TC13_OR/Page_Verifikasi Perusahaan  Geratisin/button_Ajukan Verifikasi Perusahaan'))

WebUI.verifyTextPresent('Anda telah sukses mengajukan verifikasi', false)

WebUI.navigateToUrl(GlobalVariable.company_logout_url)

WebUI.navigateToUrl(GlobalVariable.admin_login_url)

WebUI.setText(findTestObject('Object Repository/TC13_OR/Page_Login Admin  GERATISIN/input_GERATISIN ADMIN_username'), 'admin')

WebUI.setEncryptedText(findTestObject('Object Repository/TC13_OR/Page_Login Admin  GERATISIN/input_GERATISIN ADMIN_password'), 
    '8SQVv/p9jVScEs4/2CZsLw==')

WebUI.click(findTestObject('Object Repository/TC13_OR/Page_Login Admin  GERATISIN/button_Log in'))

WebUI.click(findTestObject('TC14_OR/Page_Verifikasi Perusahaan  GERATISIN/a_Pengguna Perusahaan'))

WebUI.click(findTestObject('TC14_OR/Page_Verifikasi Perusahaan  GERATISIN/a_Verifikasi Perusahaan'))

WebUI.click(findTestObject('TC16_OR/Page_Verifikasi Perusahaan  GERATISIN/elm_Verifikasi'))

WebUI.click(findTestObject('TC16_OR/Page_Verifikasi Perusahaan  GERATISIN/button_Tolak'))

WebUI.verifyTextPresent('Perusahaan telah ditolak', false)

WebUI.click(findTestObject('Object Repository/TC13_OR/Page_Dashboard  GERATISIN/a_Dashboard'))

WebUI.click(findTestObject('Object Repository/TC13_OR/Page_Dashboard  GERATISIN/a_Lihat Detail'))

WebUI.click(findTestObject('TC16_OR/Page_Pengguna Perusahaan  GERATISIN/elm_Delete'))

WebUI.click(findTestObject('Object Repository/TC13_OR/Page_Pengguna Perusahaan  GERATISIN/button_Ya'))

'delete sample data end'
WebUI.verifyTextPresent('Hapus data telah berhasil', false)

WebUI.closeBrowser()

