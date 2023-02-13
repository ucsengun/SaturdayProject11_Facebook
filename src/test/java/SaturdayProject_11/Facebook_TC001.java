package SaturdayProject_11;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class Facebook_TC001 {
    //1-Navigate to facebook page http://www.Facebook.com
//2-Click on create a new button
//3-Fill the form with valid information
//4-Choose gender as Male
//5-Click Sign Up Button
/**Test Scenario:Verify to Sign up Facebook
 Test Case:Fill the form with valid credentials as a male;
 Precondition:Valid Username,Valid Password
 */
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.facebook.com");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //locate the create a new account button and click on it
        //HTML source code for button:
//<a role="button" class="_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy"
// href="#" ajaxify="/reg/spotlight/" id="u_0_0_of" data-testid="open-registration-form-button"
// rel="async">Create new account</a>
        WebElement createnew = driver.findElement(By.cssSelector("a[rel='async']"));
        createnew.click();
// Username Input :
//        <input type="text" class="inputtext _58mg _5dba _2ph-" data-type="text" name="firstname" value="" aria-required="true" placeholder="" aria-label="First name" id="u_2_b_9H" tabindex="0" aria-describedby="js_2b">

        WebElement firstname = driver.findElement(By.name("firstname"));
        firstname.sendKeys("Umut");
//Lastname Input
//<input type="text" class="inputtext _58mg _5dba _2ph-" data-type="text" name="lastname" value="" aria-required="true" placeholder="" aria-label="Last name" id="u_a_d_By" aria-describedby="js_la">
        WebElement Surname = driver.findElement(By.name("lastname"));
        Surname.sendKeys("Candan");
//Number Input
//        <input type="text" class="inputtext _58mg _5dba _2ph-" data-type="text" name="reg_email__" value="" aria-required="true" placeholder="" aria-label="Mobile number or email" id="u_a_g_v1">
        WebElement numberorEmail = driver.findElement(By.name("reg_email__"));
        numberorEmail.sendKeys("umt.cndan@gmail.com");

//        Re enter email Input :
//        <input type="text" class="inputtext _58mg _5dba _2ph-" data-type="text" name="reg_email_confirmation__" value="" aria-required="true" placeholder="" aria-label="Re-enter email" id="u_2_j_AZ" aria-describedby="js_7u">
        WebElement reenter = driver.findElement(By.name("reg_email_confirmation__"));
        reenter.sendKeys("umt.cndan@gmail.com");



// Password Input
//        <input type="password" class="inputtext _58mg _5dba _2ph-" data-type="password" autocomplete="new-password" name="reg_passwd__" id="password_step_input" aria-required="true" placeholder="" aria-label="New password">

        WebElement password = driver.findElement(By.name("reg_passwd__"));
        password.sendKeys("123456Umut");

// Dropdown Menu birtday month
//<select aria-label="Month" name="birthday_month" id="month" title="Month" class="_9407 _5dba _9hk6 _8esg"><option value="1">Jan</option><option value="2" selected="1">Feb</option><option value="3">Mar</option><option value="4">Apr</option><option value="5">May</option><option value="6">Jun</option><option value="7">Jul</option><option value="8">Aug</option><option value="9">Sep</option><option value="10">Oct</option><option value="11">Nov</option><option value="12">Dec</option></select>
        WebElement month = driver.findElement(By.id("month"));
        Select birthdaymonth = new Select(month);
        birthdaymonth.selectByVisibleText("Nov");
        // Dropdown Menu birtday day
//<select aria-label="Day" name="birthday_day" id="day" title="Day" class="_9407 _5dba _9hk6 _8esg"><option value="1">1</option><option value="2">2</option><option value="3">3</option><option value="4">4</option><option value="5">5</option><option value="6">6</option><option value="7">7</option><option value="8">8</option><option value="9">9</option><option value="10">10</option><option value="11">11</option><option value="12">12</option><option value="13" selected="1">13</option><option value="14">14</option><option value="15">15</option><option value="16">16</option><option value="17">17</option><option value="18">18</option><option value="19">19</option><option value="20">20</option><option value="21">21</option><option value="22">22</option><option value="23">23</option><option value="24">24</option><option value="25">25</option><option value="26">26</option><option value="27">27</option><option value="28">28</option><option value="29">29</option><option value="30">30</option><option value="31">31</option></select>
        WebElement day = driver.findElement(By.id("day"));
        Select birthdayday = new Select(day);
        birthdayday.selectByValue("30");

//        Dropdown Menu birthdayYear
//        <select aria-label="Year" name="birthday_year" id="year" title="Year" class="_9407 _5dba _9hk6 _8esg"><option value="2023" selected="1">2023</option><option value="2022">2022</option><option value="2021">2021</option><option value="2020">2020</option><option value="2019">2019</option><option value="2018">2018</option><option value="2017">2017</option><option value="2016">2016</option><option value="2015">2015</option><option value="2014">2014</option><option value="2013">2013</option><option value="2012">2012</option><option value="2011">2011</option><option value="2010">2010</option><option value="2009">2009</option><option value="2008">2008</option><option value="2007">2007</option><option value="2006">2006</option><option value="2005">2005</option><option value="2004">2004</option><option value="2003">2003</option><option value="2002">2002</option><option value="2001">2001</option><option value="2000">2000</option><option value="1999">1999</option><option value="1998">1998</option><option value="1997">1997</option><option value="1996">1996</option><option value="1995">1995</option><option value="1994">1994</option><option value="1993">1993</option><option value="1992">1992</option><option value="1991">1991</option><option value="1990">1990</option><option value="1989">1989</option><option value="1988">1988</option><option value="1987">1987</option><option value="1986">1986</option><option value="1985">1985</option><option value="1984">1984</option><option value="1983">1983</option><option value="1982">1982</option><option value="1981">1981</option><option value="1980">1980</option><option value="1979">1979</option><option value="1978">1978</option><option value="1977">1977</option><option value="1976">1976</option><option value="1975">1975</option><option value="1974">1974</option><option value="1973">1973</option><option value="1972">1972</option><option value="1971">1971</option><option value="1970">1970</option><option value="1969">1969</option><option value="1968">1968</option><option value="1967">1967</option><option value="1966">1966</option><option value="1965">1965</option><option value="1964">1964</option><option value="1963">1963</option><option value="1962">1962</option><option value="1961">1961</option><option value="1960">1960</option><option value="1959">1959</option><option value="1958">1958</option><option value="1957">1957</option><option value="1956">1956</option><option value="1955">1955</option><option value="1954">1954</option><option value="1953">1953</option><option value="1952">1952</option><option value="1951">1951</option><option value="1950">1950</option><option value="1949">1949</option><option value="1948">1948</option><option value="1947">1947</option><option value="1946">1946</option><option value="1945">1945</option><option value="1944">1944</option><option value="1943">1943</option><option value="1942">1942</option><option value="1941">1941</option><option value="1940">1940</option><option value="1939">1939</option><option value="1938">1938</option><option value="1937">1937</option><option value="1936">1936</option><option value="1935">1935</option><option value="1934">1934</option><option value="1933">1933</option><option value="1932">1932</option><option value="1931">1931</option><option value="1930">1930</option><option value="1929">1929</option><option value="1928">1928</option><option value="1927">1927</option><option value="1926">1926</option><option value="1925">1925</option><option value="1924">1924</option><option value="1923">1923</option><option value="1922">1922</option><option value="1921">1921</option><option value="1920">1920</option><option value="1919">1919</option><option value="1918">1918</option><option value="1917">1917</option><option value="1916">1916</option><option value="1915">1915</option><option value="1914">1914</option><option value="1913">1913</option><option value="1912">1912</option><option value="1911">1911</option><option value="1910">1910</option><option value="1909">1909</option><option value="1908">1908</option><option value="1907">1907</option><option value="1906">1906</option><option value="1905">1905</option></select>
        WebElement year = driver.findElement(By.id("year"));
        Select birthdayYear = new Select(year);
        birthdayYear.selectByVisibleText("1995");

//        <label class="_58mt" for="u_2_5_FM">Male</label>
//<input type="radio" class="_8esa" name="sex" value="2" id="u_2_5_FM">
        WebElement male = driver.findElement(By.cssSelector("input[value='2']"));
        male.click();

        //<button type="submit" class="_6j mvm _6wk _6wl _58mi _3ma _6o _6v" name="websubmit" id="u_3_s_pK">Sign Up</button>
        WebElement submitButton=driver.findElement(By.name("websubmit"));
        submitButton.click();


        System.out.println("PASS");


//





    }
}
