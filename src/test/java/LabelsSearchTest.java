import GitHubIssueCreationAndClose.HomePage;
import GitHubIssueCreationAndClose.IssuesPage;
import GitHubIssueCreationAndClose.MainPage;
import GitHubIssueCreationAndClose.RepositoryPage;
import Helpers.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static Helpers.ColorPrinter.printColorMessage;
import static org.testng.AssertJUnit.assertTrue;

public class LabelsSearchTest extends BaseTest {
    Logger logger = LogManager.getLogger();

    @DataProvider(name = "valuesToSearch")
    public Object[][] testData() {
        return new Object[][]{
                {"bug1"},
                {"documentation2"},
                {"duplicate3"}

        };
    }

    @Test(dataProvider = "valuesToSearch", description = "Search labels logic test")

    public void gitHubLabelsSearchTestParametrized(String valuesToSearch) {

        By searchFieldLocator = By.xpath("//input[@id='js-issues-search' and @name='q' and @class='form-control form-control subnav-search-input input-contrast col-md-6 col-12' and @placeholder='Search all labels']");

        HomePage homePage = new HomePage(driver);
        homePage.goToLoginPage().loginSuccessful("pilya_jan@yahoo.com", "pilya_jan93");

        MainPage mainPage = new MainPage(driver);
        mainPage.goToRepository();
        RepositoryPage repositoryPage = new RepositoryPage(driver);
        repositoryPage.goToIssuesPage();
        IssuesPage issuesPage = new IssuesPage(driver);
        issuesPage.clickLabelsButton();

        WebElement searchField = driver.findElement(searchFieldLocator);
        searchField.sendKeys(valuesToSearch);
        searchField.sendKeys(Keys.ENTER);
        assertTrue(issuesPage.noMatchingLabels().isDisplayed());

        printColorMessage("Test Passed", logger, Level.DEBUG);

    }
}