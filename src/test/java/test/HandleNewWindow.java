package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class HandleNewWindow {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdreiver.chrome.driver", "C:\\Users\\ouelhadj\\eclipse-workspace\\MarchProject1\\seleniumWebDriverProject\\driver\\chromedriver.exe");

        //--open browser
        WebDriver driver = new ChromeDriver();
        System.out.println("browser opened success");
        driver.manage().window().maximize();

        // --navigate to"https/:www.amazon.com"

        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        // click on the button to open a new window then grab the test from the webelement \
        driver.findElement(By.id("openwindow")).click();
        Set<String> windows =driver.getWindowHandles();
        Iterator<String> iterator = windows.iterator();
        String parentWin = iterator.next();
        String childWin = iterator.next();
        driver.switchTo().window(childWin);
        driver.manage().window().maximize();
        String text=driver.findElement(By.cssSelector(".header-opening-time.text-lg-right.text-center p")).getText();
        System.out.println(text);
        driver.close();
        driver.switchTo().window(parentWin);
        driver.close();

    }
}