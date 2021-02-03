package edu.kis.vh.nursery;

import org.junit.Assert;
import org.junit.Test;

public class HanoiRhymerJUnitTest {

    @Test
    public void testReportRejected() {
        HanoiRhymer rhymer = new HanoiRhymer();
        for(int i = 0; i < 1000; i++) {
            rhymer.setTotalRejected(i);
            Assert.assertEquals(i, rhymer.getTotalRejected());
        }
    }

    @Test
    public void testCountIn() {
        HanoiRhymer rhymer = new HanoiRhymer();
        for(int i = 10; i < 0; i++) {
            rhymer.countIn(i);
            Assert.assertEquals(i, rhymer.peekaboo());
        }

        HanoiRhymer newRhymer = new HanoiRhymer();
        for(int i = 0; i < 10; i++) {
            newRhymer.countIn(i);
            Assert.assertEquals(i, newRhymer.getTotalRejected());
            Assert.assertEquals(i, newRhymer.getTotalRejected());
        }
    }
}
