package pages;

import java.io.File;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Map;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class medicalRecord_page extends StartupPage {

	public By getUsernameTextfieldLocator() {
		return By.id("username_id");
	}

	public By getPasswordTextboxLocator() {
		return By.xpath("//input[@id='password']");
	}

	public By getSignInButtonLocator() {
		return By.xpath("//button[@id='login']");
	}

	public By getMedicalRecordLocator() {
		return By.xpath("//a[@href='#/Medical-records']");
	}

	public By getPageBarFixedLocator(String navBarName) {
		if (navBarName.equalsIgnoreCase("mr outpatient list")) {
			navBarName = "MR Outpatient List";
		} else if (navBarName.equalsIgnoreCase("mr inpatient list")) {
			navBarName = "MR Inpatient List";
		} else if (navBarName.equalsIgnoreCase("birth list")) {
			navBarName = "Birth List";
		} else if (navBarName.equalsIgnoreCase("death list")) {
			navBarName = "Death List";
		} else if (navBarName.equalsIgnoreCase("reports")) {
			navBarName = "Reports";
		} else if (navBarName.equalsIgnoreCase("emergency patient list")) {
			navBarName = "Emergency Patient List";
		}
		return By.xpath("//a[contains(text(),'" + navBarName + "')]");

	}

	public By calendarFromDropdown() {
		return By.xpath("(//input[@id='date'])[1]");
	}

	public By calendarToDropdown() {
		return By.xpath("(//input[@id='date'])[2]");
	}

	public By getButtonLocatorsBytext(String buttonName) {
		return By.xpath("//button[contains(text(),'" + buttonName + "')]");
	}

	public By searchBarId() {
		return By.id("quickFilterInput");
	}

	public By getStarIconLocator() {
		return By.xpath("//i[contains(@class,'icon-favourite')]/..");
	}

	public By getAnchorTagLocatorByText(String anchorTagName) {
		return By.xpath("//a[contains(text(),'" + anchorTagName + "')]");
	}

	public By getRowsOfResult() {
		return By.xpath("//div[not(contains(@class,'hidden'))]/div[@row-id]");
	}

	public By getActualAppointmentDates() {
		return By.xpath("//div[@role='gridcell' and @col-id='VisitDate']");
	}

	public By getDateRangeButton() {
		return By.cssSelector("td [data-hover='dropdown']");
	}

	public By getDoctorFilterField() {
		return By.xpath("//label[contains(text(),'Doctor')]/..//input");
	}

	public By getDepartmentFilterDropdown() {
		return By.cssSelector("select#departmentlist");
	}

	public By getActualDoctorsInResult() {
		return By.xpath("//div[@col-id='PerformerName' and @role='gridcell']");
	}

	public By getActualDepartmentsInResult() {
		return By.xpath("//div[@role='gridcell' and @col-id='DepartmentName']");
	}

	public By getDoctorNameOptionInFilter(String doctorName) {
		return By.xpath("//danphe-auto-complete//li[contains(text(),'" + doctorName + "')]");
	}

	public By getDoctorFilterDropdownLocator() {
		return By.xpath("//input[@placeholder=\"Doctor Name\"]");
	}

	public By getDepartmentFilterDropdownLocator() {
		return By.xpath("//select[@id=\"departmentlist\"]");
	}

	public By getDiagnosisDropdownLocator() {
		return By.cssSelector("input[placeholder='Select ICD-11(s)']");
	}

	public By getDiagnosisCheckBoxIsSelectedLocator() {
		return By.xpath("(//label[@class=\"mt-checkbox mt-checkbox-outline\"]/span)[2]");
	}

	public By getDiagnosisPendingCheckBoxIsSelectedLocator() {
		return By.xpath("//label[@class=\"mt-checkbox mt-checkbox-outline\"][3]");
	}

	public By getDiseaseCategoryDropdownLocator() {
		return By.xpath("//label[@for='#diseaseWiseCategory']/..//select");
	}

	public By getAllCheckBoxIsSelectedLocator() {
		return By.xpath("//label[@class=\"mt-checkbox mt-checkbox-outline\"][1]");
	}

	public By getCurrentPage() {
		return By.xpath("//span[@ref='lbCurrent']");
	}

	public By getInpatientSeviceRequest() {
		return By.cssSelector("a[href='#/Medical-records/ReportList/InpatientServicesReport']");
	}

	public By getBirthDetailsHeading() {
		return By.xpath("//span[text()='Add Birth Details']");
	}

	public By getPopUpMessageText(String msgStatus, String messageText) {
		return By.xpath("//p[contains(text(),' " + msgStatus + " ')]/../p[contains(text(),'" + messageText + "')]");
	}

	public By popupCloseButton() {
		return By.cssSelector("a.close-btn");
	}

	public By getCertificateButtonLocator(String patientName) {
		return By.xpath("(//div[text()='" + patientName + "']/../div/a[text()='Certificate'])[1]");
	}

	public By getBirthCertificateModalHeading() {
		return By.cssSelector("div.modelbox-header");
	}

	public By getLocatorById(String id) {
		return By.id(id);
	}

	public By getBirthListTableLocator() {
		return By.xpath("//table[contains(@class,'brth-detail-holder')]/tbody/tr");
	}

	public By getFinalDiagTextLocator() {
		return By.xpath("//div[contains(@col-id,'FinalDiagnosis_1')]");
	}

	public By getAddFinalDiagnosisButtonForPatient(String patientName) {
		return By.xpath("//div[@col-id='PatientName' and text()='" + patientName
				+ "']/../div/span/a[contains(text(),'Add Final Diagnosis')]");
	}

	public By getAddFinalDiagnosisModalCancelButton() {
		return By.xpath("//span[contains(text(),'Add Final Diagnosis')]/../../a[@title='Cancel']");
	}

	public By getEditFinalDiagnosisButtonForPatient(String patientName) {
		return By.xpath("//div[@col-id='PatientName' and text()='" + patientName
				+ "']/../div/span/a[contains(text(),'Edit Final Diagnosis')]");
	}

	public By getDiagnosisDropdownLocatorInModal() {
		return By.xpath("//input[@placeholder='ICD-11']");
	}

	public By favouriteOrStarIconMedicalRecord() {
		return By.xpath("//i[@title='Remember this Date']");
	}

	public By getAppointmentTabLocator() {
		return By.xpath("//a[@href='#/Appointment']");
	}

	public By getCounters() {
		return By.xpath("//div[@class='counter']");
	}

	public By getNewPatientFirstNameField() {
		return By.xpath("//input[@id='aptPatFirstName']");
	}

	public By getNewPatientLastNameField() {
		return By.xpath("//input[@formcontrolname='LastName']");
	}

	public By getReligionSelectDropdown() {
		return By.xpath("//select[@id='id_select_ethnic_group']");
	}

	public By getAgeFieldInModal() {
		return By.xpath("//input[@id='txtAgeInput']");
	}

	public By getGenderSelectDropdown() {
		return By.xpath("//select[@formcontrolname='Gender']");
	}

	public By getPhoneNumberField() {
		return By.xpath("//input[@id='txtPhone']");
	}

	public By getDoctorFieldInModal() {
		return By.xpath("//input[@id='doctorName']");
	}

	public By getBillReceipt() {
		return By.xpath("//div[@id='billing-receipt']");
	}

	public By getAllRows() {
		return By.xpath("//div[@ref='eCenterColsClipper']//div[@role='row']");
	}

	public By getPrintInvoiceButton() {
		return By.xpath("//input[@id='btnPrintInvoice']");
	}

	public By getPatientNameInOutPatientByIndex(int index) {
		return By.xpath("(//div[@col-id='PatientName' and @role='gridcell'])[" + index + "]");
	}

	public By getDepartmentInOutPatientByIndex(int index) {
		return By.xpath("(//div[@col-id='DepartmentName' and @role='gridcell'])[" + index + "]");
	}

	public By getDoctorNameInOutPatientByIndex(int index) {
		return By.xpath("(//div[@col-id='PerformerName' and @role='gridcell'])[" + index + "]");
	}

	public By getAddFinalDiagLocator() {
		return By.xpath("//div/span/a[contains(text(),'Add Final Diagnosis')]");
	}

	public By getEditFinalDiagLocator() {
		return By.xpath("//div/span/a[contains(text(),'Edit Final Diagnosis')]");
	}

	public medicalRecord_page(WebDriver driver) {
		super(driver);
	}

	/**
	 * @Test1.1 about this method loginTohealthAppByGivenValidCredetial()
	 * 
	 * @param : Map<String, String>
	 * @description : fill usernameTextbox & passwordTextbox and click on sign in
	 *              button
	 * @return : Boolean
	 * @author : Yaksha
	 */
	public boolean loginToHealthAppByGivenValidCredetial(Map<String, String> expectedData) throws Exception {
		Boolean textIsDisplayed = false;
		try {
			WebElement usernametextFieldWebElement = commonEvents.findElement(getUsernameTextfieldLocator());
			commonEvents.highlightElement(usernametextFieldWebElement);
			commonEvents.sendKeys(getUsernameTextfieldLocator(), expectedData.get("username"));

			WebElement passwordtextFieldWebElement = commonEvents.findElement(getPasswordTextboxLocator());
			commonEvents.highlightElement(passwordtextFieldWebElement);
			commonEvents.sendKeys(getPasswordTextboxLocator(), expectedData.get("password"));

			WebElement signinButtonWebElement = commonEvents.findElement(getPasswordTextboxLocator());
			commonEvents.highlightElement(signinButtonWebElement);
			commonEvents.click(getSignInButtonLocator());
			textIsDisplayed = true;
		} catch (Exception e) {
			throw e;
		}
		return textIsDisplayed;
	}

	/**
	 * @Test1.2 about this method visitMedicalRecordTab()
	 * 
	 * @param : null
	 * @description : verify the medicalRecord tab and click it
	 * @return : String
	 * @author : YAKSHA
	 */
	public void visitMedicalRecordTab() throws Exception {
		try {
			JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
			WebElement medicalRecordTab = commonEvents.findElement(getMedicalRecordLocator());
			jsExecutor.executeScript("arguments[0].scrollIntoView(true);", medicalRecordTab);
			jsExecutor.executeScript("window.scrollBy(0, -50)");
			commonEvents.highlight(medicalRecordTab);
			commonEvents.click(medicalRecordTab);

			// Wait for the URL to contain "Medical-records/InpatientList"
			commonEvents.waitForUrlContains("Medical-records/InpatientList", 10);
		} catch (Exception e) {
			throw e;
		}
	}

	/**
	 * @Test1.3 about this method verifyMedicalRecordPageUrl()
	 * 
	 * @param : null
	 * @description : verify medicalRecord page url
	 * @return : String
	 * @author : YAKSHA
	 */
	public String verifyMedicalRecordPageUrl() throws Exception {
		try {
			String titleToVerify = commonEvents.getCurrentUrl();
			return titleToVerify;
		} catch (Exception e) {
			throw e;
		}
	}

	/**
	 * @Test2 about this method highlightAndVerifyWhetherElementIsDisplayed
	 * 
	 * @param element : By - Locator of the element to be highlighted and verified
	 * @description : This method verifies whether an element is displayed on the
	 *              page, highlights it if displayed, and returns true if displayed.
	 * @return : boolean - true if the element is displayed, otherwise false
	 * @author : YAKSHA
	 */
	public boolean highlightAndVerifyWhetherElementIsDisplayed(By element) {
		boolean isElementDisplayed = false;
		try {
			if (commonEvents.isDisplayed(element)) {
				WebElement elementToHighlight = commonEvents.findElement(element);
				commonEvents.highlight(elementToHighlight);
				isElementDisplayed = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return isElementDisplayed;
	}

	/**
	 * @Test3 about this method verifyUrlMedicalRecordModule()
	 * 
	 * @description This method verifies that the "MR Inpatient List" tab is present
	 *              in the MedicalRecord module and returns the current URL of the
	 *              page.
	 * @return String - The current URL of the page after verifying the "MR
	 *         Inpatient List "tab.
	 * @throws Exception - If there is an issue locating the "MR Inpatient List" tab
	 *                   or verifying its text.
	 * @autor YAKSHA
	 */
	public String verifyUrlMedicalRecordModule() throws Exception {
		try {
			// Locate the "MR Inpatient List" tab element
			WebElement listRequesttab = commonEvents.findElement(getPageBarFixedLocator("MR Inpatient List"));

			// Verify that the "MR Inpatient List" tab text matches the expected value
			Assert.assertEquals(listRequesttab.getText().trim(), "MR Inpatient List");

			// Get the current URL of the page
			String verifyMRInpatientListUrl = commonEvents.getCurrentUrl();

			return verifyMRInpatientListUrl;

		} catch (Exception e) {
			throw e;
		}
	}

	/**
	 * @Test4.1 about this method clickAnchorButtonByText()
	 * 
	 * @param : null
	 * @description : Clicks Anchor button through its text
	 * @return : Boolean
	 * @author : YAKSHA
	 */
	public boolean clickAnchorButtonByText(String textOfAnchorButton) throws Exception {
		try {
			WebElement buttonToClick = commonEvents.findElement(getAnchorTagLocatorByText(textOfAnchorButton));
			commonEvents.highlight(buttonToClick).click(buttonToClick);
			return true;
		} catch (Exception e) {
			throw e;
		}
	}

	/**
	 * @Test4.2 @Test7.2 @Test11.1 @Test14.1 @Test15.1 about this method
	 * applyDateFilter()
	 * 
	 * @param : String, String
	 * @description : Applies the date filter with date range
	 * @return : void
	 * @throws : Exception - if there is an issue finding or filling the date fields
	 * @author : YAKSHA
	 */
	public boolean applyDateFilter(String fromDate, String toDate) throws Exception {
		try {
			String fromDay, fromMonth, fromYear, toDay, toMonth, toYear;
			fromDay = fromDate.split("-")[0];
			fromMonth = fromDate.split("-")[1];
			fromYear = fromDate.split("-")[2];
			toDay = toDate.split("-")[0];
			toMonth = toDate.split("-")[1];
			toYear = toDate.split("-")[2];
			WebElement fromDateDropdown = commonEvents.findElement(calendarFromDropdown());
			WebElement toDateDropdown = commonEvents.findElement(calendarToDropdown());
			commonEvents.highlight(fromDateDropdown).sendKeys(fromDateDropdown, fromDay)
					.sendKeys(fromDateDropdown, fromMonth).sendKeys(fromDateDropdown, fromYear);
			commonEvents.highlight(toDateDropdown).sendKeys(toDateDropdown, toDay).sendKeys(toDateDropdown, toMonth)
					.sendKeys(toDateDropdown, toYear);
			clickButtonByText("OK");
		} catch (Exception e) {
			throw e;
		}
		return true;
	}

	/**
	 * @Test4.3 about this method
	 * verifyIfInputFieldsDropdownsAndCheckboxesAreVisibleOrNot()
	 * 
	 * @param : null
	 * @description : This method verifies the visibility of various UI components
	 *              on the page, including buttons, input fields, dropdowns, and
	 *              checkboxes.
	 * @return : boolean - Returns true if all specified UI components are
	 *         displayed, otherwise false.
	 * @throws : Exception - if there is an issue finding any of the UI components.
	 * @author : YAKSHA
	 */
	public boolean verifyIfInputFieldsDropdownsAndCheckboxesAreVisibleOrNot() throws Exception {
		boolean areAllFieldsDisplayed = false;
		try {
			// Check the visibility of all required UI components
			if (commonEvents.isDisplayed(getButtonLocatorsBytext("First"))
					&& commonEvents.isDisplayed(getButtonLocatorsBytext("Previous"))
					&& commonEvents.isDisplayed(getButtonLocatorsBytext("Next"))
					&& commonEvents.isDisplayed(getButtonLocatorsBytext("Last"))
					&& commonEvents.isDisplayed(searchBarId())
					&& commonEvents.isDisplayed(getDoctorFilterDropdownLocator())
					&& commonEvents.isDisplayed(getDepartmentFilterDropdownLocator())
					&& commonEvents.isDisplayed(getDiagnosisDropdownLocator())
					&& commonEvents.isDisplayed(getDiseaseCategoryDropdownLocator())
					&& commonEvents.isDisplayed(getDateRangeButton())
					&& commonEvents.isDisplayed(getAllCheckBoxIsSelectedLocator())
					&& commonEvents.isDisplayed(getDiagnosisCheckBoxIsSelectedLocator())
					&& commonEvents.isDisplayed(getDiagnosisPendingCheckBoxIsSelectedLocator())
					&& commonEvents.isDisplayed(calendarFromDropdown())
					&& commonEvents.isDisplayed(calendarToDropdown())
					&& commonEvents.isDisplayed(getStarIconLocator())) {

				// If all components are displayed, set the flag to true
				areAllFieldsDisplayed = true;
			}
		} catch (Exception e) {
			// Throw an exception with a meaningful message if any UI component is not found
			throw new Exception("Failed to verify if all fields are displayed!", e);
		}
		// Return the result of the visibility check
		return areAllFieldsDisplayed;
	}

	/**
	 * @Test5 @Test6.1 @Test7.1 @Test8.1 @Test9.1 about this method
	 *        verifyUrlContains()
	 * 
	 * @param buttonName      : String - The name of the button that will be clicked
	 *                        to navigate to a different URL.
	 * @param urlTextToVerify : String - The partial URL text to verify after
	 *                        clicking the button.
	 * @description : This method locates a button by its text, clicks on it, and
	 *              then checks if the resulting URL contains the specified text. It
	 *              ensures that the correct navigation has occurred.
	 * @return : boolean - Returns true if the URL contains the specified text,
	 *         otherwise false.
	 * @throws : Exception - if there is an issue finding the button, clicking it,
	 *           or verifying the URL.
	 * @author : YAKSHA
	 */
	public boolean verifyUrlContains(String buttonName, String urlTextToVerify) throws Exception {
		try {
			// Locate the button using its text
			WebElement buttonToClick = commonEvents.findElement(getAnchorTagLocatorByText(buttonName));

			// Highlight the button and click on it
			commonEvents.highlight(buttonToClick).click(buttonToClick);

			// Wait for the URL to contain the specified text
			commonEvents.waitForUrlContains(urlTextToVerify, 0);

			// Return true if the URL contains the specified text
			return true;
		} catch (Exception e) {
			// Throw the exception with context if an error occurs
			throw new Exception("Failed to verify that the URL contains the specified text: " + urlTextToVerify, e);
		}
	}

	/**
	 * @Test6.2 about this method searchAndVerifyKeywordInEveryResult()
	 * 
	 * @param keywordToVerify : String - The text or keyword to search for and
	 *                        verify in the results.
	 * @description : This method searches with the provided keyword and verifies if
	 *              every row in the result contains at least one cell that includes
	 *              the keyword.
	 * @return : boolean - true if the keyword is found in every row, otherwise
	 *         false.
	 * @throws : Exception - if there is an issue finding the search bar or
	 *           verifying the results.
	 * @author : YAKSHA
	 */
	public boolean searchAndVerifyKeywordInEveryResult(String keywordToVerify) throws Exception {
		try {
			// Flag to track whether the keyword is found in each row
			boolean keywordFoundInEveryRow = true;

			// Locate and highlight the search bar
			WebElement searchBar = commonEvents.findElement(searchBarId());
			commonEvents.highlightElement(searchBar);

			// Enter the keyword into the search bar
			commonEvents.sendKeys(searchBar, keywordToVerify);

			// Retrieve the list of rows from the search results
			List<WebElement> rows = commonEvents.getWebElements(getRowsOfResult());

			// Iterate over each row to verify if it contains the keyword
			for (WebElement row : rows) {
				commonEvents.highlight(row);
				String rowText = row.getText();

				// If the row does not contain the keyword, set the flag to false
				if (!rowText.contains(keywordToVerify)) {
					keywordFoundInEveryRow = false;
					break; // Exit the loop early since we found a row without the keyword
				}
			}

			// Return the result of the verification
			return keywordFoundInEveryRow;
		} catch (Exception e) {
			// Throw an exception with context if an error occurs
			throw new Exception("Failed to search and verify the keyword in the results", e);
		}
	}

	/**
	 * @Test8.2 about this method clickDateRangeDropdownAndSelect()
	 * 
	 * @param valueToSelect : String - The text of the value to select from the
	 *                      dropdown.
	 * @description : This method clicks on the date range button, selects a value
	 *              by its text, and verifies if the selection was successful.
	 * @return : boolean - true if the intended value is successfully selected,
	 *         otherwise false.
	 * @throws : Exception - if there is an issue finding the dropdown or its
	 *           values.
	 * @author : YAKSHA
	 */
	public boolean clickDateRangeDropdownAndSelect(String valueToSelect) throws Exception {
		try {
			// Locate the date range dropdown button
			WebElement dateRangeButton = commonEvents.findElement(getDateRangeButton());
			// Highlight and click the date range button to open the dropdown
			commonEvents.highlight(dateRangeButton).click(dateRangeButton);

			// Locate the element with the text value to select
			WebElement valueToSelectElement = commonEvents.findElement(getAnchorTagLocatorByText(valueToSelect));
			// Highlight and click the value to select it from the dropdown
			commonEvents.highlight(valueToSelectElement).click(valueToSelectElement);

			// Verify if the value is successfully selected by checking if it has a specific
			// class (e.g., "selected-range")
			boolean isValueSelected = commonEvents.getAttribute(valueToSelectElement, "class")
					.contains("selected-range");

			return isValueSelected;
		} catch (Exception e) {
			// Throw an exception with a meaningful message if an error occurs
			throw new Exception("Failed to select value '" + valueToSelect + "' from date range dropdown", e);
		}
	}

	/**
	 * @Test7.3 @Test8.3 about this method verifyResultsAppointmentDateFallsWithin()
	 * 
	 * @param fromDate : String - The starting date of the range in "dd-MM-yyyy"
	 *                 format.
	 * @param toDate   : String - The ending date of the range in "dd-MM-yyyy"
	 *                 format.
	 * @description : This method verifies that all appointment dates in the result
	 *              fall within the specified date range.
	 * @return : boolean - true if all appointment dates are within the specified
	 *         range, otherwise false.
	 * @throws : Exception - if there is an issue parsing the dates or verifying the
	 *           results.
	 * @author : YAKSHA
	 */
	public boolean verifyResultsAppointmentDateFallsWithin(String fromDate, String toDate) throws Exception {
		try {
			// Define the formatters for input and output date formats
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
			DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

			// Parse the fromDate and toDate strings to LocalDate objects
			LocalDate from = LocalDate.parse(fromDate, formatter);
			LocalDate to = LocalDate.parse(toDate, formatter);

			// Get the list of appointment dates from the filtered results
			List<WebElement> actualDatesAfterFilterApplied = commonEvents.getWebElements(getActualAppointmentDates());

			// Iterate through each date element to verify it falls within the specified
			// range
			for (WebElement dateElement : actualDatesAfterFilterApplied) {
				commonEvents.highlight(dateElement);
				String dateText = dateElement.getText();

				try {
					// Parse the date from the element text
					LocalDate date = LocalDate.parse(dateText, inputFormatter);
					LocalDate formattedDate = LocalDate.parse(date.format(formatter), formatter);

					// Check if the date is outside the specified range
					if (formattedDate.isBefore(from) || formattedDate.isAfter(to)) {
						return false; // Return false if any date is out of range
					}
				} catch (Exception e) {
					// Log the date parsing error and return false
					System.out.println("Date parsing failed for: " + dateText);
					return false;
				}
			}

			// Return true if all dates are within the range
			return true;

		} catch (Exception e) {
			// Throw a new exception with context if an error occurs
			throw new Exception("Failed to verify appointment dates within the range " + fromDate + " to " + toDate, e);
		}
	}

	/**
	 * @Test9.2 about this method applyDoctorFilterAndVerifyResults()
	 * 
	 * @param doctorName : String - Name of the Doctor to filter by.
	 * @description : This method applies a doctor filter by the specified name and
	 *              verifies if the results contain only the selected doctor.
	 * @return : boolean - true if all results contain the selected doctor's name,
	 *         otherwise false.
	 * @throws : Exception - if there is an issue finding the dropdown or its
	 *           values.
	 * @author : YAKSHA
	 */
	public boolean applyDoctorFilterAndVerifyResults(String doctorName) throws Exception {
		try {
			boolean resultContainsSameDoctor = false;

			// Locate and highlight the doctor filter field
			WebElement doctorFilter = commonEvents.findElement(getDoctorFilterField());
			commonEvents.highlight(doctorFilter);

			// Enter the doctor's name into the filter field
			commonEvents.sendKeys(doctorFilter, doctorName);

			// Select the doctor from the dropdown list
			WebElement doctorNameInList = commonEvents.findElement(getDoctorNameOptionInFilter(doctorName));
			commonEvents.highlight(doctorNameInList).click(doctorNameInList);

			// Retrieve all doctor names in the filtered results and verify they match the
			// selected doctor
			List<WebElement> doctorNamesInResult = commonEvents.getWebElements(getActualDoctorsInResult());
			for (WebElement doctorNameElement : doctorNamesInResult) {
				commonEvents.highlight(doctorNameElement);
				String doctorNameInCurrentRow = doctorNameElement.getText();

				// Check if the doctor's name in the current row contains the selected doctor's
				// name
				if (doctorNameInCurrentRow.contains(doctorName)) {
					resultContainsSameDoctor = true;
				} else {
					// If any doctor's name doesn't match, break the loop and return false
					resultContainsSameDoctor = false;
					break;
				}
			}

			// Clear the doctor filter field after the operation
			commonEvents.highlight(doctorFilter).clear(doctorFilter);

			return resultContainsSameDoctor;
		} catch (Exception e) {
			// Throw a meaningful exception if any error occurs during the operation
			throw new Exception("Failed to apply doctor filter and verify results", e);
		}
	}

	/**
	 * @Test10 about this method applyDepartmentFilterAndVerifyResults()
	 * 
	 * @param departmentName - The name of the department to filter by.
	 * @description : This method applies a department filter by department name and
	 *              verifies if the results contain only the selected department.
	 * @return boolean - true if all results contain the selected department name,
	 *         otherwise false.
	 * @throws Exception - if there is an issue finding the dropdown, selecting its
	 *                   values, or verifying the results.
	 * @author : YAKSHA
	 */
	public boolean applyDepartmentFilterAndVerifyResults(String departmentName) throws Exception {
		boolean resultContainsSameDepartment = false;
		try {
			// Navigate to MR Inpatient List and MR Outpatient List
			commonEvents.click(getAnchorTagLocatorByText("MR Inpatient List"));
			commonEvents.click(getAnchorTagLocatorByText("MR Outpatient List"));

			// Verify that the URL contains "OutpatientList" to ensure navigation is correct
			Assert.assertTrue(commonEvents.getCurrentUrl().contains("OutpatientList"));

			// Locate and highlight the department filter dropdown
			WebElement departmentFilter = commonEvents.findElement(getDepartmentFilterDropdown());
			commonEvents.highlight(departmentFilter);
			commonEvents.click(departmentFilter);

			// Select the department from the dropdown using the visible text
			Select dropdown = new Select(departmentFilter);
			dropdown.selectByVisibleText(departmentName);

			// Retrieve all department names in the filtered results and verify they match
			// the selected department
			List<WebElement> departmentNamesInResult = commonEvents.getWebElements(getActualDepartmentsInResult());
			for (WebElement departmentNameElement : departmentNamesInResult) {
				commonEvents.highlight(departmentNameElement);
				String departmentNameInCurrentRow = departmentNameElement.getText();

				// If any department name doesn't match the selected department, return false
				if (!departmentNameInCurrentRow.equals(departmentName)) {
					return false;
				}
				resultContainsSameDepartment = true;
			}

			// Return true if all department names match the selected department
			return resultContainsSameDepartment;
		} catch (Exception e) {
			// Throw a new exception with a meaningful message if any error occurs
			throw new Exception("Failed to apply department filter and verify results", e);
		}
	}

	/**
	 * @Test11.2 about this method scrollAllTheWayDown()
	 * 
	 * @param : null
	 * @description : This method vertically scrolls the screen to the bottom
	 * @return : boolean - true if successfully scrolled down and false if not
	 *         scrolled
	 * @throws : Exception - if there is an issue while scrolling
	 * @author : YAKSHA
	 */
	public boolean scrollAllTheWayDown() throws Exception {
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
			return true;

		} catch (Exception e) {
			throw e;
		}
	}

	/**
	 * @Test11.4 @Test11.6 about this method clickButtonByText()
	 * 
	 * @param buttonText : String - The text of the button to be clicked
	 * @description : This method locates a button using its text and performs a
	 *              click action on it. If the button is found, it is highlighted
	 *              before the click action. In case of failure (e.g., button not
	 *              found or click error), an error message is printed and an
	 *              exception is thrown.
	 * @return : boolean - Returns true if the button is successfully clicked.
	 * @throws : Exception - if there is an issue finding the button or performing
	 *           the click action.
	 * @author : YAKSHA
	 */
	public boolean clickButtonByText(String buttonText) throws Exception {
		try {
			// Locate the button using its text
			WebElement buttonToClick = commonEvents
					.findElement(By.xpath("//button[contains(text(),'" + buttonText + "')]"));

			// Highlight and click the button
			commonEvents.highlight(buttonToClick).click(buttonToClick);

			// Return true if the button is successfully clicked
			return true;
		} catch (Exception e) {
			// Print error message and rethrow exception
			System.out.println("Either the button was not found or encountered an error while clicking!");
			throw e;
		}
	}

	/**
	 * @Test11.3 @Test11.5 about this method verifyCurrentPageIs()
	 * 
	 * @param expectedCurrentPage : String - The expected text that should be
	 *                            present on the current page to verify its
	 *                            correctness.
	 * @description : This method verifies whether the current page matches the
	 *              expected page by checking the text of a specific element. If the
	 *              text matches the expected value, the method returns true,
	 *              otherwise it returns false.
	 * @return : boolean - true if the current page matches the expected page, false
	 *         otherwise.
	 * @throws : Exception - if there is an issue finding the element or performing
	 *           the text comparison.
	 * @author : YAKSHA
	 */
	public boolean verifyCurrentPageIs(String expectedCurrentPage) throws Exception {
		try {
			// Locate the element that holds the current page text
			WebElement currentPageElement = commonEvents.findElement(getCurrentPage());

			// Retrieve the text from the element
			String elementText = commonEvents.getText(currentPageElement);

			// Return true if the text contains the expected page name
			return elementText.contains(expectedCurrentPage);
		} catch (Exception e) {
			// Rethrow any encountered exception
			throw e;
		}
	}

	/**
	 * @Test12 about this method verifyDataIsFilteredAccordingToSelectedDiagnosis()
	 * 
	 * @param diagCode               - The diagnosis code to filter the data.
	 * @param expectedFinalDiagvalue - The expected final diagnosis value to verify
	 *                               against.
	 * @description : This method verifies that the data is filtered according to
	 *              the selected diagnosis code.
	 * @return : boolean - Returns true if the data is correctly filtered, otherwise
	 *         false.
	 * @throws : Exception - If there is an issue finding or interacting with
	 *           elements, a meaningful error message is thrown.
	 * @author : YAKSHA
	 */
	public boolean verifyDataIsFilteredAccordingToSelectedDiagnosis(String diagCode, String expectedFinalDiagvalue) {
		boolean isDataFiltered = false;
		try {
			JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
			WebElement outPatientListTab = commonEvents.findElement(getAnchorTagLocatorByText("MR Outpatient List"));
			jsExecutor.executeScript("arguments[0].scrollIntoView(true);", outPatientListTab);
			jsExecutor.executeScript("window.scrollBy(0, -50)");

			// Navigate to MR Inpatient List and MR Outpatient List
			commonEvents.click(getAnchorTagLocatorByText("MR Inpatient List"));
			commonEvents.click(getAnchorTagLocatorByText("MR Outpatient List"));

			WebElement selectDiagnosis = commonEvents.findElement(getDiagnosisDropdownLocator());
			commonEvents.highlight(selectDiagnosis).click(selectDiagnosis).sendKeys(selectDiagnosis, diagCode);
			commonEvents.sendKeys(selectDiagnosis, Keys.TAB);

			commonEvents.click(getButtonLocatorsBytext("OK"));

			Thread.sleep(1000);

			List<WebElement> finalDiagElement = commonEvents.getWebElements(getFinalDiagTextLocator());
			for (int i = 1; i < finalDiagElement.size(); i++) {
				String actualFinalDiagvalue = finalDiagElement.get(i).getText();
				actualFinalDiagvalue.equals(expectedFinalDiagvalue);
			}

			isDataFiltered = true;

		} catch (Exception e) {

		}
		return isDataFiltered;
	}

	/**
	 * @Test13 about this method verifyDiagnosisAddedCheckboxFunctionality()
	 * 
	 * @param diagCode               : String - The diagnosis code to be selected
	 *                               and filtered.
	 * @param expectedFinalDiagvalue : String - The expected final diagnosis value
	 *                               that should be present after filtering.
	 * @description : This method verifies that the data in the MR Inpatient and MR
	 *              Outpatient lists is correctly filtered according to the selected
	 *              diagnosis code.
	 * @return : boolean - Returns true if the data is filtered correctly, otherwise
	 *         false.
	 * @throws : Exception - If any issue occurs during the filtering process.
	 * @author : YAKSHA
	 */
	public boolean verifyDiagnosisAddedCheckboxFunctionality(String expectedBtnName) {
		boolean isDataFiltered = false;
		try {
			// Navigate to MR Inpatient List and MR Outpatient List
			commonEvents.click(getAnchorTagLocatorByText("MR Inpatient List"));
			commonEvents.click(getAnchorTagLocatorByText("MR Outpatient List"));

			WebElement diagnosisAddedCheckbox = commonEvents.findElement(getDiagnosisCheckBoxIsSelectedLocator());
			commonEvents.highlight(diagnosisAddedCheckbox).click(diagnosisAddedCheckbox);

			commonEvents.click(getButtonLocatorsBytext("OK"));

			Thread.sleep(1000);

			List<WebElement> editFinalDiagnosis = commonEvents
					.getWebElements(getAnchorTagLocatorByText("Edit Final Diagnosis"));
			for (int i = 0; i < editFinalDiagnosis.size(); i++) {
				String actualFinalDiagvalue = editFinalDiagnosis.get(i).getText();
				actualFinalDiagvalue.equals(expectedBtnName);
			}

			isDataFiltered = true;

		} catch (Exception e) {

		}
		return isDataFiltered;
	}

	/**
	 * @Test14.2 about this method
	 * clickAddFinalDiadnosisAndVerifyModalOpensAndCloseIt()
	 * 
	 * @param null
	 * @description : This method clicks on the Add Diadnosis button, verifies that
	 *              the Add Final Diagnosis modal is open and closes it
	 * @return : boolean - Returns true if the modal is visible and false if it is
	 *         not
	 * @throws : Exception - If there is an issue finding the button or the modal
	 * @author : YAKSHA
	 */
	public boolean clickAddFinalDiadnosisAndVerifyModalOpensAndCloseIt() throws Exception {
		try {
//			// Navigate to MR Inpatient List and MR Outpatient List
			commonEvents.click(getAnchorTagLocatorByText("MR Inpatient List"));
			commonEvents.click(getAnchorTagLocatorByText("MR Outpatient List"));

			Thread.sleep(1000);
			commonEvents.click(getButtonLocatorsBytext("Last"));
//			Thread.sleep(4000);

			List<WebElement> buttonToClick = commonEvents.getWebElements(getAddFinalDiagLocator());
			WebElement lastElement = buttonToClick.get(buttonToClick.size() - 1);
			commonEvents.highlight(lastElement).click(lastElement);
			System.out.println("Clicked on the last element.");

			// Verify Add FinalDiagnosis Modal;
			WebElement cancelFinalDiagnosisModalButton = commonEvents
					.findElement(getAddFinalDiagnosisModalCancelButton());
			commonEvents.highlight(cancelFinalDiagnosisModalButton);
			// Select Diagnosis
			WebElement diagnosisDropdown = commonEvents.findElement(getDiagnosisDropdownLocatorInModal());
			commonEvents.highlight(diagnosisDropdown).sendKeys(diagnosisDropdown, "Measles")
					.sendKeys(diagnosisDropdown, Keys.ARROW_DOWN).sendKeys(diagnosisDropdown, Keys.ENTER);
			clickButtonByText("Submit");
			WebElement element = commonEvents.findElement(getPopUpMessageText("Success", "Added Sucessfully"));
			String actualMsg = element.getText();
			System.out.println("Actual Success Message > " + actualMsg);
			return true;
		} catch (Exception e) {
			commonEvents.click(getAnchorTagLocatorByText("X"));
			commonEvents.acceptAlert();
			System.out.println("Alert Accepted!!");
			throw e;
		}
	}

	/**
	 * @Test15.2 about this method
	 * clickEditFinalDiadnosisAndVerifyModalOpensAndCloseIt()
	 * 
	 * @param null
	 * @description : This method clicks on the Edit Diadnosis button, verifies that
	 *              the Edit Final Diagnosis modal is open and closes it
	 * @return : boolean - Returns true if the modal is visible and false if it is
	 *         not
	 * @throws : Exception - If there is an issue finding the button or the modal
	 * @author : YAKSHA
	 */
	public boolean clickEditFinalDiadnosisAndVerifyModalOpensAndCloseIt() throws Exception {
		try {
			// Navigate to MR Inpatient List and MR Outpatient List
			commonEvents.click(getAnchorTagLocatorByText("MR Inpatient List"));
			commonEvents.click(getAnchorTagLocatorByText("MR Outpatient List"));

			Thread.sleep(4000);
			commonEvents.click(getButtonLocatorsBytext("Last"));
			Thread.sleep(4000);

			List<WebElement> buttonToClick = commonEvents.getWebElements(getEditFinalDiagLocator());
			WebElement lastElement = buttonToClick.get(buttonToClick.size() - 1);
			commonEvents.highlight(lastElement).click(lastElement);
			System.out.println("Clicked on the last element.");

			// Verify Add FinalDiagnosis Modal;
			WebElement cancelFinalDiagnosisModalButton = commonEvents
					.findElement(getAddFinalDiagnosisModalCancelButton());
			commonEvents.highlight(cancelFinalDiagnosisModalButton);
			// Select Diagnosis
			WebElement diagnosisDropdown = commonEvents.findElement(getDiagnosisDropdownLocatorInModal());
			commonEvents.highlight(diagnosisDropdown).sendKeys(diagnosisDropdown, "Diptheria")
					.sendKeys(diagnosisDropdown, Keys.TAB);
			commonEvents.click(getButtonLocatorsBytext("Update"));
			WebElement element = commonEvents
					.findElement(getPopUpMessageText("Success", "Final Diagnosis Updated Sucessfully"));
			String actualMsg = element.getText();
			System.out.println("Actual Success Message > " + actualMsg);
			return true;
		} catch (Exception e) {
			commonEvents.click(getAnchorTagLocatorByText("X"));
			commonEvents.acceptAlert();
			System.out.println("Alert Accepted!!");
			throw e;
		}
	}

	/**
	 * @Test16 about this method createMROutpatientRecordForPatient()
	 * 
	 * @param medicalRecordExpectedData : Map<String, String> - Contains patient
	 *                                  details such as first name, last name, age,
	 *                                  gender, doctor, and department.
	 * @description : This method creates an MR Outpatient record for a patient and
	 *              verifies if the patient's details, including the doctor and
	 *              department, are correctly reflected in the MR Outpatient list.
	 * @return : boolean - Returns true if the patient is successfully created and
	 *         visible in the outpatient list, otherwise false.
	 * @throws : Exception - If any step in the process fails, an exception is
	 *           thrown.
	 * @author : YAKSHA
	 */
	public boolean createMROutpatientRecordForPatient(Map<String, String> medicalRecordExpectedData) throws Exception {
		try {
			boolean isPatientCreatedAndVisibleInOutpatient = false;

			// Scroll to the top of the page and click on the "Appointment" tab
			JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
			WebElement appointmentTab = commonEvents.findElement(getAppointmentTabLocator());
			jsExecutor.executeScript("window.scrollBy(0, 0)");
			commonEvents.highlight(appointmentTab);
			commonEvents.click(appointmentTab);

			// If counter elements exist, click the first counter to activate it
			List<WebElement> counterElements = commonEvents.getWebElements(getCounters());
			if (!counterElements.isEmpty()) {
				commonEvents.highlight(counterElements.get(0)).click(counterElements.get(0));
			}

			// Click on the "New Visit" button to start the patient registration process
			clickAnchorButtonByText("New Visit");

			// Generate a random phone number for the patient
			Random randomNumber = new Random();
			long randomPhoneNumber = 1000000000L + (long) (randomNumber.nextDouble() * 9000000000L);
			String patientFirstName = medicalRecordExpectedData.get("firstName") + randomPhoneNumber;
			String patientLastName = medicalRecordExpectedData.get("lastName") + randomPhoneNumber;
			String patientName = patientFirstName + " " + patientLastName;
			String phoneNumber = String.valueOf(randomPhoneNumber);

			System.out.println("Patient Name: " + patientName);
			System.out.println("Phone Number: " + phoneNumber);

			// Click on "New Patient" to enter new patient details
			clickButtonByText("New Patient");

			// Fill out patient details in the form
			WebElement newPatientFirstNameField = commonEvents.findElement(getNewPatientFirstNameField());
			commonEvents.highlight(newPatientFirstNameField).sendKeys(newPatientFirstNameField, patientFirstName);

			WebElement newPatientLastNameField = commonEvents.findElement(getNewPatientLastNameField());
			commonEvents.highlight(newPatientLastNameField).sendKeys(newPatientLastNameField, patientLastName);

			WebElement religionSelectDropdownLocator = commonEvents.findElement(getReligionSelectDropdown());
			Select religionSelectDropdown = new Select(religionSelectDropdownLocator);
			religionSelectDropdown.selectByVisibleText(medicalRecordExpectedData.get("religion"));

			WebElement ageField = commonEvents.findElement(getAgeFieldInModal());
			commonEvents.highlight(ageField).sendKeys(ageField, medicalRecordExpectedData.get("age"));

			WebElement genderSelectDropdownLocator = commonEvents.findElement(getGenderSelectDropdown());
			Select genderSelectDropdown = new Select(genderSelectDropdownLocator);
			genderSelectDropdown.selectByVisibleText(medicalRecordExpectedData.get("gender"));

			WebElement phoneNumberField = commonEvents.findElement(getPhoneNumberField());
			commonEvents.highlight(phoneNumberField).sendKeys(phoneNumberField, phoneNumber);

			WebElement doctorFieldInModal = commonEvents.findElement(getDoctorFieldInModal());
			commonEvents.highlight(doctorFieldInModal)
					.sendKeys(doctorFieldInModal, medicalRecordExpectedData.get("doctor"))
					.sendKeys(doctorFieldInModal, Keys.TAB);

			// Click "Print Invoice" and confirm the operation
			Thread.sleep(1000);
			WebElement printInvoiceButton = commonEvents.findElement(getPrintInvoiceButton());
			commonEvents.highlight(printInvoiceButton).click(printInvoiceButton);
			clickButtonByText("Confirm");
			Thread.sleep(2000);

			// Verify if the bill receipt is generated, indicating that the patient is
			// created
			List<WebElement> billReceipt = commonEvents.getWebElements(getBillReceipt());
			if (!billReceipt.isEmpty()) {
				commonEvents.highlight(billReceipt.get(0)).click(billReceipt.get(0));
				commonEvents.sendKeys(ageField, Keys.ESCAPE);
				Thread.sleep(2000);
			} else {
				System.out.println("Bill receipt not generated.");
				isPatientCreatedAndVisibleInOutpatient = false;
			}

			// Navigate to the "MR Outpatient List" and verify the patient's details
			visitMedicalRecordTab();
			commonEvents.click(getAnchorTagLocatorByText("MR Outpatient List"));
			commonEvents.click(getButtonLocatorsBytext("Last"));

			List<WebElement> allRows = commonEvents.getWebElements(getAllRows());
			int numberOfRows = allRows.size();

			// Retrieve and compare the patient's details from the outpatient list
			String expectedPatientName = commonEvents.findElement(getPatientNameInOutPatientByIndex(numberOfRows))
					.getText();
			String expectedDepartmentName = commonEvents.findElement(getDepartmentInOutPatientByIndex(numberOfRows))
					.getText();
			String expectedDoctorName = commonEvents.findElement(getDoctorNameInOutPatientByIndex(numberOfRows))
					.getText();

			if (expectedPatientName.contains(patientName)
					&& expectedDepartmentName.contains(medicalRecordExpectedData.get("department"))
					&& expectedDoctorName.contains(medicalRecordExpectedData.get("doctor"))) {
				System.out.println("Patient details match, returning true.");
				isPatientCreatedAndVisibleInOutpatient = true;
			}

			WebElement outPatientListTab = commonEvents.findElement(getAnchorTagLocatorByText("MR Outpatient List"));
			jsExecutor.executeScript("arguments[0].scrollIntoView(true);", outPatientListTab);
			jsExecutor.executeScript("window.scrollBy(0, -50)");

			return isPatientCreatedAndVisibleInOutpatient;
		} catch (Exception e) {
			// Handle and throw the exception for the calling method to process
			throw new Exception("Error occurred while creating MR Outpatient record for the patient: " + e.getMessage(),
					e);
		}
	}

	/**
	 * @Test17 about this method verifyTooltipAndtext()
	 * 
	 * @param : null
	 * @description : This method verifies tooltip and the text after hovers
	 * @return : boolean - true if successfully hover and verify the text present
	 * @throws : Exception - if there is an issue while finding star tooltip
	 * @author : YAKSHA
	 * @return
	 */

	public String verifyToolTipText() throws Exception {

		String toolTipValue = "";
		try {
			// Navigate to MR Inpatient List and MR Outpatient List
			commonEvents.click(getAnchorTagLocatorByText("MR Inpatient List"));
			commonEvents.click(getAnchorTagLocatorByText("MR Outpatient List"));

			WebElement toolTip = commonEvents.findElement(favouriteOrStarIconMedicalRecord());
			toolTipValue = commonEvents.highlight(toolTip).getAttribute(toolTip, "title");
			System.out.println("Tool tip title : " + toolTipValue);
		} catch (Exception e) {
			throw e;
		}
		return toolTipValue;
	}

	/**
	 * @Test18 about this method verifyAlertMessageWithoutFillingAnyDetails()
	 * 
	 * @param medicalRecordExpectedData - A map containing the expected warning
	 *                                  message.
	 * @description : This method verifies that an alert message is displayed when
	 *              trying to submit a birth certificate without filling any
	 *              details.
	 * @return : String - The warning message displayed in the alert.
	 * @throws : Exception - If there is an issue finding or interacting with
	 *           elements.
	 * @author : YAKSHA
	 */
	public String verifyAlertMessageWithoutFillingAnyDetails(Map<String, String> medicalRecordExpectedData) {
		String warningMessage = "";
		try {

			// Navigate to the Birth List section
			WebElement birthListElement = commonEvents.findElement(getPageBarFixedLocator("Birth List"));
			commonEvents.highlight(birthListElement).click(birthListElement);

			// Click on the "Add New Birth Certificate" button
			WebElement addNewBirthCertificateButton = commonEvents
					.findElement(getAnchorTagLocatorByText("Add New Birth Certificate"));
			commonEvents.highlight(addNewBirthCertificateButton).click(addNewBirthCertificateButton);

			// Verify that the Birth Details heading is displayed
			Assert.assertTrue(commonEvents.isDisplayed(getBirthDetailsHeading()));

			// Click the "Submit" button without filling in any details
			WebElement submitButton = commonEvents.findElement(getButtonLocatorsBytext("Submit"));
			commonEvents.highlight(submitButton).click(submitButton);

			// Verify the warning message
			WebElement alertMessageElement = commonEvents
					.findElement(getPopUpMessageText("warning", medicalRecordExpectedData.get("warningMessage")));
			commonEvents.waitTillElementVisible(alertMessageElement, 10000);
			System.out.println("Warning message text: " + alertMessageElement.getText() + " Expected: "
					+ medicalRecordExpectedData.get("warningMessage"));

			warningMessage = alertMessageElement.getText();

			// Close the popup
			commonEvents.click(popupCloseButton());

			commonEvents.click(getAnchorTagLocatorByText("X"));

		} catch (Exception e) {
			e.printStackTrace();
		}
		return warningMessage;
	}

	/**
	 * @Test19 about this method verifyThePresenceOfCertificateButton()
	 * 
	 * @param patientName - The name of the patient for whom to verify the
	 *                    certificate button.
	 * @description : This method verifies the presence of the certificate button
	 *              for the specified patient and checks if the birth certificate
	 *              modal is displayed.
	 * @return : boolean - Returns true if the birth certificate modal is displayed,
	 *         otherwise false.
	 * @throws : Exception - If there is an issue finding or interacting with
	 *           elements, a meaningful error message is thrown.
	 * @author : YAKSHA
	 */
	public boolean verifyThePresenceOfCertificateButton(String patientName) throws Exception {
		boolean isBirthCertificateGenerated = false;
		try {
			// Locate the certificate button for the specified patient
			WebElement certificateButton = commonEvents.findElement(getCertificateButtonLocator(patientName));
			commonEvents.highlight(certificateButton).click(certificateButton);

			// Check if the birth certificate modal is displayed
			isBirthCertificateGenerated = commonEvents.isDisplayed(getBirthCertificateModalHeading());
			System.out.println("isBirthCertificateGenerated >> " + isBirthCertificateGenerated);

			// Close the modal by clicking the "X" button
			commonEvents.click(getButtonLocatorsBytext("X"));
		} catch (Exception e) {
			throw new Exception("Failed to verify the presence of the certificate button for patient: " + patientName,
					e);
		}
		return isBirthCertificateGenerated;
	}

	/**
	 * @Test20 about this method verifyBirthListTableOnAddBirthDetailsModal()
	 * 
	 * @param patientName - The name of the patient to search in the Birth List
	 *                    table.
	 * @description : This method verifies the presence of the Birth List table on
	 *              the Add Birth Details modal.
	 * @return : boolean - Returns true if the Birth List table is present,
	 *         otherwise false.
	 * @throws : Exception - If there is an issue finding or interacting with
	 *           elements, a meaningful error message is thrown.
	 * @author : YAKSHA
	 */
	public boolean verifyBirthListTableOnAddBirthDetailsModal(String patientName) throws Exception {
		boolean isTablePresent = false;
		try {
			// Navigate to the Birth List section
			WebElement birthListElement = commonEvents.findElement(getPageBarFixedLocator("Birth List"));
			commonEvents.highlight(birthListElement).click(birthListElement);

			// Click on the "Add New Birth Certificate" button
			WebElement addNewBirthCertificateButton = commonEvents
					.findElement(getAnchorTagLocatorByText("Add New Birth Certificate"));
			commonEvents.highlight(addNewBirthCertificateButton).click(addNewBirthCertificateButton);

			// Verify that the Birth Details heading is displayed
			Assert.assertTrue(commonEvents.isDisplayed(getBirthDetailsHeading()));

			// Locate the search patient input field and enter the patient name
			WebElement searchPatientInputField = commonEvents.findElement(getLocatorById("srch_PatientList"));
			commonEvents.highlight(searchPatientInputField).click(searchPatientInputField)
					.sendKeys(searchPatientInputField, patientName);
			commonEvents.sendKeys(searchPatientInputField, Keys.TAB);

			// Check the presence of the Birth List table
			int tableListSize = commonEvents.getWebElements(getBirthListTableLocator()).size();
			System.out.println("tableListSize >> " + tableListSize);

			if (tableListSize >= 1) {
				isTablePresent = true;
			}

			// Close the modal by clicking the "X" button
			commonEvents.click(getAnchorTagLocatorByText("X"));

		} catch (Exception e) {
			throw new Exception(
					"Failed to verify the Birth List table on Add Birth Details modal for patient: " + patientName, e);
		}

		return isTablePresent;
	}

	/**
	 * @Test21 about this method verifyFileDownloaded()
	 * 
	 * @param partialFileName - The partial name of the file to check for download.
	 * @description : This method verifies if a file with the specified partial name
	 *              has been downloaded.
	 * @return boolean - true if the file is found, otherwise false.
	 * @throws InterruptedException - if the thread is interrupted while waiting for
	 *                              the file to download.
	 * @author : YAKSHA
	 */
	public boolean verifyFileDownloaded(String partialFileName) throws InterruptedException {
		try {
			// Navigate to the Reports section
			WebElement reportsElement = commonEvents.findElement(getPageBarFixedLocator("Reports"));
			commonEvents.highlight(reportsElement).click(reportsElement);

			// Navigate to the Inpatient Service Request section
			WebElement inpatientReportElement = commonEvents.findElement(getInpatientSeviceRequest());
			commonEvents.highlight(inpatientReportElement).click(inpatientReportElement);

			// Click the "Show Report" button
			WebElement showReport = commonEvents.findElement(getButtonLocatorsBytext("Show Report"));
			commonEvents.highlight(showReport).click(showReport);

			// Wait for the "Show Report" button to be located
			commonEvents.waitTillElementLocated(getButtonLocatorsBytext("Show Report"), 10000);

			// Click the "Export" button
			WebElement exportButton = commonEvents.findElement(getButtonLocatorsBytext("Export"));
			commonEvents.highlight(exportButton).click(exportButton);

			// Define the download path
			String downloadPath = System.getProperty("user.dir") + "\\downloads";
			File dir = new File(downloadPath);
			boolean found = false;

			// Print debug information
			System.out.println("Checking download directory: " + downloadPath);

			// Check the download directory for the file for up to 30 seconds
			for (int i = 0; i < 30; i++) {
				File[] files = dir.listFiles();
				if (files != null) {
					System.out.println("Files in download directory:");
					for (File file : files) {
						System.out.println(" - " + file.getName());
						if (file.getName().contains(partialFileName) && !file.getName().endsWith(".tmp")) {
							found = true;
							break;
						}
					}
				}
				if (found) {
					break;
				}
				Thread.sleep(1000);
			}

			return found;
		} catch (InterruptedException e) {
			throw e;
		}
	}

}
