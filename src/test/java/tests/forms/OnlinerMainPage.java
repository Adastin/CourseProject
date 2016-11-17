package tests.forms;

import org.openqa.selenium.By;
import webdriver.BaseForm;
import webdriver.elements.Button;
import webdriver.elements.Label;

public class OnlinerMainPage extends BaseForm {
    private Label catalog = new Label(By.linkText("Каталог"), "Catalog");
    private Button login = new Button(By.xpath("//div[@class='auth-bar__item auth-bar__item--text']"), "login");
    private Label user = new Label(By.xpath("//p[@class='user-name']"), "User");
    public OnlinerMainPage() {
        super(By.xpath("//img['onliner_logo retina-off']"), "Onliner.by");
    }
    public void goToCatalog(){
        catalog.click();
    }

    public void login(String username, String password){
        login.click();
        LoginPage loginPage = new LoginPage();
        loginPage.login(username, password);
    }

    public void checkLogin(String username){
        assertEquals(user.getText(), username);
}

}
