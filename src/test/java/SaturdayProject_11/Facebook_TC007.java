package SaturdayProject_11;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_TC007 {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

       // Navigate to facebook page http://www.Facebook.com
        driver.get("http://www.facebook.com");
       // Click on create a new button
        WebElement createAccountButton = driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
        createAccountButton.click();

        // Fill the form with invalid information
        WebElement firstNameInput = driver.findElement(By.name("firstname"));
        firstNameInput.sendKeys("InvalidFirstName");

        WebElement lastNameInput = driver.findElement(By.name("lastname"));
        lastNameInput.sendKeys("InvalidLastName");

        WebElement emailInput = driver.findElement(By.name("reg_email__"));
        emailInput.sendKeys("invalidemail");

        WebElement passwordInput = driver.findElement(By.name("reg_passwd__"));
        passwordInput.sendKeys("InvalidPassword");

        // Choose gender as Male
        WebElement maleRadioBtn = driver.findElement(By.xpath("//input[@value='2']"));
        maleRadioBtn.click();

        // Click Sign Up Button"
        WebElement signUpBtn = driver.findElement(By.name("websubmit"));
        signUpBtn.click();

    }
}
