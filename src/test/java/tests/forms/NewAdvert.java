package tests.forms;

import org.openqa.selenium.By;
import webdriver.BaseForm;
import webdriver.elements.Button;
import webdriver.elements.CheckBox;
import webdriver.elements.Label;
import webdriver.elements.TextBox;

public class NewAdvert extends OnlinerBy {
    private Label section = new Label(By.xpath("//div[text()='Выберите раздел']"), "Selection");
    private Label section2 = new Label(By.xpath("//option[text()='Мобильные телефоны']"), "Mobile phone");
    private CheckBox bargain = new CheckBox(By.xpath("//span[contains(text(),'Торг уместен')]"), "Bargain");
    private TextBox title = new TextBox(By.xpath("//textarea[@name='subject']"), "Title");
    private TextBox price = new TextBox(By.id("topic_price"), "Price");
    private TextBox message = new TextBox(By.id("postmessage"), "Message");

    private Button add = new Button(By.xpath("//a[contains(text(),'Предварительный просмотр')]"), "Add");

    public NewAdvert() {
        super(By.xpath("//img[@class='onliner_logo retina-off']"), "New advert");
    }

    public void setSection() {
        section.click();
        section2.click();
        title.type("объявление");
        message.type("сообщение");
        price.type("1000");
        bargain.click();
        add.click();

    }
}
