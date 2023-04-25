package test;

import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class RadioButton {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdreiver.chrome.driver", "C:\\Users\\ouelhadj\\eclipse-workspace\\MarchProject1\\seleniumWebDriverProject\\driver\\chromedriver.exe");

        //--open browser
        WebDriver driver = new ChromeDriver();
        System.out.println("browser opened success");
        driver.manage().window().maximize();

        // --navigate to"https/:www.amazon.com"

        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        List<WebElement> radioButtons = driver.findElements(By.name("radioButton"));
        for (WebElement radioButton : radioButtons) {
            if (radioButton.getAttribute("value").equals("radio3")) {
                radioButton.click();
            }

        }
                Thread.sleep(2000);
                driver.close();


            }
        }





