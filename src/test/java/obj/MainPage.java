package obj;

import org.openqa.selenium.By;

public class MainPage {
    By header = By.xpath("//*[@id=\"main-content\"]/section[1]/div/div/article/header/h2");
    By btnSignIn = By.xpath("/html/body/header/div[2]/div/nav/ul/li/a");
    By course = By.xpath("//*[@id=\"main-content\"]/section[2]/div/article/ul/li[2]");
    By courseName = By.xpath("//*[@id=\"main-content\"]/section[1]/div/div[1]/article/header/h2");
    By btnGetStarted = By.xpath("//*[@id=\"main-content\"]/section[4]/div/div/article/ul/li/a");
    By headerSignUp = By.xpath("//*[@id=\"root\"]/div[3]/section[1]/div/div/div/h1");
    By hook = By.xpath("//*[@id=\"main-content\"]/section[5]/div/header/h2");

    public By getHeader() {
        return header;
    }
    //*[@id="main-content"]/div/div/aside/a

    public By getBtnSignIn() {
        return btnSignIn;
    }

    public By getCourse() {
        return course;
    }

    public By getCourseName() {
        return courseName;
    }

    public By getBtnGetStarted() {
        return btnGetStarted;
    }

    public By getHeaderSignUp() {
        return headerSignUp;
    }

    public By getHook() {
        return hook;
    }
}
