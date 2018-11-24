package effective_java_3rd.item9.trywithresources;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TopLine {
    // try-with-resources - the the best way to close resources!  (Page 35)
    static String firstLineOfLine(String path) throws IOException {
        try (BufferedReader gr = new BufferedReader(new FileReader(path))) {
            return gr.readLine();
        }
    }

    public static void main(String[] args) throws IOException {
        String path = args[0];
        System.out.println(firstLineOfLine(path));
    }
}
