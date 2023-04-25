package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropDown {
    public static void main(String[] args) throws InterruptedException{

        WebDriver driver = new ChromeDriver();
        System.out.println("browser opened successfully");
        driver.manage().window().maximize();

        // navigate to https:\\www.rahulshettyacademy.com
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        WebElement dropdown =driver.findElement(By.id("dropdown-class-example"));
        Select select = new Select(dropdown);
        for (WebElement option: select.getOptions()) {
            System.out.println(option.getText());
        }
        select.selectByValue("option2");
        Thread.sleep (3000);




    }

}
