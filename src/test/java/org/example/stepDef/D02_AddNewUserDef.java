package org.example.stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.BasePage;
import org.example.pages.P01_LoginPage;
import org.example.pages.P02_AddUserPage;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

import static org.example.stepDef.Hooks.driver;

public class D02_AddNewUserDef {
    BasePage BasePage =new BasePage();
    P02_AddUserPage addUserPage = new P02_AddUserPage();
    String current_url = driver.getCurrentUrl().toLowerCase();

    @Then("Click on Admin tab on the left side menu")
    public void Click_on_Admin_tab() {
        BasePage.click_on_Admin();
        Assert.assertTrue(current_url.equals("https://opensource-demo.orangehrmlive.com/web/index.php/admin/viewSystemUsers"));
    }
    @And("Get the number of records found")
    public int Get_Number_of_Records() {
        BasePage.Get_number_of_Records();
        int Records = BasePage.Get_number_of_Records();
        System.out.println(Records);
        return Records;
    }
    @And("Click on add button")
    public void Click_on_add_button() {
        BasePage.click_on_Add();
    }
    @And("Fill the required data Emp\"(.*)\"Username\"(.*)\"Pass\"(.*)\"$")
    public void fill_data(String Emp,String Username,String Pass) {
        addUserPage.Select_Admin_Role();
        addUserPage.Enter_Employee_Name(Emp);
        addUserPage.Enter_Username(Username);
        addUserPage.Enter_Pass(Pass);
        addUserPage.Save_button().click();
    }
    @Then("Verify that the number of records increased by 1")
    public void Check_records_increased() {
        Assert.assertEquals(Get_Number_of_Records(),BasePage.Get_number_of_Records()+1);
    }


}