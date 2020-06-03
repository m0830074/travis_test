package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runners.JUnit4;

import main.Triangle;

public class TriangleTest {
	
	@Test
    public void testTriangle() {
		Triangle t = new Triangle(1,3,5);
        assertEquals(Integer.toString(t.getEdge1()), "1");
		assertEquals(Integer.toString(t.getEdge2()), "3");
		assertEquals(Integer.toString(t.getEdge3()), "5");
    }
	
}
