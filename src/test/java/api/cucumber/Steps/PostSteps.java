
package api.cucumber.Steps;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.net.Urls;


public class PostSteps {

    @Given("^User should be logged in and should be present on his wall$")
    public void user_should_be_logged_in_and_should_be_present_on_his_wall() throws Throwable {
        System.out.println("user_should_be_logged_in_and_should_be_present_on_his_wall");
    }

    @When("^I type the message in the box$")
    public void i_type_the_message_in_the_box() throws Throwable {
        System.out.println("i_type_the_message_in_the_box");
    }

    @Then("^the message should be posted$")
    public void the_message_should_be_posted() throws Throwable {
        System.out.println("the_message_should_be_posted");
    }

    @And("^Click on the Post button$")
    public void click_on_the_post_button() throws Throwable {
        System.out.println("click_on_the_post_button");
    }

    @When("^User supply the youtube link in the text box$")
    public void user_supply_the_youtube_link_in_the_text_box(){
        System.out.println("https://www.youtube.com");
    }

    @Then("^Then video should get posted on the user wall$")
    public void then_video_should_get_posted_on_the_user_wall() throws Throwable {
        System.out.println("then_video_should_get_posted_on_the_user_wall");
    }

    @And("^the video should have proper thumbnail$")
    public void the_video_should_have_proper_thumbnail() throws Throwable {
        System.out.println("the_video_should_have_proper_thumbnail");
    }


}
