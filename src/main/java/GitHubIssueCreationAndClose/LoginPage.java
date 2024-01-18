package GitHubIssueCreationAndClose;

import Helpers.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static Helpers.ColorPrinter.printColorMessage;


public class LoginPage extends BasePage {

    private By loginFieldLocator = By.id("login_field");
    private By passwordFieldLocator = By.id("password");
    private By signInButtonLocator = By.xpath("//input[@value=\"Sign in\"]");

    private final static String TITLE = "Login Page";

    Logger logger = LogManager.getLogger();

    public LoginPage(WebDriver driver) {
        super(driver, TITLE);
    }

    public MainPage loginSuccessful(String login, String password) {
        driver.findElement(loginFieldLocator).sendKeys(login);
        driver.findElement(passwordFieldLocator).sendKeys(password);
        driver.findElement(signInButtonLocator).click();
        printColorMessage("User \"pilya_jan@yahoo.com\" has been successfully authenticated.", logger, Level.INFO);
        return new MainPage(driver);

    }
}