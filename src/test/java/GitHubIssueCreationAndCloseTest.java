import GitHubIssueCreationAndClose.HomePage;
import GitHubIssueCreationAndClose.IssuesPage;
import GitHubIssueCreationAndClose.MainPage;
import GitHubIssueCreationAndClose.RepositoryPage;
import Helpers.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

import static Helpers.ColorPrinter.printColorMessage;
import static org.testng.AssertJUnit.assertTrue;

public class GitHubIssueCreationAndCloseTest extends BaseTest {

    Logger logger = LogManager.getLogger();

    @Test
    public void issueCreationAndCloseBaseTest() {
        HomePage homePage = new HomePage(driver);
        homePage.goToLoginPage().loginSuccessful("pilya_jan@yahoo.com", "pilya_jan93");
        MainPage mainPage = new MainPage(driver);
        mainPage.goToRepository();
        RepositoryPage repositoryPage = new RepositoryPage(driver);
        repositoryPage.goToIssuesPage();
        IssuesPage issuesPage = new IssuesPage(driver);
        issuesPage.submitIssueForm("Test title", "Test comment", "Issue closed");
        issuesPage.getClosedIssueSign();
        assertTrue(issuesPage.getClosedIssueSign().isDisplayed());
        printColorMessage("Test Passed", logger, Level.DEBUG);
    }
}