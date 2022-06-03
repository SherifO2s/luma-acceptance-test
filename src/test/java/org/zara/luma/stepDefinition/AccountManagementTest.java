package org.zara.luma.stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AccountManagementTest {
    @Given(" user is on Luma homepage")
    public void userIsOnLumaHomepage() {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://magento2-demo.magebit.com/");

    }

    @When(" user enters {string} {string} {string} {string} {string}")
    public void userEnters(String FirstName, String LastName, String Email, String Password, String ConfirmPassword) {

    }

    @And(" user clicks on Create an Account button")
    public void userClicksOnCreateAnAccountButton() {
    }

    @Then("user homepage should be displayed")
    public void userHomepageShouldBeDisplayed() {
    }
}
