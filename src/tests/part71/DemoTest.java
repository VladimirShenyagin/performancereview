package tests.part71;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DemoTest {

    @Test
    public void testExamplesFromTask() {
        Assert.assertTrue(Demo.isStringsInterchangeable("cat", "cats"));
        Assert.assertTrue(Demo.isStringsInterchangeable("cat", "cut"));
        Assert.assertFalse(Demo.isStringsInterchangeable("cat", "nut"));
    }

    @Test
    public void testSameStrings() {
        Assert.assertTrue(Demo.isStringsInterchangeable("abcd", "abcd"));
        Assert.assertTrue(Demo.isStringsInterchangeable("", ""));
        Assert.assertTrue(Demo.isStringsInterchangeable("a", "a"));
    }

    @Test
    public void testAdditionalSymbolAtBeginning() {
        Assert.assertTrue(Demo.isStringsInterchangeable("abcd", "bcd"));
        Assert.assertTrue(Demo.isStringsInterchangeable("bcd", "abcd"));
        Assert.assertTrue(Demo.isStringsInterchangeable("a", "ab"));
        Assert.assertTrue(Demo.isStringsInterchangeable("ab", "a"));
        Assert.assertTrue(Demo.isStringsInterchangeable("", "a"));
        Assert.assertTrue(Demo.isStringsInterchangeable("a", ""));
    }

    @Test
    public void testAdditionalSymbolInMiddle() {
        Assert.assertTrue(Demo.isStringsInterchangeable("bacd", "bcd"));
        Assert.assertTrue(Demo.isStringsInterchangeable("bcd", "bcad"));
    }

    @Test
    public void testAdditionalSymbolInEnding() {
        Assert.assertTrue(Demo.isStringsInterchangeable("zxca", "zxca1"));
        Assert.assertTrue(Demo.isStringsInterchangeable("zxca1", "zxca"));
    }

    @Test
    public void testSwappedSymbolAtStart() {
        Assert.assertTrue(Demo.isStringsInterchangeable("zxca", "cxca"));
        Assert.assertTrue(Demo.isStringsInterchangeable("cxca", "zxca"));
    }

    @Test
    public void testSwappedSymbolInMiddle() {
        Assert.assertTrue(Demo.isStringsInterchangeable("zxma", "zxca"));
        Assert.assertTrue(Demo.isStringsInterchangeable("zxca", "zfca"));
    }

    @Test
    public void testSwappedSymbolInEnding() {
        Assert.assertTrue(Demo.isStringsInterchangeable("zxma", "zxmx"));
        Assert.assertTrue(Demo.isStringsInterchangeable("zxmz", "zxmv"));
    }

    @Test
    public void testNotInterchangeableStrings() {
        Assert.assertFalse(Demo.isStringsInterchangeable("zadsfasdf", ""));
        Assert.assertFalse(Demo.isStringsInterchangeable("1234", "wqer"));
        Assert.assertFalse(Demo.isStringsInterchangeable("asd", "af"));
        Assert.assertFalse(Demo.isStringsInterchangeable("af", "asd"));
        Assert.assertFalse(Demo.isStringsInterchangeable("", "af"));
        Assert.assertFalse(Demo.isStringsInterchangeable("af", ""));
        Assert.assertFalse(Demo.isStringsInterchangeable("asd", "fasda"));
    }
}
