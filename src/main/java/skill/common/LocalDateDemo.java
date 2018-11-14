package skill.common;

import java.time.LocalDate;

public class LocalDateDemo {
    public static void main(String[] args) {
        LocalDate min = LocalDate.MIN;
        LocalDate max = LocalDate.MAX;
        LocalDate today = LocalDate.of(2018, 11, 14);

        System.out.println(min);
        System.out.println(max);
        System.out.println(today);
    }
}
