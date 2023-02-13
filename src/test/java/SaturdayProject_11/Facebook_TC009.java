package SaturdayProject_11;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook_TC009 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.facebook.com");


        /**<div class="_6ltg">
         * <a role="button" class="_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy" href="#"
         * ajaxify="/reg/spotlight/" id="u_0_0_pN"
         * data-testid="open-registration-form-button" rel="async">Create new account</a></div>*/

        WebElement newAccountButton=driver.findElement(By.cssSelector("a[rel='async']"));
        newAccountButton.click();
        Thread.sleep(3000);

        /**<input type="text" class="inputtext _58mg _5dba _2ph-" data-type="text" name="firstname" value="" aria-required="true" placeholder=""
         * aria-label="First name" id="u_3_b_M5" tabindex="0" aria-describedby="js_8j">*/
        WebElement firstName=driver.findElement(By.cssSelector("input[aria-label='First name']"));
        firstName.sendKeys("John");

        /**<input type="text" class="inputtext _58mg _5dba _2ph-" data-type="text" name="lastname" value="" aria-required="true" placeholder=""
         * aria-label="Last name" id="u_3_d_FT">*/
        WebElement lastNameBox= driver.findElement(By.cssSelector("input[aria-label='Last name']"));
        lastNameBox.sendKeys("Doe");

        /**<input type="text" class="inputtext _58mg _5dba _2ph-" data-type="text" name="reg_email__" value="" aria-required="true" placeholder=""
         * aria-label="Mobile number or email" id="u_3_g_P5">*/

        WebElement phoneNumberBox= driver.findElement(By.cssSelector("input[aria-label='Mobile number or email']"));
        phoneNumberBox.sendKeys("8889997575");

        /**<input type="password" class="inputtext _58mg _5dba _2ph-" data-type="password" autocomplete="new-password" name="reg_passwd__"
         * id="password_step_input" aria-required="true" placeholder="" aria-label="New password">*/
        WebElement newPasswordBox= driver.findElement(By.cssSelector("input[aria-label='New password']"));
        newPasswordBox.sendKeys("12345678");

       /**<div class="_58mq _5dbb" id="birthday_wrapper"><div class="mtm mbs _2_68">Birthday<a class="_58ms mlm" id="birthday-help" href="#"
        * title="Click for more information" role="button"><i class="img sp_98fCI7IVTTz sx_c4643a"></i></a></div><div class="_5k_5"><span class="_5k_4"
        * data-type="selectors" data-name="birthday_wrapper" id="u_3_l_y/"><span><select aria-label="Month" name="birthday_month" id="month" title="Month"
        * class="_9407 _5dba _9hk6 _8esg"><option value="1">Jan</option><option value="2" selected="1">Feb</option><option value="3">Mar</option><option
        * value="4">Apr</option><option value="5">May</option><option value="6">Jun</option><option value="7">Jul</option><option value="8">Aug</option><option
        * value="9">Sep</option><option value="10">Oct</option><option value="11">Nov</option><option value="12">Dec</option></select>*/
       WebElement birthdayMonthButton=driver.findElement(By.name("birthday_month"));
        Select month=new Select(birthdayMonthButton);
        month.selectByVisibleText("Aug");

        /**<select aria-label="Day" name="birthday_day" id="day" title="Day" class="_9407 _5dba _9hk6 _8esg"><option
         * value="1">1</option><option value="2">2</option><option value="3">3</option><option value="4">4</option><option
         * value="5">5</option><option value="6">6</option><option value="7">7</option><option value="8">8</option><option
         * value="9">9</option><option value="10">10</option><option value="11">11</option><option value="12">12</option><option
         * value="13" selected="1">13</option><option value="14">14</option><option value="15">15</option><option value="16">16</option><option
         * value="17">17</option><option value="18">18</option><option value="19">19</option><option value="20">20</option><option value="21">21</option><option
         * value="22">22</option><option value="23">23</option><option value="24">24</option><option value="25">25</option><option value="26">26</option><option
         * value="27">27</option><option value="28">28</option><option value="29">29</option><option value="30">30</option><option value="31">31</option></select>*/
        WebElement birthDayButton=driver.findElement(By.name("birthday_day"));
        Select day=new Select(birthDayButton);
        day.selectByVisibleText("1");

        /**<select aria-label="Year" name="birthday_year" id="year" title="Year" class="_9407 _5dba _9hk6 _8esg"><option
         * value="2023" selected="1">2023</option><option value="2022">2022</option><option value="2021">2021</option><option
         * value="2020">2020</option><option value="2019">2019</option><option value="2018">2018</option><option value="2017">2017</option><option
         * value="2016">2016</option><option value="2015">2015</option><option value="2014">2014</option><option value="2013">2013</option><option
         * value="2012">2012</option><option value="2011">2011</option><option value="2010">2010</option><option value="2009">2009</option><option
         * value="2008">2008</option><option value="2007">2007</option><option value="2006">2006</option><option value="2005">2005</option><option
         * value="2004">2004</option><option value="2003">2003</option><option value="2002">2002</option><option value="2001">2001</option><option
         * value="2000">2000</option><option value="1999">1999</option><option value="1998">1998</option><option value="1997">1997</option><option
         * value="1996">1996</option><option value="1995">1995</option><option value="1994">1994</option><option value="1993">1993</option><option
         * value="1992">1992</option><option value="1991">1991</option><option value="1990">1990</option><option value="1989">1989</option><option
         * value="1988">1988</option><option value="1987">1987</option><option value="1986">1986</option><option value="1985">1985</option><option
         * value="1984">1984</option><option value="1983">1983</option><option value="1982">1982</option><option value="1981">1981</option><option
         * value="1980">1980</option><option value="1979">1979</option><option value="1978">1978</option><option value="1977">1977</option><option
         * value="1976">1976</option><option value="1975">1975</option><option value="1974">1974</option><option value="1973">1973</option><option
         * value="1972">1972</option><option value="1971">1971</option><option value="1970">1970</option><option value="1969">1969</option><option
         * value="1968">1968</option><option value="1967">1967</option><option value="1966">1966</option><option value="1965">1965</option><option
         * value="1964">1964</option><option value="1963">1963</option><option value="1962">1962</option><option value="1961">1961</option><option
         * value="1960">1960</option><option value="1959">1959</option><option value="1958">1958</option><option value="1957">1957</option><option
         * value="1956">1956</option><option value="1955">1955</option><option value="1954">1954</option><option value="1953">1953</option><option
         * value="1952">1952</option><option value="1951">1951</option><option value="1950">1950</option><option value="1949">1949</option><option
         * value="1948">1948</option><option value="1947">1947</option><option value="1946">1946</option><option value="1945">1945</option><option
         * value="1944">1944</option><option value="1943">1943</option><option value="1942">1942</option><option value="1941">1941</option><option
         * value="1940">1940</option><option value="1939">1939</option><option value="1938">1938</option><option value="1937">1937</option><option
         * value="1936">1936</option><option value="1935">1935</option><option value="1934">1934</option><option value="1933">1933</option><option
         * value="1932">1932</option><option value="1931">1931</option><option value="1930">1930</option><option value="1929">1929</option><option
         * value="1928">1928</option><option value="1927">1927</option><option value="1926">1926</option><option value="1925">1925</option><option
         * value="1924">1924</option><option value="1923">1923</option><option value="1922">1922</option><option value="1921">1921</option><option
         * value="1920">1920</option><option value="1919">1919</option><option value="1918">1918</option><option value="1917">1917</option><option
         * value="1916">1916</option><option value="1915">1915</option><option value="1914">1914</option><option value="1913">1913</option><option
         * value="1912">1912</option><option value="1911">1911</option><option value="1910">1910</option><option value="1909">1909</option><option
         * value="1908">1908</option><option value="1907">1907</option><option value="1906">1906</option><option value="1905">1905</option></select>*/
        WebElement birthDayYearButton=driver.findElement(By.name("birthday_year"));
        Select year=new Select(birthDayYearButton);
        year.selectByVisibleText("1997");

        /**<span class="_5k_2 _5dba"><label class="_58mt" for="u_3_5_GH">Male</label><input type="radio" class="_8esa" name="sex" value="2" id="u_3_5_GH"></span>*/
        WebElement genderButton=driver.findElement(By.cssSelector("input[value='2']"));
       genderButton.click();

        /**<button type="submit" class="_6j mvm _6wk _6wl _58mi _3ma _6o _6v" name="websubmit" id="u_3_s_HC">Sign Up</button>*/
        WebElement signUpButton=driver.findElement(By.name("websubmit"));
        signUpButton.click();
        Thread.sleep(4000);

        /**<div class="_58mo" id="reg_error_inner" tabindex="0">Please choose a more secure password.
         * It should be longer than 6 characters, unique to you, and difficult for others to guess.</div>*/
        WebElement signUpMessage=driver.findElement(By.id("reg_error_inner"));
        System.out.println(signUpMessage.getText());







    }
}
