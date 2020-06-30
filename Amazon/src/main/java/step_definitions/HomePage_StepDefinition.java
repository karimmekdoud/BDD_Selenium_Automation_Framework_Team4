package step_definitions;
import common.WebAPI;
import home.AmazonWebElements;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import java.io.IOException;
import static home.AmazonWebElements.*;
import static org.apache.xmlbeans.XmlBeans.getTitle;
public class HomePage_StepDefinition extends WebAPI {
    @Before
    public void openBrowser() throws IOException { setUp(false, "browserstack", "os", "x", "chrome", "83", "https://www.amazon.com/");
        init();
    }
    @After
    public void closeBrowser() { driver.quit(); }
    static HomePage homePage;
    static AmazonWebElements amazonWebElements;
    static HomePage_StepDefinition homePage_stepDefinition;
    public static void init() {
        homePage = PageFactory.initElements(driver, HomePage.class);
        amazonWebElements= PageFactory.initElements(driver,AmazonWebElements.class);
        homePage_stepDefinition = PageFactory.initElements(driver, HomePage_StepDefinition.class);
    // You can implement missing steps with the snippets below:
    @Given("I am at Amazon home page")
    public void i_am_at_Amazon_home_page() {
        init();
    }
    @When("I click on the signin button")
    public void i_click_on_the_signin_button() {
    // You can implement missing steps with the snippets below:
    @Given("I am at Amazon home page")
    public void i_am_at_Amazon_home_page() {
//    You can implement missing steps with the snippets below:
    @Given("I am at Amazon home page")
    public void i_am_at_Amazon_home_page() {
    }
    @When("I click on the signin button")
    public void i_click_on_the_signin_button() {
        //init();
      //  homePage.SetSignIn();
        signin.click(); }
    @When("I enter my  correct email")
    public void i_enter_my_correct_email() {
        //init();
       //homePage.setUserNameField();
        userNameField.sendKeys("team4WDNY2020@gmail.com");
    }  
        signin.click(); }
        homePage.setUserNameField();
        init();
//        homePage.setUserNameField();
        userNameField.sendKeys("team4WDNY2020@gmail.com");
    }
    @Then("I click on continue button")
    public void i_click_on_continue_button() {
// init();
// homePage.setContinueButton();
continueButton.click();
    }
    @Then("I enter my pass word")
    public void i_enter_my_pass_word() {
// init();
//homePage.setPassWordField();
        passWordField.sendKeys("Team42020");
    }
    @Then("I click on the login button I should load in the my Amazon account")
    public void i_click_on_the_login_button_I_should_load_in_the_my_Amazon_account() {
//init();
// homePage.setLoginButton();
        loginButton.click();
    }
// scenario number 2
//init();
// homePage.setLoginButton();
        //init();
       // homePage.setLoginButton();
        loginButton.click();
    }
    // scenario number 2
    @When("I click on the New releases link")
    public void i_click_on_the_New_releases_link() {
        homePage.getNewReleasePage();
    }
    @Then("i should get the New releases page")
    public void i_should_get_the_New_releases_page() {
        homePage.checkReleasePageText();
    }
    // // step 01- click on new releases link
    //***********************************************************
// // step 01- click on new releases link

// homePage.getNewReleasePage();
// //step 02- click on baby link
// homePage.getNewReleasesInBabyPage();
// homePage.checkNewReleasesInBabyPageText();
//scenario number 3
    @When("I click on new release link")
    public void i_click_on_new_release_link() {
        homePage.getNewReleasePage();
    }
    @When("I click on baby link")
    public void i_click_on_baby_link () {
        homePage.getNewReleasesInBabyPage();
    }
    @Then("I should get the New release in baby page")
    public void i_should_get_the_New_release_in_baby_page () {
        homePage.checkNewReleasesInBabyPageText();
    }
    // scenario number 4
    @When("I enter item name in search box")
    public void i_enter_item_name_in_search_box() {
        homePage.enter_item_name_in_search_box();
    }
    @When("I click on search button")
    public void i_click_on_search_button() {
        homePage.click_on_search_button();
    }
    @Then("I should get the appropriate result page")
    public void i_should_get_the_appropriate_result_page() {
        homePage.should_get_the_appropriate_result_page();
    }
//Scenario number 5
    @When("I enter items in search box i should get result")
    public void i_enter_items_in_search_box_i_should_get_result() throws InterruptedException {
        homePage.enterDataToSearchBox();
    }
    @Then("I should get the appropriate result page")
    public void i_should_get_the_appropriate_result_page() {
        homePage.should_get_the_appropriate_result_page();
    }
    @Then("I click on Find Gift button should see the page")
    public void i_click_on_Find_Gift_button_should_see_the_page() {
        init();
        FindAGift.click();
    }
    @Then("I shoud get the expected text")
    public void i_shoud_get_the_expected_text() {
        init();
        String expectedtext = "E-GIFTS";
        String text = EGIFTS.getText();
        Assert.assertEquals(expectedtext, text);
    }
    @Given("I click on Find Gift button I should see the page")
    public void i_click_on_Find_Gift_button_I_should_see_the_page() {
        init();
        FindAGift.click();
    }

    @When("I click on the WrapIcon it should be selected")
    public void i_click_on_the_WrapIcon_it_should_be_selected() {
        init();
        EGiftWrapIcon.click();
    }
    @When("I click on Egift button i should see the page displayed")
    public void i_click_on_Egift_button_i_should_see_the_page_displayed() {
        init();
        EGIFTS.click();
    }
    @Then("I click on the Allprices button should scolldown")
    public void i_click_on_the_Allprices_button_should_scolldown() {
        init();
        AllPricesScrollDown.click();
    }
    @Then("I should get the expected title")
    public void i_should_get_the_expected_title() {
        init();
        String expectedtittle = "Gifts with digital delivery options | Amazon.com Gift Finder";
        getTitle1(expectedtittle);
    }
    @When("I click on Women Page i should see the page displayed")
    public void i_click_on_Women_Page_i_should_see_the_page_displayed() {
        init();
        amazonWomenPage.click();
    }
    @Then("I click on the AgeGroup button should dropdown the menu")
    public void i_click_on_the_AgeGroup_button_should_dropdown_the_menu() {
        init();
        AgeGroup.click();
    }
    @When("I click on the Gender button should dropdown the menu")
    public void i_click_on_the_Gender_button_should_dropdown_the_menu() {
        init();
        Gender.click();
    }
    @Then("I click on Allprices button the menu should drop down")
    public void i_click_on_Allprices_button_the_menu_should_drop_down() {
        init();
        AllPrices.click();
    }
    @Then("the Women page should scrolldown to the end of the page")
    public void the_Women_page_should_scrolldown_to_the_end_of_the_page() {
        init();
        scrollPageDown(driver);
    }
    @Then("I click on Preschooler the page should display properly")
    public void i_click_on_Preschooler_the_page_should_display_properly() {
        init();
        Preschooler.click();
    }
    @Then("I click on Play Dol")
    public void i_click_on_Play_Dol() {
        init();
        PlayDoh.click();
    }
    @Then("I click on the Play Dol Add To The Card should Add it properly")
    public void i_click_on_the_Play_Dol_Add_To_The_Card_should_Add_it_properly() {
        init();
        PlayDohAddToCard.click();
    }

  }

