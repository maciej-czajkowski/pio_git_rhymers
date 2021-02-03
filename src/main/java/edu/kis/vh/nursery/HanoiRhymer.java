package edu.kis.vh.nursery;

public class HanoiRhymer extends DefaultCountingOutRhymer {

    private int totalRejected = 0; //TODO: not max value or reset mechanims for total rejected

    public int reportRejected() {
        return getTotalRejected();
    }

    @Override
    public void countIn(int in) {
        if (!callCheck() && in > peekaboo()) //TODO: this condition should be moved to a method and namer properly
            setTotalRejected(getTotalRejected() + 1);
        else
            super.countIn(in);
    }

    public int getTotalRejected() {
        return totalRejected;
    }

    public void setTotalRejected(int totalRejected) { //TODO: should be private
        this.totalRejected = totalRejected;
    }
}
// alt + strzałka, przesuwa do pomiędzy przeskokami po kodzie
