package effective_java_3rd.ch3.item10;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

// Broken - violates symmetry!  (Page 39)
public class CaseInsensitiveString {
    private final String s;

    public CaseInsensitiveString(String s) {
        this.s = Objects.requireNonNull(s);
    }

    // Broken - violates symmetry!
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof CaseInsensitiveString) {
            return s.equalsIgnoreCase(((CaseInsensitiveString) obj).s);
        }

        if (obj instanceof String) {
            // One-way interoperability!
            return s.equalsIgnoreCase((String) obj);
        }
        return false;
    }

    // Demonstration of the problem (Page 40)
    public static void main(String[] args) {
        CaseInsensitiveString cis = new CaseInsensitiveString("Polish");
        String s = "polish";
        List<CaseInsensitiveString> list = new ArrayList<>();
        list.add(cis);
        System.out.println(list.contains(s));
    }

//    // Fixed equals method (Page 40)
//    @Override public boolean equals(Object o) {
//        return o instanceof CaseInsensitiveString &&
//                ((CaseInsensitiveString) o).s.equalsIgnoreCase(s);
//    }
}
