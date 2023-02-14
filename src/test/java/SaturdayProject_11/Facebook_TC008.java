package SaturdayProject_11;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.Thread.sleep;

public class Facebook_TC008 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        sleep(7000);
        //          1)NAVIGATE TO THE URL (https://.www.facebook.com)
        driver.get("https://www.facebook.com");

        //          2)CLICK ON CREATE NEW ACCOUNT BUTTON
        //HTML CODE//<a role="button" class="_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy" href="#" ajaxify=
        Thread.sleep(7000);
        driver.findElement(By.cssSelector("a[data-testid='open-registration-form-button']")).click();

        //          3)FILL THE FORM
        //<input type="text" class="inputtext _58mg _5dba _2ph-"data-type="text" name="firstname" value="" aria
        Thread.sleep(7000);
        String firstname1 = "Joe";
        driver.findElement(By.name("firstname")).sendKeys(firstname1);

        String lastname = "Done";
        //HTML code of LAST NAME web element//<input type="text" class="inputtext _58mg _5dba _2ph-" data-type="text" name="lastname" value="" aria-required="true" placeholder="" aria-label="Last name" id="u_2_d_0s">
        Thread.sleep(7000);
        driver.findElement(By.name("lastname")).sendKeys(lastname);

        //HTML code of Mobile number or EMAIL web elements//<input type="text" class="inputtext _58mg _5dba _2p
        String email = "joedone@myyahoo.com";
        driver.findElement(By.name("reg_email__")).sendKeys(email);

        //HTML code of RE-ENTER EMAIL web element//<input type="text" class="inputtext _58mg _5dba _2ph-" data-type="text" name="reg_email_confirmation__" value="" aria-required="true" placeholder="" aria-label="Re-enter email" id="u_3_j_El">
        Thread.sleep(7000);
        driver.findElement(By.name("reg_email_confirmation__")).sendKeys(email);

        // HTML code of  NEW PASSWORD web element
        // <input type="password" class="inputtext _58mg _5dba _2ph-" data-type="password" autocomplete="new-password" name="reg_passwd__" id="password_step_input" aria-required="true" placeholder="" aria-label="New password">
        Thread.sleep(7000);
        String password = "29106735@";
        driver.findElement(By.id("password_step_input")).sendKeys(password);

        // HTML code of  Birthday MONTH web element
        //<select aria-label="Month" name="birthday_month" id="month" title="Month" class="_9407 _5dba _9hk6 _
        String month = "Mar";
        driver.findElement(By.id("month")).sendKeys(month);

        // HTML code of  Birthday DAY  web element
        // <select aria-label="Day" name="birthday_day" id="day" title="Day" class="_9407 _5dba _9hk6 _8esg"><option value="1">1</option><option value="2">2</option><option value="3">3</option><option
        String day = "13";
        driver.findElement(By.id("day")).sendKeys(day);

        //HTML code of Birthday YEAR web element
        //<select aria-label="Year" name="birthday_year" id="year" title="Year" class="_9407 _5dba _9hk6 _8esg"><option value="2023" selected="1">2023</option><option value="2022">2022</option><option t>
        String year = "1988";
        driver.findElement(By.id("year")).sendKeys(year);


        //HTML code of GENDER web element
        //<span class="_5k_3" data-type="radio" data-name="gender_wrapper" id="u_3_o_OC"><span class="_5k_2 _
        //<label class="_58mt" for="u_3_5_Ae">Male</label>
        //<input type="radio" class="_8esa" name="sex" value="2" id="u_3_5_Jf">
        Thread.sleep(7000);
        driver.findElement(By.className("_8esa")).click();

        // HTML code of SIGN UP button web element
        //<button type="submit" class="_6j mvm _6wk _6wl _58mi _3ma _6o _6v" name="webs
        Thread.sleep(7000);
        WebElement websubmitButton = driver.findElement(By.name("websubmit"));
        websubmitButton.click();

        //Verification
        if(websubmitButton.isEnabled()){
            System.out.println("verification is DONE : PASS");
        } else {
            System.out.println("verification is DONE :  FAILED");
        }
    }
    }

