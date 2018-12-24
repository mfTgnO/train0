package skill.common.lombok;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

public class Test1 {
    @Getter
    @Setter
    private boolean empoyed;

    @Setter(AccessLevel.PROTECTED)
    private String name;
}
