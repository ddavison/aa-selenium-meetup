package selenium.app.functional_area;

import org.junit.Test;
import selenium.app.GitHubAutomationTest;

/**
 * We will be automating GitHub.  An open-source website that hosts many
 *        open-source projects such as Selenium, this project, the linux kernel, etc.
 *
 *
 * Task(s):
 *        We will be automating GitHub, while discussing best-practice concepts like:
 *          ) Test independence
 *          ) Handling elements using CSS selectors
 *          ) What to test
 *          ) what NOT to test
 */
public class ExploreTests extends GitHubAutomationTest {
    /**
     *  In this task, we will be going to the most trending open-source project on GitHub
     *  Navigating to it, and making sure that when we navigate to it, the project name
     *  shows up in the URL.
     *
     *    Task(s):
     *      1) From GitHub, we will click the "Explore" button at the top of the page.
     *      2) We will click the "Trending" tab. (Next to "Showcases")
     *      3) We will open up the most trending open-source project by clicking it's title.
     *      4) We will then store the name of the project inside of a variable
     *      5) Then we will validate that the URL ends with the variable (the name of the project)
     */
    @Test
    public void testTopTrendingUrl() {
        // TODO
    }
}
