package tests.forms;

import org.openqa.selenium.By;
import webdriver.BaseForm;
import webdriver.elements.CheckBox;

public class Catalog extends OnlinerBy {
    private CheckBox tvSet = new CheckBox(By.linkText("Телевизоры"), "TV sets");
    public Catalog() {
        super(By.xpath("//img['onliner_logo retina-off']"), "Catalog");
    }

    public void goToTv(){
        tvSet.click();
    }
}
