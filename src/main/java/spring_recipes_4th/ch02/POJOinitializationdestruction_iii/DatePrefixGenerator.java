package spring_recipes_4th.ch02.POJOinitializationdestruction_iii;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

@Component
@Primary
public class DatePrefixGenerator implements PrefixGenerator {

    @Override
    public String getPrefix() {
        DateFormat formatter = new SimpleDateFormat("yyyyMMdd");
        return formatter.format(new Date());
    }
}
