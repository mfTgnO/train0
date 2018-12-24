package skill.common.lombok;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public class Test2 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String summary;
    private String descriptions;

    public static void main(String[] args) {
        Test2 test2 = new Test2();
        test2.setId(1);
        System.out.println(test2);
    }
}
