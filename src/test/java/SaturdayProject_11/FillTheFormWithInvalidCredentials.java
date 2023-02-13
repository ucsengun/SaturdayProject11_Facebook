package SaturdayProject_11;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FillTheFormWithInvalidCredentials {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        //"1-Navigate to facebook page http://www.Facebook.com
        driver.get("https://www.facebook.com/");
        //2-Click on create a new button
        //<a role="button" class="_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy" href="#" ajaxify="/reg/spotlight/"
        // id="u_0_0_5J" data-testid="open-registration-form-button" rel="async">Create new account</a>
        WebElement createNewAccount= driver.findElement(By.linkText("Create new account"));
        createNewAccount.click();
        //3-Fill the form with invalid information

        //<input type="text" class="inputtext _58mg _5dba _2ph-" data-type="text" name="firstname" value="" aria-required="true" placeholder=""
        // aria-label="First name" id="u_4_b_Po" tabindex="0" aria-describedby="js_co" aria-invalid="true">
        // WebElement firstname=driver.findElement(By.name("firstname"));
        //firstname.sendKeys("123");
        WebElement firstName= driver.findElement(By.name("firstname"));
        firstName.sendKeys("Nebahat");

//for email
        //<input type="text" class="inputtext _58mg _5dba _2ph-" data-type="text" name="reg_email__"
        // value="" aria-required="true" placeholder="" aria-label="Mobile number or email" id="u_4_g_4R">

        WebElement email= driver.findElement(By.name("reg_email__"));
        email.sendKeys("email_email@gmail.com");


        //4-Choose gender as Custom
        //<span class="_5k_3" data-type="radio" data-name="gender_wrapper" id="u_4_o_D9"><span class="_5k_2 _5dba"><label class="_58mt" for="u_4_4_0Y">Female</label><input type="radio" class="_8esa" name="sex" value="1" id="u_4_4_0Y"></span><span class="_5k_2 _5dba"><label class="_58mt" for="u_4_5_PB">Male</label><input type="radio" class="_8esa" name="sex" value="2" id="u_4_5_PB"></span><span class="_5k_2 _5dba"><label class="_58mt"
        // for="u_4_6_/+">Custom</label><input type="radio" class="_8esa" name="sex" value="-1" id="u_4_6_/+"></span></span>
//<input type="radio" class="_8esa" name="sex" value="-1" id="u_4_6_/+">
        //  WebElement gender=driver.findElement(By.cssSelector("#span"));
        //gender.click();

    }
}

