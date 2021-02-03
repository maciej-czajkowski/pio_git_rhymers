package edu.kis.vh.nursery;

import edu.kis.vh.nursery.factory.DefaultRhymersFactory;
import edu.kis.vh.nursery.factory.Rhymersfactory;

class RhymersDemo {

    private static void testRhymers(Rhymersfactory factory){ //TODO: demo does not show what this feature does,
                                                             // add move print out information

        DefaultCountingOutRhymer[] rhymers = {factory.getStandardRhymer(), factory.getFalseRhymer(),
               factory.getHanoiRhymer()};

        for (int i = 1; i < 15; i++)
            for (int j = 0; j < 2; j++)
                rhymers[j].countIn(i);

        java.util.Random rn = new java.util.Random();
        for (int i = 1; i < 15; i++)
            rhymers[2].countIn(rn.nextInt(20));

        for (int i = 0; i < rhymers.length; i++) {
            while (!rhymers[i].callCheck())
                System.out.print(rhymers[i].countOut() + "  ");
            System.out.println();
        }

        System.out.println("total rejected is "
                + ((HanoiRhymer) rhymers[2]).reportRejected());
    }

    public static void main(String[] args) {
        Rhymersfactory factory = new DefaultRhymersFactory();
        testRhymers(factory);
    }

}