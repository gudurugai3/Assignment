package myfirstpck;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class germanylogin {

    public static void main(String[] args) {
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\G S Gayathri\\Downloads\\chromedriver-win64\\chromedriver.exe");

        // Initialize the WebDriver and open Chrome
        WebDriver driver = new ChromeDriver();
        
        // Maximize the browser window
        driver.manage().window().maximize();
        
        // Open the login page
        driver.get("https://app.germanyiscalling.com/");

        // Locate the username field and enter a value
        WebElement txtusername = driver.findElement(By.name("username"));
        txtusername.sendKeys("gudurugai384_gmail.com");  // Replace with actual username

        // Locate the password field and enter a value
        WebElement txtpassword = driver.findElement(By.name("password"));
        txtpassword.sendKeys("@Gayathri84!");  // Replace with actual password

        // Locate the login button and click it
        WebElement loginButton = driver.findElement(By.xpath("//button[normalize-space()='Log In']"));
        loginButton.click();

        // Wait for a specific element that confirms a successful login, e.g., a dashboard element
        try {
            Thread.sleep(3000); // Add a short wait time to allow the next page to load

            // Check if a specific element that only appears on the dashboard or post-login page is displayed
            WebElement dashboardElement = driver.findElement(By.id("dashboard")); // Replace with an actual element that is unique to a successful login

            if (dashboardElement.isDisplayed()) {
                System.out.println("Login is successful!");
            }
        } catch (Exception e) {
            System.out.println("Login failed or element not found.");
        }

        // Close the browser after the test
        driver.quit();
    }
}
