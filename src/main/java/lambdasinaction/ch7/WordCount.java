package lambdasinaction.ch7;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class WordCount {
    public static void main(String[] args) {
        final String SENTENCE =
                " Nel mezzo del cammin di nostra vita " +
                        "mi ritrovai in una selva oscura" +
                        " ché la dritta via era smarrita ";

//        System.out.println("Found " + countWordsIteratively(SENTENCE) + " words");
        System.out.println("Found " + test1(SENTENCE) + " words");
    }

    public static int countWordsIteratively(String s) {
        int counter = 0;
        boolean lastSpace = true;
        for (char c : s.toCharArray()) {
            if (Character.isSpaceChar(c)) {
                lastSpace = true;
            } else {
                if (lastSpace) counter++;
                lastSpace = false;
            }
        }
        return counter;
    }

    public static long test1(String s) {
        Stream<Character> characterStream = IntStream.rangeClosed(0, s.length())
                .mapToObj(s::charAt);
        return characterStream.filter(Character::isSpaceChar).count();
    }
}
