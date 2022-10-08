import elements.page.MainPage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.By;

import static elements.page.MainPage.*;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class WebTest {

    WebDriver driver;

    @Before
    public void setUp() {
        driver = new ChromeDriver();
    }

    private final By AccordionItem;
    private final By AccordionPanel;
    private final String AccordionPanelText;

    public WebTest(By AccordionItem, By AccordionPanel, String AccordionPanelText) {
        this.AccordionItem = AccordionItem;
        this.AccordionPanel = AccordionPanel;
        this.AccordionPanelText = AccordionPanelText;
    }

    @Parameterized.Parameters
    public static Object[][] getAccordion() {
        return new Object[][]{
                {ACCORDION_ITEM_1, ACCORDION_PANEL_1, ACCORDION_PANEL_1_TEXT},
                {ACCORDION_ITEM_2, ACCORDION_PANEL_2, ACCORDION_PANEL_2_TEXT},
                {ACCORDION_ITEM_3, ACCORDION_PANEL_3, ACCORDION_PANEL_3_TEXT},
                {ACCORDION_ITEM_4, ACCORDION_PANEL_4, ACCORDION_PANEL_4_TEXT},
                {ACCORDION_ITEM_5, ACCORDION_PANEL_5, ACCORDION_PANEL_5_TEXT},
                {ACCORDION_ITEM_6, ACCORDION_PANEL_6, ACCORDION_PANEL_6_TEXT},
                {ACCORDION_ITEM_7, ACCORDION_PANEL_7, ACCORDION_PANEL_7_TEXT},
                {ACCORDION_ITEM_8, ACCORDION_PANEL_8, ACCORDION_PANEL_8_TEXT}
        };
    }



    @Test
    public void chekListAccordion() {
        MainPage mainpage = new MainPage(driver);
        mainpage.goInServis();
        mainpage.clickToCookies();
        WebDriverWait inputField = new WebDriverWait(driver, 5);
        mainpage.clickToAccordionItem(AccordionItem);
        WebDriverWait inputFieldTwo = new WebDriverWait(driver, 5);
        mainpage.clickToAccordionItem(AccordionPanel);
        assertEquals(AccordionPanelText, driver.findElement(AccordionPanel).getText());
    }

    @After
    public void quit() {
        driver.quit();
    }

}