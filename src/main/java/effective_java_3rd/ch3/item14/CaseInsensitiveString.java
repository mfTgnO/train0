package effective_java_3rd.ch3.item14;

import java.util.Objects;
import java.util.TreeSet;

// Single-field Comparable with object reference field  (Page 69)
public class CaseInsensitiveString implements Comparable<CaseInsensitiveString> {
    private final String s;

    public CaseInsensitiveString(String s) {
        this.s = Objects.requireNonNull(s);
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof CaseInsensitiveString &&
                ((CaseInsensitiveString) obj).s.equalsIgnoreCase(s);
    }

    @Override
    public int hashCode() {
        return s.hashCode();
    }

    @Override
    public String toString() {
        return s;
    }

    // Using an existing comparator to make a class comparable
    @Override
    public int compareTo(CaseInsensitiveString o) {
        return String.CASE_INSENSITIVE_ORDER.compare(s, o.s);
    }

    public static void main(String[] args) {
        TreeSet<CaseInsensitiveString> treeSet = new TreeSet<>();
        for (String arg : args) {
            treeSet.add(new CaseInsensitiveString(arg));
        }
        System.out.println(treeSet);
    }
}
