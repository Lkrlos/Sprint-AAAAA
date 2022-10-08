package elements.page;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


//В этом класе описаны локаторы для элементов страниц заказа и кнопки для заказа на лэндинге
public class OrderForWhom {
    //Адрес web-приложения
    private final static String DOMEN = "https://qa-scooter.praktikum-services.ru/";

    //Локатор кнопки "Заказать" в шапке сайта
    public final static By BUTTON_ORDER_IN_HEADER = By.className("Button_Button__ra12g");

    //Локатор кнопки "Заказать" в теле лэндинга
    public final static By BUTTON_ORDER_IN_BODY = By.xpath(".//div[@class='Home_FinishButton__1_cWm']/button");

    //Локатор кнопки Далее на первой странице ввода данных пользователя
    public final static By BUTTON_NEXT = By.xpath(".//button[@class='Button_Button__ra12g Button_Middle__1CSJM']");

    //Локатор кнопки Заказать на второй странице ввода данных пользователя
    public final static By BUTTON_ORDER_GO =  By.xpath(".//button[@class ='Button_Button__ra12g Button_Middle__1CSJM' and (text()='Заказать')]");

    //Локатор кнопки Да подтверждения заказа
    public final static By BUTTON_ORDER_YES = By.xpath(".//button[@class = 'Button_Button__ra12g Button_Middle__1CSJM' and (text()='Да')]");

    //Локатор поля Имя на первой странице ввода данных пользователя
    public final static By INPUT_NAME = By.xpath(".//input[@placeholder='* Имя']");

    //Локатор поля фамилия на первой странице ввода данных пользователя
    public final static By INPUT_LASTNAME = By.xpath(".//input[@placeholder='* Фамилия']");

    //Локатор поля Адресс на первой странице ввода данных пользователя
    public final static By INPUT_ADRESS = By.xpath(".//input[@placeholder='* Адрес: куда привезти заказ']");

    //Локатор поля выбора станции метро на первой странице ввода данных пользователя
    public final static By INPUT_METRO = By.xpath(".//input[@placeholder='* Станция метро']");

    public final static By ENTER_METRO = By.xpath(".//button[@value='1']");

    //Локатор поля Телефон на первой странице ввода данных пользователя
    public final static By INPUT_PHONE = By.xpath(".//input[@placeholder='* Телефон: на него позвонит курьер']");

    //Локатор поля Дата на второй странице ввода данных пользователя
    public final static By INPUT_DATE = By.xpath(".//input[@placeholder='* Когда привезти самокат']");

    //Локатор выбора даты в календаре
    public final static By SELECT_DATE = By.xpath(".//div[contains(@class, 'react-datepicker__day') and (@aria-label='Choose воскресенье, 9-е октября 2022 г.')]");

    //Локатор поля Срок аренды на второй странице ввода данных пользователя
    public final static By INPUT_AREND = By.className("Dropdown-placeholder");

    //Локатор выбора периода аренды
    public final static By PERIOD_AREND =  By.xpath(".//div[@class='Dropdown-option'][1]");

    //Локатор информационного окна об успешном заказе
    public final static By RESULT_FINAL = By.xpath(".//div[@class = 'Order_ModalHeader__3FDaJ' and (text()='Заказ оформлен')]");



    private final WebDriver driver;


    public OrderForWhom(WebDriver driver) {
        this.driver = driver;
    }

    //Метод перехода на сайт
    public void goInServis() {
        driver.get(DOMEN);
    }

    //Метод кликает по входящему аргументу
    public void clickToItem(By item) {
        driver.findElement(item).click();
    }

    //Метод кликает по куки
    public void clickToCookies() {
        driver.findElement(By.className("App_CookieButton__3cvqF")).click();
    }

    //Метод который заполняет поле данными
    public void sendTextToLine(By line, String text) {
        driver.findElement(line).sendKeys(text);
    }
}