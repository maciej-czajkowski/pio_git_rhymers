package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {
    private final int MAX_ARRAY = 12;
    private final int NEGATIVE_ONE = -1;
    private final int MAX_VALUE = 11;
    private int[] numbers = new int[getMAX_ARRAY()];

    private int total = getNEGATIVE_ONE();

    public int getTotal() {
        return total;
    }

    public void countIn(int in) {
        if (!isFull())
            getNumbers()[++total] = in;
    }

    public boolean callCheck() {
        return total == getNEGATIVE_ONE();
    }

    public boolean isFull() {
        return total == getMAX_VALUE();
    }

    protected int peekaboo() {
        if (callCheck())
            return getNEGATIVE_ONE();
        return getNumbers()[total];
    }

    public int countOut() {
        if (callCheck())
            return getNEGATIVE_ONE();
        return getNumbers()[total--];
    }

    public int getMAX_ARRAY() {
        return MAX_ARRAY;
    }

    public int getNEGATIVE_ONE() {
        return NEGATIVE_ONE;
    }

    public int getMAX_VALUE() {
        return MAX_VALUE;
    }

    public int[] getNumbers() {
        return numbers;
    }
}
