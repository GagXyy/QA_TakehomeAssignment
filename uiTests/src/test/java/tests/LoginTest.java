package tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.DashboardPage;
import pages.LoginPage;
import utilities.ConfigReader;

public class LoginTest extends BaseClass {

    LoginPage loginPage;
    DashboardPage dashboardPage;
    ConfigReader config;

    @BeforeMethod
    public void setUp() {

        setup();

        loginPage = new LoginPage(driver);
        dashboardPage = new DashboardPage(driver);
        config = new ConfigReader();

    }

    @Test(priority = 1)
    public void verifyValidLogin() throws InterruptedException {

        loginPage.login(config.getUsername(), config.getPassword());

        Assert.assertTrue(dashboardPage.isDashboardDisplayed(),
                "Dashboard is not displayed.");

    }

    @Test(priority = 2)
    public void verifyLogout() throws InterruptedException {

        loginPage.login(config.getUsername(), config.getPassword());
        Thread.sleep(3000);
        dashboardPage.logout();

        Assert.assertTrue(driver.getCurrentUrl().contains("login"));

    }

    @Test(priority = 3)
    public void verifyInvalidUsername() throws InterruptedException {

        loginPage.login("InvalidUser", config.getPassword());

        Assert.assertEquals(loginPage.getInvalidCredentialMessage(),
                "Invalid credentials");

    }

    @AfterMethod
    public void tearDownTest() {
try {
	Thread.sleep(5000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
        tearDown();

    }

}