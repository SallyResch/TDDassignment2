import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.time.Duration;

public class HelloSelenium {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriverManager.safaridriver().setup();
        WebDriverManager.firefoxdriver().setup();

        WebDriver driver;

        driver = new ChromeDriver();
        driver.get("https://www.google.se");

        System.out.println(driver.getTitle());
        System.out.println(driver.getPageSource());
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
        //Thread.sleep(5*1000);

        WebElement searchBox = driver.findElement(By.name("q"));
        WebElement searchButton = driver.findElement(By.name("btnK"));

        searchBox.sendKeys("Selenium");
        System.out.println(searchBox.getAttribute("value"));

        searchButton.click();
        searchButton.getText();
        searchBox = driver.findElement(By.name("q"));
        searchBox.getAttribute("value");

        driver.quit();

    }
}
