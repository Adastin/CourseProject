package tests.forms;

import org.openqa.selenium.By;
import webdriver.BaseForm;
import webdriver.elements.Button;
import webdriver.elements.CheckBox;
import webdriver.elements.Label;

public class OnlinerMainPage extends OnlinerBy {


    private Label news = new Label(By.xpath("//span[@class=\"text-i\"]"));

    public OnlinerMainPage() {
        super(By.xpath("//img['onliner_logo retina-off']"), "Onliner.by");
    }

    public void checkNews(){
        String s = news.getText();
        System.out.println(s);
        news.click();
        browser.waitForPageToLoad();
        String s1 = browser.getDriver().findElement(By.xpath("//div[@class='news-header__title']")).getText();
        System.out.println(s1);
        System.out.println(s1.contains(s));
    }



}
