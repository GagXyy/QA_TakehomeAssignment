package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DashboardPage {

    WebDriver driver;
    WebDriverWait wait;

    public DashboardPage(WebDriver driver) {

        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        PageFactory.initElements(driver, this);

    }

    @FindBy(xpath = "//h6[text()='Dashboard']")
    WebElement dashboardHeader;

    @FindBy(className = "oxd-userdropdown-tab")
    WebElement profileIcon;

    @FindBy(linkText = "Logout")
    WebElement logout;

    public boolean isDashboardDisplayed() {

        wait.until(ExpectedConditions.visibilityOf(dashboardHeader));
        return dashboardHeader.isDisplayed();

    }

    public void logout() {

        wait.until(ExpectedConditions.elementToBeClickable(profileIcon)).click();
        try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        wait.until(ExpectedConditions.elementToBeClickable(logout)).click();

    }

}