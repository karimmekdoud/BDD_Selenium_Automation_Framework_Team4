package step_Definitions;
//package step_definitions;
import common.WebAPI;
import home.HomePage;
import home.UnitedWebElement;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.PageFactory;
import java.io.IOException;
import static home.UnitedWebElement.*;
public class Homepage_StepDefinition extends WebAPI {
@Before
    public void openBrowser() throws IOException {
        setUp(false, "browserstack", "os", "x", "chrome", "83", "https://www.United.com/");
    }
    @After
    public void closeBrowser() {
        driver.quit();
    }
    static HomePage homePage;
    static UnitedWebElement unitedWebElement;
    static HomePage_StepDefinition homePage_stepDefinition;
    public static void init() {
        homePage_stepDefinition = PageFactory.initElements(driver, HomePage_StepDefinition.class);
        homePage = PageFactory.initElements(driver, HomePage.class);
        unitedWebElement = PageFactory.initElements(driver, UnitedWebElement.class);
    }

// Scenario 01
@Given("I am at United airlines Home Page")
public void i_am_at_United_airlines_Home_Page() {

}
 @When("I click one way check box")
    public void i_click_one_way_check_box() {
        homePage.click_one_way_check_box();
    }
    @When("I click link")
    public void i_click_link() throws InterruptedException {
        homePage.click_link();
    }
    @When("I clear text box")
    public void i_clear_text_box() {
      homePage.clear_text_box();
    }
    @Then("I Enter {string} in search input field")
    public void i_Enter_in_search_input_field(String string) {
     homePage.Enter_in_search_input_field(string);
    }
    @Then("I enter {string}")
    public void i_enter(String string) {
      homePage.enter( string);
    }
    @When("I click Find Flight Button")
    public void i_click_Find_Flight_Button() {
   homePage.click_Find_Flight_Button();
    }
    @Then("I should see result")
    public void i_should_see_result() {
    }
// Scenario 03
@When("I should check broken links")
public void i_should_check_broken_links() throws IOException {
    homePage.CheckBrokenLink();

 @Given("I am at United page")
    public void i_am_at_United_page() {
        init();
    }

    @When("I click on the signin button")
    public void i_click_on_the_signin_button() {
        init();
    }

    @When("I enter my  correct email")
    public void i_enter_my_correct_email() {
        
    }

    @Then("I click on continue button")
    public void i_click_on_continue_button() {
     
    }

    @Then("I enter my pass word")
    public void i_enter_my_pass_word() {
        
    }

    @Then("I click on the login button I should log in the my United account")
    public void i_click_on_the_login_button_I_should_log_in_the_my_United_account() {
       
    }

    //senario 03
    @When("I should get all page links")
    public void i_should_get_all_page_links() {
        PageLinksList(driver);
    }
    @Given("I am at united home page")
    public void i_am_at_united_home_page() {
       init();
    }

    @When("I click on the Book button the Page should land properly")
    public void i_click_on_the_Book_button_the_Page_should_land_properly() {
       init();
        BookButton.click();
    }

    @When("I click on Route Map button the Map page should land properly")
    public void i_click_on_Route_Map_button_the_Map_page_should_land_properly() throws InterruptedException {
    init();
        RouteMapButton.click();
        sleepFor(10);
    }

    @Then("I click on Maximise button the Map page should maximise")
    public void i_click_on_Maximise_button_the_Map_page_should_maximise() {
     init();
        MaxiMiniizeMapButton.click();
    }

    @When("I click {int} times on zoom in button is should zoom")
    public void i_click_times_on_zoom_in_button_is_should_zoom(Integer int1) {
       init();
        for (int i = 0; i < 5; i++) {ZoomInMButton.click(); }
    }

    @When("I click on the Zoom out button it should zoom out")
    public void i_click_on_the_Zoom_out_button_it_should_zoom_out() {
      init();
        for (int i = 0; i < 5; i++) {ZoomOutMButton.click(); }
    }

    @Then("I click again on maximise button the page should minimise")
    public void i_click_again_on_maximise_button_the_page_should_minimise() {
     init();
        MaxiMiniizeMapButton.click();
    }
    @Then("I Type {string} destination in a search box the it should show it out in the map")
    public void i_Type_destination_in_a_search_box_the_it_should_show_it_out_in_the_map(String string) {
      init();
        SearchBox.sendKeys("New York, NY (LGA - LaGuardia)");

    }

    @When("I Click on the search button should look for the destination")
    public void i_Click_on_the_search_button_should_look_for_the_destination() {
    init();
        SearchBoxButton.click();
    }

    @When("I select the second destination {string} it should link it to the first one")
    public void i_select_the_second_destination_it_should_link_it_to_the_first_one(String string) throws InterruptedException {
    init();
        ChicagoRouteFrom.click();
        sleepFor(5);
    }
}