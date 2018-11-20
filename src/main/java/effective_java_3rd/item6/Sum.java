package effective_java_3rd.item6;

// Hideously slow program! Can you spot the object creation? (Page 24)
public class Sum {
    private static long sumSlow() {
        Long sum = 0L;
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            sum += i;
        }
        return sum;
    }

    private static long sumFast() {
        long sum = 0L;
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        int numSet = Integer.parseInt(args[0]);

        long x = 0;
        for (int i = 0; i < numSet; i++) {
            long start = System.nanoTime();
//            x += sumSlow();
            x += sumFast();
            long end = System.nanoTime();
            System.out.println((end - start) / 1_000_000. + " ms.");
        }
        // Prevents VM from optimizing away everything.
        if (x == 42) {
            System.out.println();
        }
    }
}
