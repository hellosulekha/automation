package api.cucumber.Steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginWithExample {
    private WebDriver driver;

     @Given("^User is on Homepage$")
    public void user_is_on_homepage() throws Throwable {
         WebDriverManager.chromedriver().setup();
         driver = new ChromeDriver();
         driver.get("https://saucedemo.com/");
     }

    @When("^User navigate to Login page$")
    public void user_navigate_to_login_page() throws Throwable {
        System.out.println("user_navigate_to_login_page");
    }

    @Then("^Message displayed Login Successfully$")
    public void message_displayed_login_successfully() throws Throwable {
        System.out.println("Successfully logged in");
        Thread.sleep(2000);
        driver.close();
    }

    @And("^User enters \"([^\"]*)\" and \"([^\"]*)\"$")
    public void user_enters_something_and_something(String username, String password) throws Throwable {
        System.out.println("User name is "+username +"Password is "+password);
        driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys(username);
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
        driver.findElement(By.xpath("//input[@id='login-button']")).click();
     }


}
