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

WebUI.click(findTestObject('Task creation modal/Task_button'))

WebUI.setText(findTestObject('Task creation modal/Task name_input field'), 'task test')

WebUI.click(findTestObject('Task creation modal/Space selector_input field'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Task creation modal/Search spaces_input field'), 'list', FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('Task creation modal/Search spaces_input field'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Task creation modal/Assignee selector'))

WebUI.click(findTestObject('Task creation modal/Assignee first option'))

WebUI.setText(findTestObject('Task creation modal/Descripton_text area'), 'testing description')

WebUI.click(findTestObject('Task creation modal/Create task_button'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Task creation modal/Task successfully created modal'), 5)

WebUI.closeBrowser()

