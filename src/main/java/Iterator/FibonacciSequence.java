package Iterator;

import java.util.Iterator;

/**
 * Initially, I wanted to have the values of 'a' and 'b' in the iterator class and pass them to the sequence class method,
 * so there would be no need for a for loop, and 'a' and 'b' would be incremented and tracked in the iterator class
 * alongside the current index position. However, this approach would have violated part 2 of the assignment requirements.
 *
 * At the end, I chose to implement a solution where only the current index is saved in the iterator class, and the goal number
 * in the sequence is saved in the sequence class. The values of 'a' and 'b' are calculated on the fly. This means that 'a' and 'b'
 * are not saved or tracked, and they are not available anywhere else in the code after their result is computed.
 *
 * I would have liked to save 'a' and 'b' in the iterator class and pass them, along with the current index, to the generateFibonacci
 * method. However, doing so would have meant sharing the responsibility of sequence generation between the classes, which I wanted to avoid.
 */


public class FibonacciSequence implements Sequence {
    private final int n;
    public FibonacciSequence(int n) {
        this.n = n;
    }

    public int getN() {
        return n;
    }


    public int generateFibonacci(int current) {
        if (current <= 2) {
            return 1;
        }
        int a = 1, b = 1;
        int result = 0;
        for (int i = 3; i <= current; i++) {
            result = a + b;
            a = b;
            b = result;
        }

        return result;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new FibonacciIterator(this);
    }
}
