package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {
    private final int MAX_ARRAY = 12;
    private final int NEGATIVE = -1;
    private final int ELEVEN = 11;
    private int[] numbers = new int[MAX_ARRAY];

    public int total = NEGATIVE;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == NEGATIVE;
    }

    public boolean isFull() {
        return total == ELEVEN;
    }

    protected int peekaboo() {
        if (callCheck())
            return NEGATIVE;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return NEGATIVE;
        return numbers[total--];
    }

}
