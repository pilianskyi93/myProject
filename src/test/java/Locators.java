import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class Locators {
    private WebDriver driver;

    //Locators list (Code tab)
    WebElement issuesButton = driver.findElement(By.id("issues-tab"));
    WebElement pullRequestsButton = driver.findElement(By.xpath("//a[@id=\"pull-requests-tab\"]"));
    WebElement actionsButton = driver.findElement(By.xpath("//a[@id=\"actions-tab\"]"));
    WebElement projectsButton = driver.findElement(By.xpath("//a[@id=\"projects-tab\"]"));
    WebElement profileAvatar = driver.findElement(By.xpath("//span[@class=\"Button-label\"]/child::img"));
    WebElement gitHubLogo = driver.findElement(By.xpath("//a[@class=\"AppHeader-logo ml-2\"]"));
    WebElement importCodeButton = driver.findElement(By.xpath("//a[@class =\"btn btn-sm\"]"));
    WebElement setUpInDesktopButton = driver.findElement(By.xpath("//a[@class =\"btn btn-sm primary js-remove-unless-platform\"]"));
    WebElement createNewFileButton = driver.findElement(By.xpath("//a[@data-ga-click=\"Empty repo, click, Clicked create new file link\"]"));
    WebElement searchField = driver.findElement(By.xpath("//span[@data-target = \"qbsearch-input.inputButtonText\"]"));


    //5 xpathes (Actions tab)
    WebElement requestButton = driver.findElement(By.xpath("//a[@class=\"btn mr-2 btn-block\"]"));
    WebElement setUpAWorkFlowYourselfButton = driver.findElement(By.xpath("//a[@data-hydro-click-hmac=\"d4f75abe649849b778f4ba32c0f485594940d5c0d727085cb478bbcf6f5c8ba1\"] "));
    WebElement configureButton = driver.findElement(By.xpath("//a[@class=\"btn d-none d-lg-inline-block\"]"));
    WebElement deploynodeJsToAzureWebAppConfigureButton = driver.findElement(By.xpath("//body/div[contains(@class,'logged-in env-production page-responsive')]/div[contains(@class,'application-main')]/div[1]"));
    WebElement termsButton = driver.findElement(By.xpath("//li[@Class=\"mr-3 mr-lg-0\"]/a[text()=\"Terms\"]"));

}