Project Overview
This project tests the login functionality of a web application by automating the process of entering valid credentials and verifying the successful login.

Technologies Used
Java: Programming language used for the test script.
Selenium WebDriver: For automating browser interactions.

Java JDK
Selenium WebDriver
Clone the repository:

Ensure you have the correct WebDriver (e.g., ChromeDriver) for your browser version. Update the path in your code accordingly.

// Example:
System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

Test Script Overview
The script automates the following steps:

Navigate to the login page.
Enter valid username and password.
Click the login button.
Verify that the user is successfully logged in by checking for a specific element on the dashboard.
