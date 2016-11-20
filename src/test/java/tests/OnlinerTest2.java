package tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import tests.forms.Baraholka;
import tests.forms.NewAdvert;
import tests.forms.OnlinerMainPage;
import webdriver.BaseTest;

public class OnlinerTest2 extends BaseTest {
    private String username;
    private String password;

    @Parameters({"user", "password"})
    @BeforeTest
    public void setup(String username, String password){
        this.username = username;
        this.password = password;
    }
    @Override
    public void runTest() {
        OnlinerMainPage mainPage = new OnlinerMainPage();
        mainPage.sigIn(username, password);
        mainPage.goToBaraholka();

        Baraholka baraholka = new Baraholka();
        baraholka.addAdvert();
        NewAdvert newAdvert = new NewAdvert();

        newAdvert.setSection();

    }
}
