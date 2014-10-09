package selenium;

import io.ddavison.selenium.AutomationTest;
import io.ddavison.selenium.Browser;
import io.ddavison.selenium.Config;
import org.junit.Test;
import org.openqa.selenium.By;

/**
 * @author {your name here}
 * @since Oct 14, 2014
 */
@Config(
    url="http://docs.seleniumhq.org",
    browser = Browser.CHROME
)
public class GettingStarted extends AutomationTest {
    @Test
    public void testSeleniumHQ() {
        click("a[title='Selenium Projects']")
        .click(By.xpath("//div[contains(@class, 'bigMenu')]//p/a[@href='webdriver/']"))
        .validateTextPresent("Selenium 1.0 + WebDriver = Selenium 2.0")
        ;
    }
}
