package org.example.pages;

import org.example.stepDef.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P01_LoginPage {
    public WebElement username()
    {
        By username = By.xpath("//input[@name=\"username\"]");
        WebElement username_input = Hooks.driver.findElement(username);
        return username_input;
    }

    public WebElement password()
    {
        By password = By.xpath("//input[@name=\"password\"]");
        WebElement password_input = Hooks.driver.findElement(password);
        return password_input;

    }
    public WebElement Login_btn()
    {
        By login = By.xpath("//button[@type=\"submit\"]");
        WebElement login_btn = Hooks.driver.findElement(login);
        return login_btn;

    }

    public void loginStep_username(String username){
        username().clear();
        username().sendKeys(username);
    }
    public void loginStep_password(String password){
        password().clear();
        password().sendKeys(password);
    }
    public void loginbutton(){
        Login_btn().click();
    }
}