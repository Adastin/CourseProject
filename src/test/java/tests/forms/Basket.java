package tests.forms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.List;

public class Basket extends OnlinerBy {
    List<WebElement> list = findList(By.xpath("//span[@data-bind=\"html: $data.product.full_name\"]"));;

    public Basket() {
        super(By.xpath("//img['onliner_logo retina-off']"), "Basket");
    }

    public boolean checkBasket(String productName){
        for (WebElement element : list){
            if (productName.contains(element.getText()))
                return true;
        }
        return false;
    }


}
