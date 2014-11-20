package selenium.app.functional_area;

import org.junit.Test;
import selenium.app.GitHubAutomationTest;
import selenium.app.pages.HomePage;

/**
 * This is a Smoke Test test class.  In here, we would include tests that are covering the
 * very basic of functionality.  Smoke tests should be extremely short, simple, and idempotent.
 */
public class SmokeTest extends GitHubAutomationTest {

    /**
     * Task:  Validate that when we click terms of service, we get redirected correctly.
     *
     *      The question is: How do we decide whether this test passes?  Since this is a brief sweep
     *      over the page, maybe just validating that some text present is sufficient.
     *
     *      (Note:  This is Tricky!  A new window opens!  Try using "waitForWindow()")
     */
    @Test
    public void testTermsOfService() {
        click(HomePage.TERMS_OF_SERVICE)
        .waitForWindow(".*GitHub Terms of Service.*")
        .validateTextPresent("GitHub Terms of Service");
    }

    @Test
    public void testPrivacyPolicy() {
        click(HomePage.PRIVACY_POLICY)
        .waitForWindow(".*GitHub Privacy Policy.*")
        .validateTextPresent("GitHub Privacy Policy");
    }
}
