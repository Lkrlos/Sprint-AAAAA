import elmets.page.MainPage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static elmets.page.MainPage.*;
import static elmets.page.MainPage.ACCORDION_PANEL_3_TEXT;
import static org.junit.Assert.assertEquals;


public class WebTest {

    WebDriver driver;

    @Before
    public void setUp() {
        driver = new ChromeDriver();
    }

    @RunWith(Parameterized.class)
    public class TestClass {
        private final By AccordionItem;
        private final By AccordionPanel;
        private final String AccordionPanelText;

        public TestClass(By AccordionItem, By AccordionPanel, String AccordionPanelText) {
            this.AccordionItem = AccordionItem;
            this.AccordionPanel = AccordionPanel;
            this.AccordionPanelText = AccordionPanelText;
        }

        @Parameterized.Parameters
        public static Object[][] getAccordion() {
            return new Object[][] {
                    {ACCORDION_ITEM_1, ACCORDION_PANEL_1, ACCORDION_PANEL_1_TEXT},
                    {ACCORDION_ITEM_2, ACCORDION_PANEL_2, ACCORDION_PANEL_2_TEXT},
                    {ACCORDION_ITEM_3, ACCORDION_PANEL_3, ACCORDION_PANEL_3_TEXT},
                    {ACCORDION_ITEM_4, ACCORDION_PANEL_4, ACCORDION_PANEL_4_TEXT},
                    {ACCORDION_ITEM_5, ACCORDION_PANEL_5, ACCORDION_PANEL_5_TEXT},
                    {ACCORDION_ITEM_6, ACCORDION_PANEL_6, ACCORDION_PANEL_6_TEXT},
                    {ACCORDION_ITEM_7, ACCORDION_PANEL_7, ACCORDION_PANEL_7_TEXT},
                    {ACCORDION_ITEM_8, ACCORDION_PANEL_8, ACCORDION_PANEL_8_TEXT},
            };
        }


        @Test
        public void chekOrderStatus_NotFound() {
            MainPage mainpage = new MainPage(driver);
            mainpage.goInServis();
            mainpage.clickToCookies();
            WebElement inputField = new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.elementToBeClickable(AccordionItem));
            mainpage.clickToAccordionItem(AccordionItem);
            WebElement inputFieldTwo = new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.elementToBeClickable(AccordionItem));
            mainpage.clickToAccordionItem(AccordionPanel);
            assertEquals(AccordionPanelText, driver.findElement(AccordionPanel).getText());
        }
        @After
        public void quit() {
            driver.quit();
        }

    }
}
