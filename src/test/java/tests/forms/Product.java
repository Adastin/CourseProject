package tests.forms;

import org.openqa.selenium.By;
import webdriver.BaseForm;
import webdriver.elements.Button;
import webdriver.elements.Label;

public class Product extends OnlinerBy {
    private static int count = 1;
    private Label model = new Label(By.xpath("//h1"), "Модель");
    private Label year = new Label(By.xpath("//td[contains(text(),'Дата выхода на рынок')]/following-sibling::td/span"), "year");
    private Label price = new Label(By.xpath("//div[@class='b-offers-desc__info-sub']/a[1]"), "price");
    private Label size = new Label(By.xpath("//td[contains(text(),'Диагональ экрана')]//following-sibling::td/span"), "Size");
    private Button compare = new Button(By.xpath("//a[contains(@class, 'product-desc__compare')]"));
    public Product() {
        super(By.xpath("//h1"), "Product #" + count);
        count++;
    }
    public void checkParameters(){
        String s = year.getText();
        int intYear = Integer.parseInt(s.substring(0, s.indexOf(' ')));
        s = price.getText();
        double minPrice = Double.parseDouble(s.replace(',', '.').substring(0, s.indexOf(' ')));
        s = size.getText();
        double doubleSize = Double.parseDouble(s.substring(0, s.indexOf('"')));
        assert(model.getText().contains("Samsung") && intYear >= 2013 && minPrice <= 1000 && doubleSize >= 39 && doubleSize <= 42);

    }

    public String getModel(){
        System.out.println(model.getText());
        return model.getText();
    }

    public void comparePrices(){
        compare.click();
    }


}
