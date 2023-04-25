package test;

import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Vesibility {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdreiver.chrome.driver", "C:\\Users\\ouelhadj\\eclipse-workspace\\MarchProject1\\seleniumWebDriverProject\\driver\\chromedriver.exe");

        //--open browser
        WebDriver driver = new ChromeDriver();
        System.out.println("browser opened success");
        driver.manage().window().maximize();

        // --navigate to"https/:www.amazon.com"

        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.findElement(By.id("displayed-text")).sendKeys("Test1");
        driver.findElement(By.id("hide-textbox")).click();
        Assert.assertFalse(driver.findElement(By.id("displayed-text")).isDisplayed());
        Thread.sleep(4000);
        driver.findElement(By.id("show-textbox")).click();
        Assert.assertTrue(driver.findElement(By.id("displayed-text")).isDisplayed());
        Thread.sleep(3000);
        driver.close();

    }
}
