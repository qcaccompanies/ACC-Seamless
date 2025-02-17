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

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Akun/Label Lihat Profil'), 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Ubah No HP - ATS-15/Icon Edit Phone Number'), 0)

Mobile.setText(findTestObject('Ubah No HP - ATS-15/Field No Telp Lama'), oldNoTelp, 0)

Mobile.setText(findTestObject('Ubah No HP - ATS-15/Field No Telp Baru'), newNoTelp, 0)

switch (status.toString()) {
    case 'failed':
        if (condition.toString() == 'oldNoTelpEmpty') {
            Mobile.tap(findTestObject('Ubah No HP - ATS-15/Field No Telp Lama'), 0)

            Mobile.tap(findTestObject('Ubah No HP - ATS-15/Field No Telp Baru'), 0)

            Mobile.verifyElementVisible(findTestObject('Ubah No HP - ATS-15/Warn No Handphone Lama Tidak Boleh Kosong'), 
                0)
        } else if (condition.toString() == 'newNoTelpEmpty') {
            Mobile.tap(findTestObject('Ubah No HP - ATS-15/Field No Telp Baru'), 0)

            Mobile.tapAtPosition(545, 830)

            Mobile.verifyElementVisible(findTestObject('Ubah No HP - ATS-15/Warn No. Handphone Min. 9 Digit'), 0)
        } else if (condition.toString() == 'oldPhoneNoWrong') {
            Mobile.tap(findTestObject('Ubah No HP - ATS-15/Field No Telp Lama'), 0)

            Mobile.tapAtPosition(545, 830)

            Mobile.verifyElementVisible(findTestObject('Ubah No HP - ATS-15/Warn No. Hp Lama Tidak Sesuai'), 0)
        } else if (condition.toString() == 'newPhoneNoShort') {
            Mobile.tap(findTestObject('Ubah No HP - ATS-15/Field No Telp Baru'), 0)

            Mobile.tapAtPosition(545, 830)

            Mobile.verifyElementVisible(findTestObject('Ubah No HP - ATS-15/Warn No. Handphone Min. 9 Digit'), 0)
        } else if (condition.toString() == 'oldPhoneMixed') {
            temp = Mobile.getText(findTestObject('Ubah No HP - ATS-15/Field No Telp Lama'), 0)

            Mobile.verifyMatch(temp, '12345', false)
        } else if (condition.toString() == 'newPhoneMixed') {
            temp1 = Mobile.getText(findTestObject('Ubah No HP - ATS-15/Field No Telp Baru'), 0)

            Mobile.verifyMatch(temp1, '12345', false)
        }
        
        break
    case 'success':
        Mobile.tap(findTestObject('Ubah No HP - ATS-15/Btn Konfirmasi'), 0)

        Mobile.setText(findTestObject('Ubah No HP - ATS-15/Field OTP'), otp, 0)

        Mobile.tap(findTestObject('Ubah No HP - ATS-15/Btn Verifikasi'), 0)

        if (condition.toString() == 'otpWrong') {
            Mobile.verifyElementVisible(findTestObject('Ubah No HP - ATS-15/Warn Kode Verifikasi Anda Salah'), 0)
        } else {
            Mobile.verifyElementNotVisible(findTestObject('Ubah No HP - ATS-15/Btn Konfirmasi'), 0)
        }
        
        break
}

Mobile.closeApplication()

