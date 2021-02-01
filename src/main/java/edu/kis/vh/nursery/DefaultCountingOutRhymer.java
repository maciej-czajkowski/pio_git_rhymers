package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {
    private int MAX_ARRAY = 12;
    private int NEGATIVE_ONE = -1;
    private int MAX_VALUE = 11;
    private int[] numbers = new int[MAX_ARRAY];

    public int total = NEGATIVE_ONE;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == NEGATIVE_ONE;
    }

    public boolean isFull() {
        return total == MAX_VALUE;
    }

    protected int peekaboo() {
        if (callCheck())
            return NEGATIVE_ONE;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return NEGATIVE_ONE;
        return numbers[total--];
    }

}
