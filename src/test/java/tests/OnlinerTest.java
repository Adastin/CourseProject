package tests;

import tests.forms.Catalog;
import tests.forms.OnlinerMainPage;
import tests.forms.PageOfGoods;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import tests.forms.Result;
import webdriver.BaseTest;

public class OnlinerTest extends BaseTest {
    private String username;
    private String password;

    @Parameters ({"user", "password"})
    @BeforeTest
    public void setup(String username, String password){
        this.username = username;
        this.password = password;
    }
    @Override
    public void runTest() {
        OnlinerMainPage mainPage = new OnlinerMainPage();
        mainPage.login(username, password);

        mainPage.checkLogin(username);

    }
}
