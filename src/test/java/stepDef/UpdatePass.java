package stepDef;

import config.Env;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import obj.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class UpdatePass extends Env {
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    MainPage mainPage = new MainPage();
    DashboardPage dashboardPage = new DashboardPage();
    SignInPage signInPage = new SignInPage();
    SignUpPage signUpPage = new SignUpPage();
    MyAccountPage myAccountPage = new MyAccountPage();
    @And("user click my account")
    public void userClickMyAccount() {
        driver.findElement(dashboardPage.getBtnMyAccount()).click();
    }

    @Then("user redirect to my account page")
    public void userRedirectToMyAccountPage() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(myAccountPage.getHeading()));
    }

    @Given("user click password menu")
    public void userClickPasswordMenu() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(myAccountPage.getPassMenu()));
        driver.findElement(myAccountPage.getPassMenu()).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(myAccountPage.getHeading()));
    }

    @When("user input new password")
    public void userInputNewPassword() {
        driver.findElement(myAccountPage.getNewPass()).sendKeys(passwordSignIn);
    }

    @And("user re input new password")
    public void userReInputNewPassword() {
        driver.findElement(myAccountPage.getConfirmPass()).sendKeys(passwordSignIn);
    }

    @And("user input current password")
    public void userInputCurrentPassword() {
        driver.findElement(myAccountPage.getCurrPass()).sendKeys(passwordSignIn);
    }

    @And("user click update button")
    public void userClickUpdateButton() {
        driver.findElement(myAccountPage.getBtnUpdate()).click();
    }

    @Then("popup success message")
    public void popupSuccessMessage() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(myAccountPage.getSuccessMsg()));
    }

    @Then("popup error password can't blank")
    public void popupErrorPasswordCanTBlank() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(myAccountPage.getErrMsgPass()));
    }
}
