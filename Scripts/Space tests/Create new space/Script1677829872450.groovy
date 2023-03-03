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

spaceName = 'test space'

WebUI.click(findTestObject('Side navigation bar/Spaces/New Space_button'))

WebUI.setText(findTestObject('Side navigation bar/Spaces/Create space modal/Enter space name_input field'), spaceName)

for (i = 0; i < 5; i++) {
    WebUI.waitForElementPresent(findTestObject('Side navigation bar/Spaces/Create space modal/Next_button'), 0)

    WebUI.click(findTestObject('Side navigation bar/Spaces/Create space modal/Next_button'))
}

WebUI.click(findTestObject('Side navigation bar/Spaces/Create space modal/Review Space_button'))

WebUI.click(findTestObject('Side navigation bar/Spaces/Create space modal/Create Space_button'))

WebUI.click(findTestObject('Side navigation bar/Spaces/Search spaces icon'))

WebUI.setText(findTestObject('Side navigation bar/Spaces/Search spaces_input field'), spaceName)

WebUI.waitForElementHasAttribute(findTestObject('Side navigation bar/Spaces/First space in the list'), 'text', 0)

firstSpaceName = WebUI.getAttribute(findTestObject('Side navigation bar/Spaces/First space in the list'), 'text')

WebUI.verifyMatch(firstSpaceName, spaceName, false)

WebUI.closeBrowser()

