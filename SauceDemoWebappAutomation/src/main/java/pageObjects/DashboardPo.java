package pageObjects;

import org.openqa.selenium.By;

public class DashboardPo {
public static By label_products = By.xpath("//span[text()='Products']");
public static By burgern_Btn = By.xpath("//button[@id='react-burger-menu-btn']");
public static By burgerMenu= By.xpath("//nav[@class='bm-item-list']");
public static By burger_close = By.xpath("//button[@id='react-burger-cross-btn']");
public static By logout_obj = By.xpath("//a[@id='logout_sidebar_link']");
public static By image_bckpck = By.xpath("//a[@id='item_4_img_link']");
public static By label_bckpck = By.xpath("//div[text()='Sauce Labs Backpack']");
public static By backToProdBtn= By.xpath("//button[@id='back-to-products']");
public static By cartBtn = By.xpath("//a[@class='shopping_cart_link']");
public static By cartList = By.xpath("//div[@class = 'cart_list']");
public static By contnBtn = By.xpath("//button[@id = 'continue-shopping']");
public static By sortBtn = By.xpath("//select[@class='product_sort_container']");
public static By addCrtBckBtn = By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']");


}
