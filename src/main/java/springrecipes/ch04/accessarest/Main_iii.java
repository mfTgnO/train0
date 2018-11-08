package springrecipes.ch04.accessarest;

import org.springframework.web.client.RestTemplate;
import springrecipes.ch04.domain.Members;

public class Main_iii {
    public static void main(String[] args) {
        final String uri = "http://localhost:8080/members_iii.xml";
        RestTemplate restTemplate = new RestTemplate();
        Members resul = restTemplate.getForObject(uri, Members.class);
        System.out.println(resul);
    }
}
