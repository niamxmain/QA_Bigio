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
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SignUp extends Env {
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    MainPage mainPage = new MainPage();
    DashboardPage dashboardPage = new DashboardPage();
    SignInPage signInPage = new SignInPage();
    SignUpPage signUpPage = new SignUpPage();

    SignIn signIn = new SignIn();

    @Given("user access signUp page")
    public void userAccessSignUpPage() {
        signIn.userAccessSignInPage();
        WebElement element = driver.findElement(signInPage.getSignUp());
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        wait.until(ExpectedConditions.visibilityOfElementLocated(signInPage.getSignUp()));
        driver.findElement(signInPage.getSignUp()).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(signUpPage.getPageHeading()));
    }

    @When("user input firstname")
    public void userInputFirstname() {
        driver.findElement(signUpPage.getFirstName()).sendKeys(firstName);
    }

    @And("user input lastname")
    public void userInputLastname() {
        driver.findElement(signUpPage.getLastName()).sendKeys(lastName);
    }

    @And("user input email")
    public void userInputEmail() {
        driver.findElement(signUpPage.getEmail()).sendKeys(emailSignUp);
    }

    @And("user input password")
    public void userInputPassword() {
        driver.findElement(signUpPage.getPassword()).sendKeys(passwordSignUp);
    }

    @And("user click signUp btn")
    public void userClickSignUpBtn() {
        driver.findElement(signUpPage.getBtnSubmit()).click();
    }

    @And("user input invalid email")
    public void userInputInvalidEmail() {
        driver.findElement(signUpPage.getEmail()).sendKeys(invalidMail);
    }

    @Then("popup error invalid email")
    public void popupErrorInvalidEmail() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(signUpPage.getErrInvalidEmail()));
        String err = driver.findElement(signUpPage.getErrInvalidEmail()).getText();
        Assert.assertEquals(err, "Email is invalid");
    }

    @And("user click term checkbox")
    public void userClickTermCheckbox() {
        driver.findElement(signUpPage.getTermChekcbox()).click();
    }
}
