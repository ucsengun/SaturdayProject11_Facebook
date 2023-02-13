package SaturdayProject_11;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

/**Test Scenario:Verify to Sign up Facebook
 Test Case:Fill the form with valid credentials as a Female;
 Precondition:Valid Username,Valid Password
 Test Steps:
 1-Navigate to facebook page http://www.Facebook.com
 2-Click on create a new button
 3-Fill the form with valid information
 4-Choose gender as Female
 5-Click Sign Up Button
 Test Data:<Valid Username>
 Expected Result: Successful Sign up
 Actual Result:
 PASS/FAIL:
 */

public class Facebook_TC002 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://www.facebook.com");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //locate the create a new account button and click on it
        //HTML source code for button:
        //<a role="button" class="_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy" href="#" ajaxify="/reg/spotlight/" id="u_0_0_5I" data-testid="open-registration-form-button" rel="async">Create new account</a>
        WebElement button=driver.findElement(By.cssSelector("a[rel='async']"));
        button.click();


        //HTML source code for First Name:
        // <input type="text" class="inputtext _58mg _5dba _2ph-" data-type="text" name="firstname" value="" aria-required="true" placeholder="" aria-label="First name" id="u_3_b_E8" tabindex="0" aria-describedby="js_1b">
        WebElement firstName= driver.findElement(By.name("firstname"));
        firstName.sendKeys("Nebahat");


        //HTML source code for Last Name:
        //<input type="text" class="inputtext _58mg _5dba _2ph-" data-type="text" name="lastname" value="" aria-required="true" placeholder="" aria-label="Last name" id="u_3_d_Yr">
        WebElement lastName= driver.findElement(By.name("lastname"));
        lastName.sendKeys("Ozcan");


        //HTML source code for Email:
        //<input type="text" class="inputtext _58mg _5dba _2ph-" data-type="text" name="reg_email__" value="" aria-required="true" placeholder="" aria-label="Mobile number or email" id="u_3_g_OU">
        WebElement phoneNum= driver.findElement(By.name("reg_email__"));
        phoneNum.sendKeys("9293956509");



        //HTML source code for New Password:
        //<input type="password" class="inputtext _58mg _5dba _2ph-" data-type="password" autocomplete="new-password" name="reg_passwd__" id="password_step_input" aria-required="true" placeholder="" aria-label="New password">
        WebElement password= driver.findElement(By.id("password_step_input"));
        password.sendKeys("Nebahat1*12&3");


        //HTML source code for BirthMonth:
        // <select aria-label="Month" name="birthday_month" id="month" title="Month" class="_9407 _5dba _9hk6 _8esg"><option value="1">Jan</option><option value="2" selected="1">Feb</option><option value="3">Mar</option><option value="4">Apr</option><option value="5">May</option><option value="6">Jun</option><option value="7">Jul</option><option value="8">Aug</option><option value="9">Sep</option><option value="10">Oct</option><option value="11">Nov</option><option value="12">Dec</option></select>
        WebElement birthMonth=driver.findElement(By.id("month"));
        Select month=new Select(birthMonth);
        month.selectByVisibleText("Feb");


        //HTML source code for BirthDay:
        //<select aria-label="Day" name="birthday_day" id="day" title="Day" class="_9407 _5dba _9hk6 _8esg"><option value="1">1</option><option value="2">2</option><option value="3">3</option><option value="4">4</option><option value="5">5</option><option value="6">6</option><option value="7">7</option><option value="8">8</option><option value="9">9</option><option value="10">10</option><option value="11" selected="1">11</option><option value="12">12</option><option value="13">13</option><option value="14">14</option><option value="15">15</option><option value="16">16</option><option value="17">17</option><option value="18">18</option><option value="19">19</option><option value="20">20</option><option value="21">21</option><option value="22">22</option><option value="23">23</option><option value="24">24</option><option value="25">25</option><option value="26">26</option><option value="27">27</option><option value="28">28</option><option value="29">29</option><option value="30">30</option><option value="31">31</option></select>
        WebElement birthday=driver.findElement(By.id("day"));
        Select day=new Select(birthday);
        day.selectByVisibleText("5");


        //Birth year
        WebElement birthYear=driver.findElement(By.id("year"));
        Select year=new Select(birthYear);
        year.selectByVisibleText("1989");


        //HTML source code for Gender
        //<input type="radio" class="_8esa" name="sex" value="1" id="u_3_4_Za">
        WebElement female=driver.findElement(By.className("_8esa"));
        female.click();

        //<button type="submit" class="_6j mvm _6wk _6wl _58mi _3ma _6o _6v" name="websubmit" id="u_3_s_pK">Sign Up</button>
        WebElement submitButton=driver.findElement(By.name("websubmit"));
        submitButton.click();



    }
}


