package main.chameleon;

import org.junit.Test;

import static org.junit.Assert.*;

public class InfoTest {

    @Test
    public void testInfo() {
        Info info = new Info();
        assertEquals(4, 2 + 2);
        assertEquals(100, info.testInt());
        assertEquals(100, info.testInt());
        assertEquals(100, info.testInt());
        assertEquals(100, info.testInt());
        assertEquals(100, info.testInt());
        assertEquals(100, info.testInt());
    }
}
