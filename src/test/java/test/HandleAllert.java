package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAllert {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdreiver.chrome.driver", "C:\\Users\\ouelhadj\\eclipse-workspace\\MarchProject1\\seleniumWebDriverProject\\driver\\chromedriver.exe");

        //--open browser
        WebDriver driver = new ChromeDriver();
        System.out.println("browser opened success");
        driver.manage().window().maximize();

        // --navigate to"https/:www.amazon.com"

        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        //enter name,click allert,get text,click ok
        driver.findElement(By.id("name")).sendKeys("jhon doe");
        driver.findElement(By.id("alertbtn")).click();
        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().accept();
        Thread.sleep(3000);

        //enter name,click confirm, get text, ok
        driver.findElement(By.id("name")).sendKeys("jhon doe");
        driver.findElement(By.id("confirmbtn")).click();
        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().accept();
        Thread.sleep(3000);

        // enter name then click on confirm then print the text and cancel alert
        driver.findElement(By.id("name")).sendKeys("jhon doe");
        driver.findElement(By.id("confirmbtn")).click();
        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().dismiss();

        //driver.findElement(By.id("confirmbtn")).click();


         Thread.sleep(3000);
         driver.close();

    }
}