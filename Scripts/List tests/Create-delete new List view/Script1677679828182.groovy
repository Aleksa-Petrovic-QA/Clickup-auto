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

CustomKeywords.'clickup.ClickupUtil.login'()

WebUI.click(findTestObject('Everything - navigation bar/Add View_button'))

WebUI.setText(findTestObject('Add new view modal/Enter view name_input field'), 'testing view')

WebUI.click(findTestObject('Add new view modal/Add View_button'))

WebUI.verifyElementPresent(findTestObject('Everything - navigation bar/List View options/List view selector dropdown'), 
    0)

WebUI.click(findTestObject('Everything - navigation bar/List View options/List view selector dropdown'))

WebUI.rightClick(findTestObject('Everything - navigation bar/List View options/Last view available'))

WebUI.click(findTestObject('Everything - navigation bar/List View options/Delete view_button'))

WebUI.closeBrowser()

