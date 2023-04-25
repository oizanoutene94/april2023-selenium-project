package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleCalander {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdreiver.chrome.driver", "C:\\Users\\ouelhadj\\eclipse-workspace\\MarchProject1\\seleniumWebDriverProject\\driver\\chromedriver.exe");

        //--open browser
        WebDriver driver = new ChromeDriver();
        System.out.println("browser opened success");
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

    }
}