package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.DefaultCountingOutRhymer;
import edu.kis.vh.nursery.HanoiRhymer;

/**
 * Factory class for Rhymers objects
 * @implements RhymersFactory
 */
public class DefaultRhymersFactory implements Rhymersfactory {

    @Override
    public DefaultCountingOutRhymer getStandardRhymer() {
        return new DefaultCountingOutRhymer();
    }

    @Override
    public DefaultCountingOutRhymer getFalseRhymer() {
        return new DefaultCountingOutRhymer(); //TODO: this method is useless as it's implementation is the same as
                                               // getStandardRhymer()
    }

    @Override
    /**
     * Factory getter for HanoiRhymer class object
     * @return HanoiRhymer object
     */
    public DefaultCountingOutRhymer getHanoiRhymer() {
        return new HanoiRhymer();
    }

}
