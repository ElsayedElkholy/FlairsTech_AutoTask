package org.example.pages;

import org.example.stepDef.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BasePage {
    public WebElement Admin_tab_btn() {
        By Admin = By.xpath("//li[1]/a/span");
        WebElement admin_btn = Hooks.driver.findElement(Admin);
        return admin_btn;
    }

    public void click_on_Admin() {
        Admin_tab_btn().click();
    }

    public WebElement Add_btn() {
        By Add = By.xpath("//div[@class=\"orangehrm-header-container\"]/button[@type=\"button\"]");
        WebElement add_btn = Hooks.driver.findElement(Add);
        return add_btn;
    }

    public void click_on_Add(){
        Add_btn().click();
    }

    public int Get_number_of_Records() {
        By Number_of_Records = By.xpath("//div[@Class='orangehrm-horizontal-padding orangehrm-vertical-padding']/span");
        WebElement Records = Hooks.driver.findElement(Number_of_Records);
        String RecordsString = Records.getText();

        int extractedNumber = extractNumber(RecordsString);

        if (extractedNumber != -1) {
            System.out.println("Extracted Number: " + extractedNumber);
        } else {
            System.out.println("No numbers found in the string.");
        }

        return extractedNumber;
    }
    // Function to extract numbers from a string
    private static int extractNumber(String input) {
        // Define the regex pattern
        Pattern pattern = Pattern.compile("\\d+");

        // Create a matcher object
        Matcher matcher = pattern.matcher(input);

        // Find the first match
        if (matcher.find()) {
            // Convert the matched string to an integer
            return Integer.parseInt(matcher.group());
        }
        // Return -1 if no numbers found
        return -1;
    }

}
