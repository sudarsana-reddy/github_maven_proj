package org.sud;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class CalcTest
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void verifyThat1Plus2Is3()
    {
        Integer expected = 3;
        Integer actual = new Calculator().add(1,2);
        assertEquals(expected, actual);
    }
}
