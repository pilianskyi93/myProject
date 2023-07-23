package GitHubIssueCreationAndClose;

import Helpers.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static Helpers.ColorPrinter.printColorMessage;
import static org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable;

public class IssuesPage extends BasePage {

    By newIssueButtonLocator = By.xpath("//span[@class='d-none d-md-block']");
    By issueTitleLocator = By.xpath("//input[@id='issue_title']");
    By issueCommentLocator = By.xpath("//textarea[@id='issue_body']");
    By submitNewIssueButtonLocator = By.xpath("//button[@class='btn-primary btn ml-2']");
    By addCommentBeforeIssueCloseLocator = By.xpath("//textarea[@id='new_comment_field']");
    By closeIssueWithCommentButtonLocator = By.xpath("//span[@class='js-form-action-text']");
    By closedIssueSignLocator = By.xpath("//div[@class='flex-shrink-0 mb-2 flex-self-start flex-md-self-center']//span[@title='Status: Closed'][normalize-space()='Closed']");
    By labelsButtonLocator = By.xpath("//div[@class='ml-2 pl-2 d-none d-md-flex']//a[@href='/pilya93/test/labels']");
    By labelsCountLocator = By.xpath("//span[@class='js-labels-count' and text()='0']");


    private final static String TITLE = "Issues Page";

    Logger logger = LogManager.getLogger();

    public IssuesPage(WebDriver driver) {
        super(driver, TITLE);
    }

    public WebElement getClosedIssueSign() {
        return driver.findElement(closedIssueSignLocator);
    }

    public IssuesPage submitIssueForm(String title, String comment, String closeComment) {
        driver.findElement(newIssueButtonLocator).click();
        driver.findElement(issueTitleLocator).sendKeys(title);

        driver.findElement(issueCommentLocator).sendKeys(comment);
        driver.findElement(submitNewIssueButtonLocator).click();
        printColorMessage("Issue has been created.", logger, Level.DEBUG);
        driver.findElement(addCommentBeforeIssueCloseLocator).sendKeys(closeComment);
        driver.findElement(closeIssueWithCommentButtonLocator).click();
        printColorMessage("Issue has been closed with comment.", logger, Level.DEBUG);
        driver.findElement(closedIssueSignLocator).isDisplayed();
        return this;

    }

    public void clickLabelsButton() {
        webDriverWait.until(elementToBeClickable(driver.findElement(labelsButtonLocator)));
        driver.findElement(labelsButtonLocator).click();
    }

    public WebElement noMatchingLabels() {
        return driver.findElement(labelsCountLocator);
    }
}