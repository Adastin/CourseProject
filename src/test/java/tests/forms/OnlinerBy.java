package tests.forms;

import org.openqa.selenium.By;
import webdriver.BaseForm;
import webdriver.elements.Button;
import webdriver.elements.Label;

public class OnlinerBy extends BaseForm {
    private Label user = new Label(By.xpath("//p[@class='user-name']"), "User");
    private Label baraholka = new Label(By.linkText("Барахолка"), "Baraholka");
    private Label catalog = new Label(By.linkText("Каталог"), "Catalog");
    private Button signIn = new Button(By.xpath("//div[contains(@class, 'item--text')]"), "login");
    private Button toBasket = new Button(By.xpath("//a[text()='В корзину']"));

    public OnlinerBy(By locator, String formTitle) {
        super(locator, formTitle);
    }

    public void goToCatalog(){
        catalog.click();
    }

    public void goToBaraholka() {
        baraholka.click();
    }

    public void sigIn(String username, String password){
        signIn.click();
        LoginPage loginPage = new LoginPage();
        loginPage.login(username, password);
    }

    public void checkLogin(String username){
        assertEquals(user.getText(), username);
    }

    public void addToBasket(){
        toBasket.click();
        browser.waitForPageToLoad();
    }
}
