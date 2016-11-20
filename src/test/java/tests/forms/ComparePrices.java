package tests.forms;

import org.openqa.selenium.By;
import webdriver.BaseForm;
import webdriver.elements.Button;

public class ComparePrices extends OnlinerBy {
    private Button basket = new Button(By.xpath("//a[contains(@class, 'top-navigation-cart')]"));
    public ComparePrices() {
        super(By.xpath("//img['onliner_logo retina-off']"), "ComparePrices");
    }
    public void goToBasket(){
        basket.click();
    }




}
