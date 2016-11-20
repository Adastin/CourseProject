package tests.forms;

import org.openqa.selenium.By;
import webdriver.BaseForm;
import webdriver.elements.CheckBox;

public class Baraholka extends OnlinerBy {
    private CheckBox add = new CheckBox(By.xpath("//div[@class='b-fleamarket-button']"), "Add advert");
    public Baraholka() {
        super(By.xpath("//h1"), "Baraholka");
    }

    public void addAdvert(){
        add.click();
    }
}
