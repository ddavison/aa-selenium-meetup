package selenium.app;

import io.ddavison.selenium.AutomationTest;
import io.ddavison.selenium.Browser;
import io.ddavison.selenium.Config;

// Since our App is actually GitHub, why not create a base class, that has all of our configuration?
@Config(
    url = "https://github.com/",
    browser = Browser.CHROME
)
public class GitHubAutomationTest extends AutomationTest {}
