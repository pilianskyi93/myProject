package GitHubIssueCreationAndClose;

import Helpers.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import static Helpers.ColorPrinter.printColorMessage;

public class BasePage {

    protected WebDriver driver;

    protected WebDriverWait webDriverWait;

    protected Logger logger;

    private String title;

    public BasePage(WebDriver driver, String title) {
        this.driver = driver;
        webDriverWait = new WebDriverWait(driver, 5);
        this.title = title;
        this.logger = LogManager.getLogger(this.title);
    }
}