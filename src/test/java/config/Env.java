package config;

import org.openqa.selenium.WebDriver;

public class Env {
    public static WebDriver driver;
    public static String baseUrl = "https://courses.ultimateqa.com/";
    //Data user for sign up
    public static String firstName = "Rinto";
    public static String lastName = "Harahap";
    public static String emailSignUp = "70175nb3ub@bloheyz.com";
    public static String passwordSignUp = "admin12345";

    //Data user for sign in
    public static String emailSignIn = "asepudy316@gmail.com";
    public static String passwordSignIn = "admin123";

    //update password
    public static String updatedPassword = "user123";

    //invalid mail
    public static String invalidMail = "ujicobaemail";
}
