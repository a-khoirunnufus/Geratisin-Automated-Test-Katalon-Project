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

WebUI.setText(findTestObject('Object Repository/TC7_OR/Page_Login Perusahaan  Geratisin/input_Username_username'), 'jayaabadi')

WebUI.setEncryptedText(findTestObject('Object Repository/TC7_OR/Page_Login Perusahaan  Geratisin/input_Password_password'), 
    '8SQVv/p9jVScEs4/2CZsLw==')

WebUI.click(findTestObject('Object Repository/TC7_OR/Page_Login Perusahaan  Geratisin/button_Login'))

WebUI.mouseOver(findTestObject('Object Repository/TC7_OR/Page_Home Perusahaan  Geratisin/a_PT Jaya Abadi Selamanya'))

WebUI.click(findTestObject('TC7_OR/Page_Home Perusahaan  Geratisin/a_Tambah Beasiswa'))

WebUI.setText(findTestObject('TC7_OR/Page_Tambah Beasiswa  Geratisin/input_Nama Beasiswa_name'), 'Beasiswa TC7')

WebUI.uploadFile(findTestObject('TC7_OR/Page_Tambah Beasiswa  Geratisin/input_(Opsional)_brochure'), GlobalVariable.sample_document_path)

WebUI.setText(findTestObject('TC7_OR/Page_Tambah Beasiswa  Geratisin/input_Deskripsi Beasiswa_description'), 'test desksripsi')

WebUI.setText(findTestObject('TC7_OR/Page_Tambah Beasiswa  Geratisin/input_Tanggal Akhir Pendaftaran_end_date'), '2023-12-12')

WebUI.setText(findTestObject('TC7_OR/Page_Tambah Beasiswa  Geratisin/input_Link Beasiswa_link'), 'https://www.beasiswa.com')

WebUI.click(findTestObject('TC7_OR/Page_Tambah Beasiswa  Geratisin/button_Tambah Beasiswa'))

WebUI.verifyTextPresent('sukses menambahkan beasiswa', false)

WebUI.mouseOver(findTestObject('Object Repository/TC7_OR/Page_Home Perusahaan  Geratisin/a_PT Jaya Abadi Selamanya'))

WebUI.click(findTestObject('Object Repository/TC7_OR/Page_Home Perusahaan  Geratisin/a_Beasiswa Saya'))

WebUI.click(findTestObject('TC7_OR/Page_Beasiswa Saya  Geratisin/elm_Edit'))

WebUI.uploadFile(findTestObject('TC7_OR/Page_Edit Beasiswa  Geratisin/input_Upload Brosur Baru_brochure'), GlobalVariable.sample_document_path)

WebUI.setText(findTestObject('Object Repository/TC7_OR/Page_Edit Beasiswa  Geratisin/input_Link Beasiswa_link'), 'www.beasiswa-jaya-abadi.com')

WebUI.click(findTestObject('Object Repository/TC7_OR/Page_Edit Beasiswa  Geratisin/button_Edit Beasiswa'))

WebUI.verifyTextPresent('sukses mengedit data beasiswa', false)

WebUI.navigateToUrl('http://108.136.150.164/pub/logout')

'delete sample data start'
WebUI.navigateToUrl('http://108.136.150.164/admin/login')

WebUI.setText(findTestObject('Case_Delete Resulting Data/input_GERATISIN ADMIN_username'), 'admin')

WebUI.setText(findTestObject('Case_Delete Resulting Data/input_GERATISIN ADMIN_password'), 'password')

WebUI.click(findTestObject('Case_Delete Resulting Data/button_Log in'))

WebUI.click(findTestObject('Case_Delete Resulting Data/a_Lihat Detail'))

WebUI.click(findTestObject('Case_Delete Resulting Data/button_Delete TC7'))

WebUI.click(findTestObject('Case_Delete Resulting Data/button_Ya'))

'delete sample data end'
WebUI.verifyTextPresent('Hapus data telah berhasil', false)

WebUI.closeBrowser()

