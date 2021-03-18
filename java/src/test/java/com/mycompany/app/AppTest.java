package com.mycompany.app;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
public class AppTest
{

    @Before
    public void setUp() {
        // Setup code here
    }

    @Test
    public void testAppConstructor() {
        try {
            new App();
        } catch (Exception e) {
            fail("Construction failed.");
        }
    }

    @Test
    public void testAppGetMessage()
    {
        App app = new App();
        assertEquals("Hello world", app.getMessage());
    }

}
