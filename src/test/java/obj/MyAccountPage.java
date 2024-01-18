package obj;

import org.openqa.selenium.By;

public class MyAccountPage {
    By heading = By.xpath("//*[@id=\"main-content\"]/h2");
    By successMsg = By.xpath("//*[@id=\"flash\"]/div/p");
    By errMsgPass = By.xpath("//*[@id=\"notice\"]/ul/li");
    By passMenu = By.xpath("/html/body/div[2]/div/div/nav/ul/li[2]/a");
    By newPass = By.xpath("//*[@id=\"user[password]\"]");
    By confirmPass = By.xpath("//*[@id=\"user[password_confirmation]\"]");
    By currPass = By.xpath("//*[@id=\"user[current_password]\"]");
    By btnUpdate = By.xpath("//input[@type='submit']");

    public By getHeading() {
        return heading;
    }

    public By getSuccessMsg() {
        return successMsg;
    }

    public By getErrMsgPass() {
        return errMsgPass;
    }

    public By getPassMenu() {
        return passMenu;
    }

    public By getNewPass() {
        return newPass;
    }

    public By getConfirmPass() {
        return confirmPass;
    }

    public By getCurrPass() {
        return currPass;
    }

    public By getBtnUpdate() {
        return btnUpdate;
    }
}
