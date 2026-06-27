package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {

    WebDriver driver;
    WebDriverWait wait;

    public LoginPage(WebDriver driver) {

        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        PageFactory.initElements(driver, this);

    }

    @FindBy(name = "username")
    WebElement txtUsername;

    @FindBy(name = "password")
    WebElement txtPassword;

    @FindBy(xpath = "//button[@type='submit']")
    WebElement btnLogin;

    @FindBy(xpath = "//p[text()='Invalid credentials']")
    WebElement txtInvalidCredentials;

    public void enterUsername(String username) {

        wait.until(ExpectedConditions.visibilityOf(txtUsername));
        txtUsername.clear();
        txtUsername.sendKeys(username);

    }

    public void enterPassword(String password) {

        txtPassword.clear();
        txtPassword.sendKeys(password);

    }

    public void clickLogin() {

        btnLogin.click();

    }

    public void login(String username, String password) throws InterruptedException {

        enterUsername(username);
        Thread.sleep(3000);         // Used only  for slow steps execution so that we can see how it executed each steps.
        enterPassword(password);
        Thread.sleep(3000);
        clickLogin();

    }

    public String getInvalidCredentialMessage() {

        wait.until(ExpectedConditions.visibilityOf(txtInvalidCredentials));
        return txtInvalidCredentials.getText();

    }

}