package stepDef;

import config.Env;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import obj.DashboardPage;
import obj.MainPage;
import obj.SignInPage;
import obj.SignUpPage;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SignOut extends Env {
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    DashboardPage dashboardPage = new DashboardPage();
    SignInPage signInPage = new SignInPage();
    SignUpPage signUpPage = new SignUpPage();
    MainPage mainPage = new MainPage();

    SignIn signIn = new SignIn();
    @Given("user login with valid credential")
    public void userLoginWithValidCredential() {
        signIn.userAccessSignInPage();
        signIn.userInputRegisteredEmail();
        signIn.userInputRegisteredPassword();
        signIn.userClickSignInButton();
    }

    @And("user click toggle button")
    public void userClickToggleButton() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(dashboardPage.getToggle()));
        driver.findElement(dashboardPage.getToggle()).click();
    }

    @And("user click sign out")
    public void userClickSignOut() {
        driver.findElement(dashboardPage.getBtnSignOut()).click();
    }

    @Then("user redirect to main page")
    public void userRedirectToMainPage() {
        String header = driver.findElement(mainPage.getHeader()).getText();
        Assert.assertEquals(header, "Ultimate QA");
    }
}
