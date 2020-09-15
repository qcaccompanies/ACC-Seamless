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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

Mobile.startApplication('C:\\Users\\lieto\\git\\ACC-ACCOne\\acc.one (preprod).apk', false)

Mobile.delay(15, FailureHandling.STOP_ON_FAILURE)

Mobile.tapAtPosition(990, 2150)

Mobile.delay(10, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Akun/Label Pusat Bantuan'), 0)

Mobile.delay(10, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Akun Saya - Pusat Bantuan/Field Search Pusat Bantuan'), 0)

Mobile.setText(findTestObject('Akun Saya - Pusat Bantuan/Field Search Pusat Bantuan'), search, 0)

Mobile.delay(10, FailureHandling.STOP_ON_FAILURE)

if (condition.toString() == 'found') {
    Mobile.verifyElementVisible(findTestObject('Akun Saya - Pusat Bantuan/Judul Bantuan', [('text') : search]), 0)
} else {
    Mobile.verifyElementNotVisible(findTestObject('Akun Saya - Pusat Bantuan/Judul Bantuan', [('text') : search]), 0)
}

Mobile.closeApplication()
