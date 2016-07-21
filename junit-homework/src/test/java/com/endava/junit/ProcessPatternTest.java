package com.endava.junit;

/**
 * Created by ivamesu on 7/21/2016.
 */

import com.endava.junit.process.ProcessPattern;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ProcessPatternTest {

    private ProcessPattern processPattern;

    @Before
    public void setUp() {
        processPattern = new ProcessPattern();
    }

    @Test
    public void generatePositionTestJunior() {
        String result = processPattern.generatePosition("junior", 1);
        assertEquals(result, "Junior Developer");
    }

    @Test
    public void generatePositionTestDev1() {
        String result = processPattern.generatePosition("middle", 1);
        assertEquals(result, "Developer 1");
    }

    @Test
    public void generatePositionTestDev2() {
        String result = processPattern.generatePosition("middle", 3);
        assertEquals(result, "Developer 2");
    }

    @Test
    public void generatePositionTestSen1() {
        String result = processPattern.generatePosition("senior", 4);
        assertEquals(result, "Senior 1");
    }

    @Test
    public void generatePositionTestSen2() {
        String result = processPattern.generatePosition("senior", 6);
        assertEquals(result, "Senior 2");
    }

    @Test
    public void generatePositionTestOther() {
        String result = processPattern.generatePosition("something", 6);
        assertEquals(result, "Unknown Position");
    }

    @Test
    public void generatePositionTestNegative() {
        String result = processPattern.generatePosition("bla", -1);
        assertNull(result);
    }


    @Test
    public void generatePositionTestNull() {
        String result = processPattern.generatePosition(null, 1);
        assertNull(result);
    }
}
