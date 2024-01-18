package GitHubIssueCreationAndClose;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage extends BasePage {

    By RepositoryLocator = By.xpath("//ul[@data-filterable-for='dashboard-repos-filter-left']//span[@class='color-fg-muted']");
    private final static String TITLE = "Main Page";

    public MainPage(WebDriver driver) {
        super(driver, TITLE);
    }

    public RepositoryPage goToRepository() {
        driver.findElement(RepositoryLocator).click();
        return new RepositoryPage(driver);
    }
}