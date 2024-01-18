package obj;

import  org.openqa.selenium.By;

public class SignInPage {
    By signUp = By.cssSelector("#main-content > div > div > aside > a");
    By email = By.xpath("//*[@id=\"user[email]\"]");
    By password = By.xpath("//*[@id=\"user[password]\"]");
    By rememberCheckbox = By.xpath("//*[@id=\"user[remember_me]\"]");
    By forgetPass = By.xpath("//a[@class='form__forgot-password']");;
    By btnSignIn = By.xpath("//button[@type='submit']");
    By errMsg = By.xpath("//li[@class='form-error__list-item']");


    public By getSignUp() {
        return signUp;
    }

    public By getEmail() {
        return email;
    }

    public By getPassword() {
        return password;
    }

    public By getRememberCheckbox() {
        return rememberCheckbox;
    }

    public By getForgetPass() {
        return forgetPass;
    }

    public By getBtnSignIn() {
        return btnSignIn;
    }

    public By getErrMsg() {
        return errMsg;
    }
}
