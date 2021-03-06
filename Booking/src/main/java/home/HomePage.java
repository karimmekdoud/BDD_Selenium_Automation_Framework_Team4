package home;

import common.WebAPI;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import static home.BookingWebElements.*;

public class HomePage extends WebAPI {

    public void click_on_the_signin_button() {
        signinButton2.click();
    }
    public void enter_my_correct_email() {
        emailField.sendKeys("team4WDNY2020@gmail.com");
    }
    public void click_on_next_button_button() {
        nextButton.click();
    }
    public void enter_my_pass_word() {
        passWordField.sendKeys("Team42020");
    }
    public void click_on_the_login_button_I_should_load_in_my_booking_account() {
        loginButton.click();
    }

    // method for page broken links
    public void CheckBrokenLink() throws IOException {
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        brokenLink();
    }
// methods for booking register

    public void click_on_the_register_button() {
        signinButton2.click();


    }

    public void click_on_signUp_button() {
        signUp.click();

    }
    // enter the email data on text box
    public void put_my_correct_email() {
        enterEmail.sendKeys("sdraw341@yahoo.com");

    }
    // click on next button
    public void click_on_next_button() {

        clickGetStarted.click();

    }
    // enter password data in text box
    public void enter_password_data_in_text_box() {
        enterPassword.sendKeys("qwert12345");

    }
    // reenter password data in text box
    public void reenter_password_data_in_text_box() {

        reEnterPassword.sendKeys("qwert12345");
    }
    // click on create account button
    public void should_create_a_new_account_by_clicking_enter_button() {
        clickCreateAccount.click();

    }
}

