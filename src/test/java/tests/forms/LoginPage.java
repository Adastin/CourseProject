package tests.forms;

import org.openqa.selenium.By;
import webdriver.BaseForm;
import webdriver.elements.Button;
import webdriver.elements.TextBox;

public class LoginPage extends BaseForm {
    private TextBox user = new TextBox(By.xpath("//input[@placeholder='Ник или e-mail']"), "Username");
    private TextBox password = new TextBox(By.xpath("//input[@placeholder='Пароль']"), "Password");
    private Button login = new Button(By.xpath("//button[@type='submit']"), "Login");
    public LoginPage() {
        super(By.xpath("//a[@title='Onliner']"), "LoginPage");
    }

    public void login(String username, String pass){
        user.type(username);
        password.type(pass);
        login.click();
    }


}
