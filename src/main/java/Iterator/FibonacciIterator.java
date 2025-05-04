package Iterator;

import java.util.Iterator;

public class FibonacciIterator implements Iterator<Integer> {
    private final FibonacciSequence fibonacciSequence;
    private int current;

    public FibonacciIterator(FibonacciSequence sequence) {
        this.fibonacciSequence = sequence;
        current = 1;
    }

    @Override
    public boolean hasNext() {
        return current <= fibonacciSequence.getN();
    }

    @Override
    public Integer next() {
        if (hasNext()) {
            int result = fibonacciSequence.generateFibonacci(current);
            current++;
            return result;
        }
        return null;
    }
}
