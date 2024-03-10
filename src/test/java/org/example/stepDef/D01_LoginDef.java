package org.example.stepDef;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.example.pages.BasePage;
import org.example.pages.P01_LoginPage;
import org.testng.Assert;
import java.util.concurrent.TimeUnit;

import static org.example.stepDef.Hooks.driver;
public class D01_LoginDef {
    P01_LoginPage LoginPage =new P01_LoginPage();
    BasePage BasePage =new BasePage();
    String current_url = driver.getCurrentUrl().toLowerCase();

    @Given("user navigate to Login page")
    public void user_navigate_to_Login_page(){
        String url = "https://opensource-demo.orangehrmlive.com/";
        driver.navigate().to(url);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }
    @When("Enter \"(.*)\" as username$")
    public void Enter_username(String username) {
        LoginPage.loginStep_username(username);
        //Assert.assertTrue(current_url.equals("https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index"));
    }
    @And("Enter \"(.*)\" as password$")
    public void Enter_password(String password) {
        LoginPage.loginStep_password(password);
    }
    @And("Click on the login button")
    public void Click_on_login() {
        LoginPage.loginbutton();
    }


}