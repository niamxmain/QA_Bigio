package obj;

import  org.openqa.selenium.By;

public class SignUpPage {

    By pageHeading = By.xpath("//*[@id=\"create-account\"]/h2");
    By firstName = By.xpath("//*[@id=\"user[first_name]\"]");
    By lastName = By.xpath("//*[@id=\"user[last_name]\"]");
    By email = By.xpath("//*[@id=\"user[email]\"]");
    By password = By.xpath("//*[@id=\"user[password]\"]");
    By termChekcbox = By.xpath("//*[@id=\"user[terms]\"]");
    By btnSubmit = By.xpath("//button[@type='submit']");
    By errInvalidEmail = By.xpath("//li[@class='form-error__list-item']");

    public By getPageHeading() {
        return pageHeading;
    }

    public By getFirstName() {
        return firstName;
    }

    public By getLastName() {
        return lastName;
    }

    public By getEmail() {
        return email;
    }

    public By getPassword() {
        return password;
    }

    public By getTermChekcbox() {
        return termChekcbox;
    }

    public By getBtnSubmit() {
        return btnSubmit;
    }

    public By getErrInvalidEmail() {
        return errInvalidEmail;
    }
}
