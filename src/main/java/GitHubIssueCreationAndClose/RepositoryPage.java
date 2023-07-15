package GitHubIssueCreationAndClose;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RepositoryPage extends BasePage {

    By IssueLocator = By.xpath("//a[@id='issues-tab']");


    private final static String TITLE = "Repository Page";

    public RepositoryPage(WebDriver driver) {
        super(driver, TITLE);
    }

    public IssuesPage goToIssuesPage() {
        driver.findElement(IssueLocator).click();
        return new IssuesPage(driver);
    }
}