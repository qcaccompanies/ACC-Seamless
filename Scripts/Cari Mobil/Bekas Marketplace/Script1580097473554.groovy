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
import org.openqa.selenium.Keys as Keys
import io.appium.java_client.android.nativekey.AndroidKey as AndroidKey
import io.appium.java_client.android.nativekey.KeyEvent as KeyEvent
import io.appium.java_client.android.AndroidDriver as AndroidDriver

Mobile.startApplication('C:\\Users\\lieto\\git\\ACC-ACCOne\\acc.one (dev).apk', false)

Mobile.delay(20, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Cari Mobil/Bekas Marketplace/boxCariMobil'), 0)

Mobile.tap(findTestObject('Cari Mobil/Bekas Marketplace/boxMobilBekas'), 0)

Mobile.tap(findTestObject('Cari Mobil/Bekas Marketplace/boxMarketplace'), 0)

if (brand == '') {
    Mobile.tap(findTestObject('Cari Mobil/Bekas Marketplace/SearchBox'), 0)

    Mobile.setText(findTestObject('Cari Mobil/Bekas Marketplace/SearchBox'), namaMobil + '\\n', 0)

    Mobile.scrollToText(spesific, FailureHandling.STOP_ON_FAILURE)

    Mobile.tap(findTestObject('Cari Mobil/Rental Mobil/tapObject', [('text') : spesific]), 0)

    if (condition == 'mainPassed') {
        Mobile.verifyElementNotVisible(findTestObject('Cari Mobil/Baru/textCautionMobilNotFoundBaru'), 0)
    } else {
        Mobile.verifyElementVisible(findTestObject('Cari Mobil/Baru/textCautionMobilNotFoundBaru'), 0)
    }
} else if (brand == 'daihatsu') {
    Mobile.tap(findTestObject('Cari Mobil/Bekas Marketplace/btnDaihatsu'), 0)

    if (merek != '') {
        Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

        Mobile.swipe(641, 287, 200, 287)

        not_run: Mobile.swipe(955, 450, 240, 450)

        Mobile.tap(findTestObject('Cari Mobil/Rental Mobil/tapObject', [('text') : merek]), 0)

        Mobile.scrollToText(spesific, FailureHandling.STOP_ON_FAILURE)

        Mobile.tap(findTestObject('Cari Mobil/Rental Mobil/tapObject', [('text') : spesific]), 0)

        Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)
    } else {
        Mobile.tap(findTestObject('Cari Mobil/Bekas Marketplace/searchBoxToyota'), 0)

        Mobile.setText(findTestObject('Cari Mobil/Bekas Marketplace/searchBoxToyota'), namaMobil + '\\n', 0)

        Mobile.scrollToText(spesific, FailureHandling.STOP_ON_FAILURE)

        Mobile.tap(findTestObject('Cari Mobil/Rental Mobil/tapObject', [('text') : spesific]), 0)

        if (condition == 'daihatsuPassed') {
            Mobile.verifyElementNotVisible(findTestObject('Cari Mobil/Baru/textCautionMobilNotFoundBaru'), 0)
        } else {
            Mobile.verifyElementVisible(findTestObject('Cari Mobil/Baru/textCautionMobilNotFoundBaru'), 0)
        }
    }
} else if (brand == 'toyota') {
    Mobile.tap(findTestObject('Cari Mobil/Bekas Marketplace/btnToyota'), 0)

    if (merek != '') {
        Mobile.tap(findTestObject('Cari Mobil/Rental Mobil/tapObject', [('text') : merek]), 0)

        Mobile.scrollToText(spesific, FailureHandling.STOP_ON_FAILURE)

        Mobile.tap(findTestObject('Cari Mobil/Rental Mobil/tapObject', [('text') : spesific]), 0)

        Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)
    } else {
        Mobile.tap(findTestObject('Cari Mobil/Bekas Marketplace/searchBoxToyota'), 0)

        Mobile.setText(findTestObject('Cari Mobil/Bekas Marketplace/searchBoxToyota'), namaMobil +'\\n', 0)

        Mobile.scrollToText(spesific, FailureHandling.STOP_ON_FAILURE)

        Mobile.tap(findTestObject('Cari Mobil/Rental Mobil/tapObject', [('text') : spesific]), 0)

        if (condition == 'toyotaPassed') {
            Mobile.verifyElementNotVisible(findTestObject('Cari Mobil/Baru/textCautionMobilNotFoundBaru'), 0)
        } else {
            Mobile.verifyElementVisible(findTestObject('Cari Mobil/Baru/textCautionMobilNotFoundBaru'), 0)
        }
    }
}

not_run: Mobile.sendKeys(findTestObject('Cari Mobil/Bekas Marketplace/SearchBox'), Keys.chord(Keys.META))

