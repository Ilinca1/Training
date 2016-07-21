package com.endava.junit;

import com.endava.junit.process.SplitPattern;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

/**
 * Created by ivamesu on 7/21/2016.
 */
public class SplitPatternTest {

    private SplitPattern splitPattern;

    @Before
    public void setUp() {
        splitPattern = new SplitPattern();
    }

    @Test
    public void getStringLengthSmall() {
        String result = splitPattern.getStringLength("sea");
        assertEquals(result, "small");
    }

    @Test
    public void getStringLengthMedium() {
        String result = splitPattern.getStringLength("blackberry");
        assertEquals(result, "medium");
    }

    @Test
    public void getStringLengthLong() {
        String result = splitPattern.getStringLength("acetacetilsalicilic");
        assertEquals(result, "long");
    }

    @Test
    public void getStringLengthNull() {
        String value = null;
        String result = splitPattern.getStringLength(value);
        assertNull(result);
    }

    @Test
    public void stringByLength() {
        List<String> list = new ArrayList<String>();
        list.add("ana");
        list.add("banana");
        List<String> result = new ArrayList<String>();
        result = splitPattern.splitByLength(list);
        assertEquals(2, result.size());
    }
}
