package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;


public class AutoSuggestive {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdreiver.chrome.driver", "C:\\Users\\ouelhadj\\eclipse-workspace\\MarchProject1\\seleniumWebDriverProject\\driver\\chromedriver.exe");

        //--open browser
        WebDriver driver = new ChromeDriver();
        System.out.println("browser opened success");
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        driver.findElement(By.id("autosuggest")).sendKeys("ind");
        Thread.sleep(3000);
        List<WebElement> options=driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
        for (WebElement option:options) {
            if(option.getText().equalsIgnoreCase("India")){
                option.click();
            }
            driver.close();


        }




        }
    }
