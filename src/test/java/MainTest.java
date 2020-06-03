package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import main.*;

@RunWith(JUnit4.class)
public class MainTest {

    @Test
    public void thisAlwaysPasses() {
    }

    @Test
    @Ignore
    public void thisIsIgnored() {
    }

    @Test
    public void testCheckTriangle() {
		Triangle t = new Triangle(1,2,3);
        assertEquals(new Main().checkTriangle(t), 0);
		t = new Triangle(3,4,5);
		assertEquals(new Main().checkTriangle(t), 1);
		t = new Triangle(10,15,20);
		assertEquals(new Main().checkTriangle(t), 1);
		t = new Triangle(3,5,9);
		assertEquals(new Main().checkTriangle(t), 0);
    }
}
