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

Mobile.startApplication('D:\\MY WORLD\\KULIAH (TUGAS)\\TGS SEMS. 8\\INTERNSHIT\\Task ACC ONE\\ACC-ACCOne\\acc.one (1).apk', 
    false)

Mobile.scrollToText(namaPaket, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('View Paket/paketCashbacc'), 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

if (condition == 'passed') {
    Mobile.verifyElementVisible(findTestObject('View Paket/tapObject', [('text') : namaPaket]), 0)

    CustomKeywords.'ScrollUpDown.UpDown'(517, 1150, 517, 400)

    CustomKeywords.'ScrollUpDown.UpDown'(517, 400, 517, 1100)

    Mobile.tap(findTestObject('View Paket/tapObject', [('text') : 'Syarat & Ketentuan']), 0)

    CustomKeywords.'ScrollUpDown.UpDown'(517, 1150, 517, 400)

    CustomKeywords.'ScrollUpDown.UpDown'(517, 400, 517, 1100)
}

Mobile.pressBack()

