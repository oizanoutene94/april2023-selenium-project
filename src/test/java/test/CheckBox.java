package test;

import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdreiver.chrome.driver", "C:\\Users\\ouelhadj\\eclipse-workspace\\MarchProject1\\seleniumWebDriverProject\\driver\\chromedriver.exe");

        //--open browser
        WebDriver driver = new ChromeDriver();
        System.out.println("browser opened success");
        driver.manage().window().maximize();

        // --navigate to"https/:www.rahulshetty.com"

        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.findElement(By.id("checkBoxOption2")).click();
        Assert.assertFalse(driver.findElement(By.id("checkBoxOption1")).isSelected());
        System.out.println(driver.findElement(By.id("checkBoxOption1")).isSelected());
        Assert.assertTrue(driver.findElement(By.id("checkBoxOption2")).isSelected());

        System.out.println(driver.findElement(By.id("checkBoxOption2")).isSelected());
        Assert.assertFalse(driver.findElement(By.id("checkBoxOption3")).isSelected());

        System.out.println(driver.findElement(By.id("checkBoxOption3")).isSelected());
        Thread.sleep(4000);
        driver.close();


     }

    }