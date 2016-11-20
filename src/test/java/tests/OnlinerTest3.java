package tests;

import tests.forms.OnlinerMainPage;
import webdriver.BaseTest;

public class OnlinerTest3 extends BaseTest {
    @Override
    public void runTest() {
        OnlinerMainPage onlinerMainPage = new OnlinerMainPage();

        onlinerMainPage.checkNews();
    }
}
