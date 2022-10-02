package elmets.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

// В этом классе описаны локаторы и методы главной страницы сайта (лэндинга)
public class MainPage {
    //Адрес веб-приложения
    private final static String DOMEN = "https://qa-scooter.praktikum-services.ru/";
    //Локатор кнопки 1-го раскрывающегося вопроса
    public static final By ACCORDION_ITEM_1 = By.id("accordion__heading-0");
    //Локатор раскрывшегося 1-го ответа и его текст
    public static final String ACCORDION_PANEL_1_TEXT = "Сутки — 400 рублей. Оплата курьеру — наличными или картой.";
    public static final By ACCORDION_PANEL_1 = By.id("accordion__panel-0");
    //Локатор кнопки 2-го раскрывающегося вопроса
    public static final By ACCORDION_ITEM_2 = By.id("accordion__heading-1");
    //Локатор раскрывшегося 1-го ответа и его текст
    public static final String ACCORDION_PANEL_2_TEXT = "Пок что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.";
    public static final By ACCORDION_PANEL_2 = By.id("accordion__panel-1");
    //Локатор кнопки 3-го раскрывающегося вопроса
    public static final By ACCORDION_ITEM_3 = By.id("accordion__heading-2");
    //Локатор раскрывшегося 3-го ответа и его текст
    public static final String ACCORDION_PANEL_3_TEXT = "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.";
    public static final By ACCORDION_PANEL_3 = By.id("accordion__panel-2");
    //Локатор кнопки 4-го раскрывающегося вопроса
    public static final By ACCORDION_ITEM_4 = By.id("accordion__heading-3");
    //Локатор раскрывшегося 4-го ответа и его текст
    public static final String ACCORDION_PANEL_4_TEXT = "Только начиная с завтрашнего дня. Но скоро станем расторопнее.";
    public static final By ACCORDION_PANEL_4 = By.id("accordion__panel-3");
    //Локатор кнопки 5-го раскрывающегося вопроса
    public static final By ACCORDION_ITEM_5 = By.id("accordion__heading-4");
    //Локатор раскрывшегося 5-го ответа и его текст
    public static final String ACCORDION_PANEL_5_TEXT = "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.";
    public static final By ACCORDION_PANEL_5 = By.id("accordion__panel-4");
    //Локатор кнопки 6-го раскрывающегося вопроса
    public static final By ACCORDION_ITEM_6 = By.id("accordion__heading-5");
    //Локатор раскрывшегося 6-го ответа и его текст
    public static final String ACCORDION_PANEL_6_TEXT = "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.";
    public static final By ACCORDION_PANEL_6 = By.id("accordion__panel-5");
    //Локатор кнопки 7-го раскрывающегося вопроса
    public static final By ACCORDION_ITEM_7 = By.id("accordion__heading-6");
    //Локатор раскрывшегося 7-го ответа и его текст
    public static final String ACCORDION_PANEL_7_TEXT = "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.";
    public static final By ACCORDION_PANEL_7 = By.id("accordion__panel-6");
    //Локатор кнопки 8-го раскрывающегося вопроса
    public static final By ACCORDION_ITEM_8 = By.id("accordion__heading-7");
    //Локатор раскрывшегося 8-го ответа и его текст
    public static final String ACCORDION_PANEL_8_TEXT = "Да, обязательно. Всем самокатов! И Москве, и Московской области.";
    public static final By ACCORDION_PANEL_8 = By.id("accordion__panel-7");

    private final WebDriver driver;

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }
    //Метод перехода на сайт
    public void goInServis() {
        driver.get(DOMEN);
    }

    //Метод клика на раскрывающийся вопрос
    public void clickToAccordionItem(By item) {
        driver.findElement(item).click();
    }

    //Клик по кнопке принятия cookies
    public void clickToCookies() {
        driver.findElement(By.className("App_CookieButton__3cvqF")).click();
    }
}
