package skill.common.switchstatement;

public class Demo {
    public static void main(String[] args) {
//        test1('C');
//        test1('B');
        test1('Z');
    }

    private static void test1(char grade) {
        switch (grade) {
            case 'A':
                System.out.println("Excellent!");
                break;
            case 'B':
            case 'C':
                System.out.println("Well done");
                break;
            case 'D':
                System.out.println("You passed");
            case 'F':
                System.out.println("Better try again");
                break;
            default:
                System.out.println("Invalid grade");
        }
        System.out.println("Your grade is " + grade);
    }
}
