

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class App {
    public static void main(String[] args) {
      
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");

       
        WebDriver driver = new ChromeDriver();

    
        driver.get("https://www.facebook.com");

       
        WebElement emailInput = driver.findElement(By.id("email"));
        emailInput.sendKeys("your_email@example.com");  
        WebElement passwordInput = driver.findElement(By.id("pass"));
        passwordInput.sendKeys("your_password");
        WebElement loginButton = driver.findElement(By.name("login"));
        loginButton.click();
        String expectedTitle = "Facebook";
        String actualTitle = driver.getTitle();
        if (actualTitle.equals(expectedTitle)) {
            System.out.println("Login successful");
        } else {
            System.out.println("Login failed");
        }

        // Close the browser
        driver.quit();
    }
}
