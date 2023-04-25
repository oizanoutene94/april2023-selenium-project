package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Locators {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        driver.findElement(By.id("inputUsername")).sendKeys("abcd123@outlook.com");
        driver.findElement(By.name("inputPassword")).sendKeys("abcd123");
        driver.findElement(By.className("signInBtn")).click();
        System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
        Thread.sleep(3000);
        driver.findElement(By.linkText("Forgot your password?")).click();
        driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("jhon midi");
        driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("abcd123@yahoo.com");
        driver.findElement(By.xpath("//input[@placeholder='Phone Number']")).sendKeys("2546567643");
        Thread.sleep(3000);
        driver.close();
    }
}
