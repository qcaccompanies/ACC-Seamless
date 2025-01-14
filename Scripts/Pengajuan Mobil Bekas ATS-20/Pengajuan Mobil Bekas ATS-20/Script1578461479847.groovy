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

Mobile.startApplication('C:/Users/Marvin/Documents/GitHub/ACC-Seamless-ACCOne/acc.one (1).apk', false)

Mobile.tap(findTestObject('Pengajuan Mobil Bekas ATS-20/Btn_Cari_Mobil'), 0)

Mobile.tap(findTestObject('Pengajuan Mobil Bekas ATS-20/Btn_Cari_Mobil_Bekas'), 0)

Mobile.tap(findTestObject('Pengajuan Mobil Bekas ATS-20/Marketplace'), 0)

if (MerkMobil == 'Toyota') {
    Mobile.tap(findTestObject('Pengajuan Mobil Bekas ATS-20/Toyota_BTN'), 0, FailureHandling.STOP_ON_FAILURE)
} else if (MerkMobil == 'Daihatsu') {
    Mobile.tap(findTestObject('Pengajuan Mobil Bekas ATS-20/Daihatsu_BTN'), 0, FailureHandling.STOP_ON_FAILURE)
}

not_run: Mobile.tap(findTestObject('Pengajuan Mobil Bekas ATS-20/Cari_Bobil'), 0, FailureHandling.STOP_ON_FAILURE)

not_run: Mobile.setText(findTestObject('Pengajuan Mobil Bekas ATS-20/Cari_Bobil'), NamaMobil, 0)

not_run: Mobile.tap(findTestObject('Pengajuan Mobil Bekas ATS-20/ovelay'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.scrollToText(NamaMobil, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Buat Pengajuan Mobil Baru/Lama/Select_Car', [('text') : NamaMobil]), 0)

Mobile.tap(findTestObject('Pengajuan Mobil Bekas ATS-20/BTN_Saya_Tertarik'), 0)

WebUI.callTestCase(findTestCase('Pengajuan Mobil Bekas ATS-20/HitungSimulasi'), [('NamaArea') : NamaArea, ('NamaCabang') : NamaCabang
        , ('DP') : DP, ('Periode') : Periode, ('PembayaranAsuransi') : PembayaranAsuransi, ('CreditProtection') : CreditProtection
        , ('DPPersen') : DPPersen, ('DPNominal') : DPNominal], FailureHandling.STOP_ON_FAILURE)

switch ('Status') {
    case 'Pass':
        Mobile.verifyElementVisible(findTestObject('TopUP/BtnLanjut'), 0)

        break
    case 'Fail':
        break
        
        if (Detail.toString() == 'Cabang Harus Diisi') {
            Mobile.verifyElementVisible(findTestObject('TopUP/BtnLanjut'), 0)
        }
        
        if (Detail.toString() == 'DP Harus Diisi') {
            Mobile.verifyElementVisible(findTestObject('TopUP/BtnLanjut'), 0)
        }
        
        if (Detail.toString() == 'Uang Harus 20% Dari OTR') {
            Mobile.verifyElementVisible(findTestObject('TopUP/BtnLanjut'), 0)
        }
}

