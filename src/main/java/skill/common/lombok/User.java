package skill.common.lombok;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
public class User {
    private @Id
    Long id;// will be set when persisting
    private String firstName;
    private String lastName;
    private int age;

    public User(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public static void main(String[] args) {
        User user = new User();

        user.setFirstName("firstName");
        user.setLastName("lastName");
        user.setAge(18);

        System.out.println(user);
    }
}
