import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class NopCommerce {

    public static void main(String[] args) {
        WebDriver driver;
        System.setProperty("webdriver.chrome.driver","C:\\shop\\sejal\\Sejal Testing\\software\\BrowserDriver\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
        //click on the register button on home page
        driver.findElement(By.className("ico-register")).click();
        driver.findElement(By.id("gender")).click();
        driver.findElement(By.id("FirstName")).sendKeys("Sejal");
        driver.findElement(By.id("LastName")).sendKeys("Makrubiya");
        driver.findElement(By.name("DateOfBirthDay")).sendKeys("2");
        driver.findElement(By.name("DateOfBirthMonth")).sendKeys("March");
        driver.findElement(By.name("DateOfBirthYear")).sendKeys("1989");
        driver.findElement(By.id("Email")).sendKeys("abc@yahoo.com");
        driver.findElement(By.name("Company")).sendKeys("abc");
        driver.findElement(By.id("Password")).sendKeys("gujrati23");
        driver.findElement(By.id("ConfirmPassword")).sendKeys("gujrati23");
        driver.findElement(By.id("register-button")).click();


        //driver.quit();


    }
}
