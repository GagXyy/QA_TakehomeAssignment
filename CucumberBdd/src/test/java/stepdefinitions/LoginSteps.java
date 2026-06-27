package stepdefinitions;

import org.testng.Assert;

import base.BaseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.DashboardPage;
import pages.LoginPage;
import utilities.ConfigReader;

public class LoginSteps extends BaseClass {

    LoginPage loginPage;
    DashboardPage dashboardPage;
    ConfigReader config;

    @Given("User launches OrangeHRM application")
    public void user_launches_orangehrm_application() {

        loginPage = new LoginPage(driver);
        dashboardPage = new DashboardPage(driver);
        config = new ConfigReader();

    }

    @When("User logs in with valid username and password")
    public void user_logs_in_with_valid_username_and_password() {

        try {
			loginPage.login(config.getUsername(), config.getPassword());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

    }

    @When("User logs in with invalid username and valid password")
    public void user_logs_in_with_invalid_username_and_valid_password() {

        try {
			loginPage.login("InvalidUser", config.getPassword());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

    }

    @And("User logs out from the application")
    public void user_logs_out_from_the_application() {

        dashboardPage.logout();

    }

    @Then("Dashboard page should be displayed")
    public void dashboard_page_should_be_displayed() {

        Assert.assertTrue(
                dashboardPage.isDashboardDisplayed(),
                "Dashboard page is not displayed.");

    }

    @Then("Login page should be displayed")
    public void login_page_should_be_displayed() {

        Assert.assertTrue(
                driver.getCurrentUrl().contains("login"),
                "Login page is not displayed.");

    }

    @Then("Invalid credentials message should be displayed")
    public void invalid_credentials_message_should_be_displayed() {

        Assert.assertEquals(
                loginPage.getInvalidCredentialMessage(),
                "Invalid credentials");

    }

}