package com.sda.unittest;

import org.junit.Ignore;
import org.junit.Test;

import static junit.framework.TestCase.*;
import static org.junit.Assert.assertFalse;

public class CalculatorTest {

    private Calculator target=new Calculator(10,5);

    @Ignore("Motiv pentru care ignor")
    @Test
    public void testAssert() {
        assert "5"=="5";
//        assertEquals("Numerele primite nu sunt ok","5","5 ");
        boolean isValid=false;
//        assertTrue("raspuns primit incorect",isValid);
        assertFalse(isValid);
        String nume=null;
        assertNull(nume);
        assertNotNull(nume);
    }
    @Test
    public void testAduna() {
        assertEquals(15,target.aduna());
    }

    @Test
    public void testAduna1() {
        assertEquals(3,target.aduna(1,2));
    }

    @Test(expected=ArithmeticException.class)
    public void testImpartire(){
        assertEquals(2,target.imparte(4,2));
        target.imparte(10,0);
    }

    @Test(timeout = 3000)
    public void testTimeout(){
        try{
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}