package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {
    private final int MAX_ARRAY = 12;
    private final int NEGATIVE_ONE = -1;
    private final int MAX_VALUE = 11; //TODO: make class more configurable - implement a consturctor and move this and MAX_ARRAY
                                      // variables as constructors arugments
    private int[] numbers = new int[getMAX_ARRAY()];

    private int total = getNEGATIVE_ONE();

    public int getTotal() {
        return total;
    }

    public void countIn(int in) {
        if (!isFull())
            getNumbers()[++total] = in;
    }
    //TODO: figure out beter naming for this method
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

    //TODO: three getters bellow should be removed - those variables should be accessed from outside
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
