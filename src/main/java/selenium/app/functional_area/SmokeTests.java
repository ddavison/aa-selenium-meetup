package selenium.app.functional_area;

import org.junit.Test;
import org.openqa.selenium.By;
import selenium.app.GitHubAutomationTest;

/**
 * This is a Smoke Test test class.  In here, we would include tests that are covering the
 * very basic of functionality.  Smoke tests should be extremely short, simple, and idempotent.
 */
public class SmokeTests extends GitHubAutomationTest {

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
        // TODO
    }

    @Test
    public void testPrivacyPolicy() {
        // TODO
    }
}
