package test;


import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test{
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdreiver.chrome.driver", "C:\\Users\\ouelhadj\\eclipse-workspace\\MarchProject1\\seleniumWebDriverProject\\driver\\chromedriver.exe");

        //--open browser
        WebDriver driver = new ChromeDriver();
        System.out.println("browser opened success");
        driver.manage().window().maximize();

        // --navigate to"https/:www.amazon.com"

        driver.get("https://www.amazon.com");
        String actualTitle = driver.getTitle();
        String expectedTitel = "Amazon.com. Spend less. Smile more.";
        Assert.assertEquals(expectedTitel, actualTitle);
        System.out.println("land on amazon homepage success");

        //--type java book on the search bar

        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Java book ");
        Thread.sleep(2000);
        System.out.println("type a java book on the search bar");

        // click on search bar
        driver.findElement(By.id("nav-search-submit-button")).click();
        String currentUrl=driver.getCurrentUrl();
        String expectedUrl = "Amazon.com:java book";
        Assert.assertEquals(expectedUrl,currentUrl);
        System.out.println("click on search button success");

        //validation
        String actualTitle1=driver.getTitle();
        String expectedTitel1="Amazon.com : java book";
        Assert.assertEquals(expectedTitel1,actualTitle1);
        System.out.println("validate the title success");
        driver.close();
    }
}





