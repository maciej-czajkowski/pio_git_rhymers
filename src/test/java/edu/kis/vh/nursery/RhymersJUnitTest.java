package edu.kis.vh.nursery;

import org.junit.Assert;
import org.junit.Test;

public class RhymersJUnitTest {
    // wszystkie testy jednostkowe przechodza poprawnie
    // komentarz w celu wykonania commita potwierdzajacego wykonanie podpunktu

    @Test
    public void testCountIn() {
        DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
        for(int i =0; i <rhymer.getMAX_ARRAY(); i++) {
            rhymer.countIn(i);
            Assert.assertEquals(i, rhymer.peekaboo());
        }

        // test for overfulling
        for(int i = rhymer.getMAX_VALUE(); i <rhymer.getMAX_VALUE() + 10 ; i++) {
            rhymer.countIn(i);
            Assert.assertEquals(rhymer.getMAX_VALUE(), rhymer.peekaboo());
        }
    }

    @Test
    public void testCallCheck() {
        DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();

        for(int i =0; i <rhymer.getMAX_VALUE(); i++) {
            rhymer.countIn(1);
            Assert.assertEquals(false, rhymer.callCheck());
        }
        for(int i =1; i <rhymer.getMAX_VALUE(); i++) {
            rhymer.countOut();
            Assert.assertEquals(false, rhymer.callCheck());
        }

        for(int i = 0; i < 10; i++) {
            rhymer.countOut();
            Assert.assertEquals(true, rhymer.callCheck());
        }

        for(int i = 0; i < 10; i++) {
            rhymer.countIn(i);
            Assert.assertEquals(false, rhymer.callCheck());
        }
    }

    @Test
    public void testIsFull() {
        DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();

        final int STACK_CAPACITY = 12;
        for (int i = 0; i < STACK_CAPACITY; i++) {
            Assert.assertEquals(false, rhymer.isFull());
            rhymer.countIn(i);
        }
        for (int i = 0; i < STACK_CAPACITY; i++) {
            Assert.assertEquals(true, rhymer.isFull());
            rhymer.countIn(i);
        }

        rhymer.countOut();
        Assert.assertEquals(false, rhymer.isFull());
        rhymer.countIn(1);
        Assert.assertEquals(true, rhymer.isFull());
    }

    @Test
    public void testPeekaboo() {
        DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();

        for(int i = 0; i <= rhymer.getMAX_VALUE() ; i++) {
            rhymer.countOut();
            Assert.assertEquals(rhymer.getNEGATIVE_ONE(), rhymer.peekaboo());
        }

        for(int i = 0; i <= rhymer.getMAX_VALUE() ; i++) {
            rhymer.countIn(i);
            Assert.assertEquals(i, rhymer.peekaboo());
        }
    }

    @Test
    public void testCountOut() {
        DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();

        for(int i = 0; i <= rhymer.getMAX_VALUE() ; i++) {
            Assert.assertEquals(rhymer.getNEGATIVE_ONE(), rhymer.countOut());
        }

        for(int i = 1; i < rhymer.getMAX_VALUE() ; i++) {
            rhymer.countIn(i);
        }
        int result;
        for(int i = rhymer.getMAX_VALUE()-1 ; i > 0 ; i--) {
            result = rhymer.countOut();
            Assert.assertEquals(i , result );
        }
    }
}
