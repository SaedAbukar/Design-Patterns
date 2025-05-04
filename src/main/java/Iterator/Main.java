package Iterator;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        int N = 10;
        FibonacciSequence fibonacciSequence = new FibonacciSequence(N);
        Iterator<Integer> iterator = fibonacciSequence.iterator();
        Iterator<Integer> iterator1 = fibonacciSequence.iterator();
        while (iterator.hasNext() && iterator1.hasNext()) {
            System.out.println(iterator.next());
            System.out.println(iterator1.next());
        }

    }
}
