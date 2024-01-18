package obj;

import org.openqa.selenium.By;

public class DashboardPage {
    By dashboard = By.xpath("//h2[@class='student-dashboard__welcome section__heading']");
    By toggle = By.xpath("//button[@class='dropdown__toggle-button']");
    By btnSignOut = By.xpath("//*[@id=\"header-dropdown-menu\"]/li[4]/a");
    By btnMyAccount = By.xpath("//*[@id=\"header-dropdown-menu\"]/li[2]/a");

    public By getDashboard() {
        return dashboard;
    }

    public By getToggle() {
        return toggle;
    }

    public By getBtnSignOut() {
        return btnSignOut;
    }

    public By getBtnMyAccount() {
        return btnMyAccount;
    }
}
