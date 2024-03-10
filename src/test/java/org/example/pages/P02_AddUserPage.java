package org.example.pages;

import org.example.stepDef.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
public class P02_AddUserPage {

    public void Select_Admin_Role() {
        By Role_list = By.className("oxd-select-text-input");
        WebElement dropdownElement = Hooks.driver.findElement(Role_list);
        dropdownElement.click();
        // to select the first item it the list
        dropdownElement.sendKeys(Keys.ARROW_DOWN);
        dropdownElement.sendKeys(Keys.ENTER);

        }

    public void Enter_Employee_Name(String Name) {
        //By name = By.xpath("//div[@class=\"oxd-grid-item oxd-grid-item--gutters\"]//input[@class=\"oxd-input oxd-input--active\"]");
        By name = By.xpath("//input[@placeholder=\"Type for hints...\"]");
        WebElement dropdownElement = Hooks.driver.findElement(name);
        dropdownElement.click();
        // to select the first item it the list
        dropdownElement.sendKeys(Name);
        dropdownElement.sendKeys(Keys.ARROW_DOWN);
        dropdownElement.sendKeys(Keys.ENTER);
    }
    public void Enter_Username(String Username) {
        By username = By.xpath("//div[@class=\"oxd-grid-item oxd-grid-item--gutters\"]/div/div/input[@class=\"oxd-input oxd-input--active\"]");
        WebElement user_name = Hooks.driver.findElement(username);
        user_name.sendKeys(Username);
    }
    public void Enter_Pass(String Pass) {
        By pass1 = By.xpath("//div[1]/div/div/input");
        WebElement pass_1 = Hooks.driver.findElement(pass1);
        pass_1.sendKeys(Pass);
        By pass2 = By.xpath("//div[2]/div/div/input[@type=\"password\"]");
        WebElement pass_2 = Hooks.driver.findElement(pass2);
        pass_2.sendKeys(Pass);
    }
    public WebElement Save_button() {
        By save = By.xpath("//button[@type=\"submit\"]");
        WebElement save_btn = Hooks.driver.findElement(save);
        return save_btn;
    }
}
