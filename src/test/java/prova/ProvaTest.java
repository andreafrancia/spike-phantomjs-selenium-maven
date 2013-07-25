package prova;

import org.junit.Test;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import static org.junit.Assert.assertEquals;

public class ProvaTest {

    @Test
    public void testSomething() {

        PhantomJSDriver driver = new PhantomJSDriver(new DesiredCapabilities());

        driver.get("http://www.trovaprezzi.it");

        assertEquals("TROVA", driver.findElementById("trova").getText());
    }
}
