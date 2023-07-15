package GitHubIssueCreationAndClose;

import Helpers.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static Helpers.ColorPrinter.printColorMessage;

public class IssuesPage extends BasePage {

    By NewIssueButtonLocator = By.xpath("//span[@class='d-none d-md-block']");
    By IssueTitleLocator = By.xpath("//input[@id='issue_title']");
    By IssueCommentLocator = By.xpath("//textarea[@id='issue_body']");
    By SubmitNewIssueButtonLocator = By.xpath("//button[@class='btn-primary btn ml-2']");
    By AddCommentBeforeIssueCloseLocator = By.xpath("//textarea[@id='new_comment_field']");
    By CloseIssueWithCommentButtonLocator = By.xpath("//span[@class='js-form-action-text']");
    By ClosedIssueSignLocator = By.xpath("//div[@class='flex-shrink-0 mb-2 flex-self-start flex-md-self-center']//span[@title='Status: Closed'][normalize-space()='Closed']");

    private final static String TITLE = "Issues Page";

    Logger logger = LogManager.getLogger();

    public IssuesPage(WebDriver driver) {
        super(driver, TITLE);
    }

    public WebElement getClosedIssueSign() {
        return driver.findElement(ClosedIssueSignLocator);
    }

    public IssuesPage SubmitIssueForm(String title, String comment, String closeComment) {
        driver.findElement(NewIssueButtonLocator).click();
        driver.findElement(IssueTitleLocator).sendKeys(title);
        driver.findElement(IssueCommentLocator).sendKeys(comment);
        driver.findElement(SubmitNewIssueButtonLocator).click();
        printColorMessage("Issue has been created.", logger, Level.DEBUG);
        driver.findElement(AddCommentBeforeIssueCloseLocator).sendKeys(closeComment);
        driver.findElement(CloseIssueWithCommentButtonLocator).click();
        printColorMessage("Issue has been closed with comment.", logger, Level.DEBUG);
        driver.findElement(ClosedIssueSignLocator).isDisplayed();
        return this;

    }
}