package tests;

import org.apache.xpath.SourceTree;
import tests.forms.*;
import webdriver.BaseTest;

public class OnlinerTest4 extends BaseTest {
    @Override
    public void runTest() {
        OnlinerMainPage onlinerMainPage = new OnlinerMainPage();
        onlinerMainPage.goToCatalog();
        Catalog catalog = new Catalog();
        catalog.goToTv();
        PageOfGoods pageOfGoods = new PageOfGoods();
        pageOfGoods.chooseProduct();
        Product product = new Product();
        String s = product.getModel();
        product.comparePrices();
        ComparePrices comparePrices = new ComparePrices();
        comparePrices.addToBasket();
        comparePrices.goToBasket();
        Basket basket = new Basket();
        assert (basket.checkBasket(s));




    }
}
