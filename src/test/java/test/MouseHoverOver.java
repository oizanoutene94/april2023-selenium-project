package test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class MouseHoverOver {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdreiver.chrome.driver", "C:\\Users\\ouelhadj\\eclipse-workspace\\MarchProject1\\seleniumWebDriverProject\\driver\\chromedriver.exe");

        //--open browser
        WebDriver driver = new ChromeDriver();
        System.out.println("browser opened success");
        driver.manage().window().maximize();


        // --navigate to"https/:www.amazon.com"

        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        // hover over the button
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(By.id("mousehover"))).build().perform();
        Thread.sleep(3000);
        driver.close();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.ScrollBy(5,765)","");

    }
}