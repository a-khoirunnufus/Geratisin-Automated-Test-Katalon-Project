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

WebUI.navigateToUrl('http://108.136.150.164/pub/login')

WebUI.setText(findTestObject('Object Repository/TC1-2_OR/Page_Login  Geratisin/input_Username_username'), 'ahmad')

WebUI.setEncryptedText(findTestObject('Object Repository/TC1-2_OR/Page_Login  Geratisin/input_Password_password'), 
    '8SQVv/p9jVScEs4/2CZsLw==')

WebUI.click(findTestObject('Object Repository/TC1-2_OR/Page_Login  Geratisin/button_Login'))

WebUI.mouseOver(findTestObject('Object Repository/TC1-2_OR/Page_Home  Geratisin/a_Ahmad Khoirunnufus'))

WebUI.click(findTestObject('Object Repository/TC1-2_OR/Page_Home  Geratisin/a_Tambah Beasiswa'))

WebUI.setText(findTestObject('Object Repository/TC1-2_OR/Page_Tambah Beasiswa  Geratisin/input_Nama Beasiswa_name'), 
    'Beasiswa Anak Negeri')

WebUI.uploadFile(findTestObject('TC1-2_OR/Page_Tambah Beasiswa  Geratisin/input_(Opsional)_brochure'), GlobalVariable.sample_document_path)

WebUI.setText(findTestObject('Object Repository/TC1-2_OR/Page_Tambah Beasiswa  Geratisin/input_Deskripsi Beasiswa_description'), 
    'Beasiswa bagi mahasiswa berprestasi')

WebUI.setText(findTestObject('Object Repository/TC1-2_OR/Page_Tambah Beasiswa  Geratisin/input_Tanggal Akhir Pendaftaran_end_date'), 
    '2023-05-12')

WebUI.setText(findTestObject('Object Repository/TC1-2_OR/Page_Tambah Beasiswa  Geratisin/input_Link Beasiswa_link'), 
    'www.beasiswa.com/beasiswa/1')

WebUI.click(findTestObject('Object Repository/TC1-2_OR/Page_Tambah Beasiswa  Geratisin/button_Tambah Beasiswa'))

WebUI.verifyTextPresent('sukses menambahkan beasiswa', false)

WebUI.closeBrowser()

