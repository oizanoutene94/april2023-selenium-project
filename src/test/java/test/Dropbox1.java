package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropbox1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdreiver.chrome.driver", "C:\\Users\\ouelhadj\\eclipse-workspace\\MarchProject1\\seleniumWebDriverProject\\driver\\chromedriver.exe");

        //--open browser
        WebDriver driver = new ChromeDriver();
        System.out.println("browser opened success");
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
        driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
        System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
        System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
       Thread.sleep(5000);


        driver.findElement(By.id("divpaxinfo")).click();
        System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

        Thread.sleep(2000);


    for (int i=0;i<4;i++){
            driver.findElement(By.id("hrefIncAdt")).click();
            Thread.sleep(2000);
        }
            driver.findElement(By.id("btnclosepaxoption")).click();

            System.out.println(driver.findElement(By.id("btnclosepaxoption")).getText());
            driver.close();
        }


    }
