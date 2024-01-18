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

public class Session extends Env {
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    MainPage mainPage = new MainPage();
    DashboardPage dashboardPage = new DashboardPage();
    SignInPage signInPage = new SignInPage();
    SignUpPage signUpPage = new SignUpPage();
    @Given("user in main page")
    public void userInMainPage() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(mainPage.getHeader()));
    }

    @When("user click course")
    public void userClickCourse() {
        WebElement element = driver.findElement(mainPage.getCourse());
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        wait.until(ExpectedConditions.visibilityOfElementLocated(mainPage.getCourse()));
        driver.findElement(mainPage.getCourse()).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(mainPage.getCourseName()));
    }

    @And("user click get started course")
    public void userClickGetStartedCourse() {
        WebElement element = driver.findElement(mainPage.getHook());
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        wait.until(ExpectedConditions.visibilityOfElementLocated(mainPage.getBtnGetStarted()));
        driver.findElement(mainPage.getBtnGetStarted()).click();
    }

    @Then("user redirect to signup page")
    public void userRedirectToSignupPage() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(mainPage.getHeaderSignUp()));
        String text = driver.findElement(mainPage.getHeaderSignUp()).getText();
        Assert.assertEquals(text,"Sign up to enroll");
    }
}
