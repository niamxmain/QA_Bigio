package stepDef;

import config.Env;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import obj.DashboardPage;
import obj.MainPage;
import obj.SignInPage;
import obj.SignUpPage;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SignIn extends Env {
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    MainPage mainPage = new MainPage();
    DashboardPage dashboardPage = new DashboardPage();
    SignInPage signInPage = new SignInPage();
    SignUpPage signUpPage = new SignUpPage();
    @Given("user access signIn page")
    public void userAccessSignInPage() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(mainPage.getBtnSignIn()));
        driver.findElement(mainPage.getBtnSignIn()).click();
    }

    @And("user click remember me checkbox")
    public void userClickRememberMeCheckbox() {
        driver.findElement(signInPage.getRememberCheckbox()).click();
    }

    @And("user click sign in button")
    public void userClickSignInButton() {
        driver.findElement(signInPage.getBtnSignIn()).click();
    }


    @Then("popup error message")
    public void popupErrorMessage() {
        String errMessage = driver.findElement(signInPage.getErrMsg()).getText();
        Assert.assertEquals(errMessage, "Invalid email or password.");
    }

    @When("user input registered email")
    public void userInputRegisteredEmail() {
        driver.findElement(signInPage.getEmail()).sendKeys(emailSignIn);
    }

    @And("user input registered password")
    public void userInputRegisteredPassword() {
        driver.findElement(signInPage.getPassword()).sendKeys(passwordSignIn);
    }

    @Then("user redirect to dashboard")
    public void userRedirectToDashboard() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(dashboardPage.getDashboard()));
    }

    @And("user input unregistered password")
    public void userInputUnregisteredPassword() {
        driver.findElement(signInPage.getPassword()).sendKeys("invalid password");
    }
}
