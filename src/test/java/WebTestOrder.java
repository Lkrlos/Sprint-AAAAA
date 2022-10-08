import elements.page.OrderForWhom;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.By;

import static elements.page.OrderForWhom.*;
import static org.junit.Assert.assertTrue;

@RunWith(Parameterized.class)
public class WebTestOrder {

    WebDriver driver;

    @Before
    public void setUp() {
        driver = new ChromeDriver();
    }

    private final String name;
    private final String lastName;
    private final String orderAdress;
    private final String numberPhone;


    public WebTestOrder(String name, String lastName, String orderAdress, String numberPhone) {
        this.name = name;
        this.lastName = lastName;
        this.orderAdress = orderAdress;
        this.numberPhone = numberPhone;
    }


    @Parameterized.Parameters
    public static Object[][] orderData() {
        return new Object[][]{
                {"Карим", "Каримыч", "Москва, ул. Арбат", "89000000000"},
        };
    }

    @Test
    public void orderCheckInButtonHeader() {
        OrderForWhom orderForm = new OrderForWhom(driver);
        orderForm.goInServis();
        orderForm.clickToCookies();
        WebDriverWait inputField = new WebDriverWait(driver, 5);
        orderForm.clickToItem(BUTTON_ORDER_IN_HEADER);
        WebDriverWait inputField_2 = new WebDriverWait(driver, 5);
        orderForm.clickToItem(INPUT_NAME);
        WebDriverWait inputField_3 = new WebDriverWait(driver, 5);
        orderForm.sendTextToLine(INPUT_NAME, name);
        orderForm.clickToItem(INPUT_LASTNAME);
        orderForm.sendTextToLine(INPUT_LASTNAME, lastName);
        orderForm.clickToItem(INPUT_ADRESS);
        orderForm.sendTextToLine(INPUT_ADRESS, orderAdress);
        orderForm.clickToItem(INPUT_METRO);
        WebDriverWait inputField_4 = new WebDriverWait(driver, 5);
        orderForm.clickToItem(ENTER_METRO);
        orderForm.clickToItem(INPUT_PHONE);
        orderForm.sendTextToLine(INPUT_PHONE, numberPhone);
        orderForm.clickToItem(BUTTON_NEXT);
        WebDriverWait inputField_5 = new WebDriverWait(driver, 5);
        orderForm.clickToItem(INPUT_DATE);
        WebDriverWait inputField_6 = new WebDriverWait(driver, 5);
        orderForm.clickToItem(SELECT_DATE);
        orderForm.clickToItem(INPUT_AREND);
        WebDriverWait inputField_7 = new WebDriverWait(driver, 5);
        orderForm.clickToItem(PERIOD_AREND);
        orderForm.clickToItem(BUTTON_ORDER_GO);
        orderForm.clickToItem(BUTTON_ORDER_YES);
        WebDriverWait inputField_8 = new WebDriverWait(driver, 5);
        assertTrue("Заказ оформлен", driver.findElement(RESULT_FINAL).isDisplayed());
    }

    @Test
    public void orderCheckInButtonBody() {
        OrderForWhom orderForm = new OrderForWhom(driver);
        orderForm.goInServis();
        orderForm.clickToCookies();
        WebDriverWait inputField = new WebDriverWait(driver, 5);
        orderForm.clickToItem(BUTTON_ORDER_IN_BODY);
        WebDriverWait inputField_2 = new WebDriverWait(driver, 5);
        orderForm.clickToItem(INPUT_NAME);
        WebDriverWait inputField_3 = new WebDriverWait(driver, 5);
        orderForm.sendTextToLine(INPUT_NAME, name);
        orderForm.clickToItem(INPUT_LASTNAME);
        orderForm.sendTextToLine(INPUT_LASTNAME, lastName);
        orderForm.clickToItem(INPUT_ADRESS);
        orderForm.sendTextToLine(INPUT_ADRESS, orderAdress);
        orderForm.clickToItem(INPUT_METRO);
        WebDriverWait inputField_4 = new WebDriverWait(driver, 5);
        orderForm.clickToItem(ENTER_METRO);
        orderForm.clickToItem(INPUT_PHONE);
        orderForm.sendTextToLine(INPUT_PHONE, numberPhone);
        orderForm.clickToItem(BUTTON_NEXT);
        WebDriverWait inputField_5 = new WebDriverWait(driver, 5);
        orderForm.clickToItem(INPUT_DATE);
        WebDriverWait inputField_6 = new WebDriverWait(driver, 5);
        orderForm.clickToItem(SELECT_DATE);
        orderForm.clickToItem(INPUT_AREND);
        WebDriverWait inputField_7 = new WebDriverWait(driver, 5);
        orderForm.clickToItem(PERIOD_AREND);
        orderForm.clickToItem(BUTTON_ORDER_GO);
        orderForm.clickToItem(BUTTON_ORDER_YES);
        WebDriverWait inputField_8 = new WebDriverWait(driver, 5);
        assertTrue("Заказ оформлен", driver.findElement(RESULT_FINAL).isDisplayed());
    }

    @After
    public void quit() {
        driver.quit();
    }
}