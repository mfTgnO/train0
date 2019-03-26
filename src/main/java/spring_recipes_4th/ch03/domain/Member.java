package spring_recipes_4th.ch03.domain;

public class Member {
    private String name;
    private String phone;
    private String email;

    public Member() {
    }

    public Member(String name, String phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public static void compare() {
        Member a = new Member("a", "123", "123@mail.com");
        Member b = new Member("b", "123", "123@mail.com");

        if (!a.getName().equals(b.getName()) && a.getPhone().equals(b.getPhone())) {
            System.out.println("equal");
        }
    }

    public static void main(String[] args) {
        compare();
    }
}
