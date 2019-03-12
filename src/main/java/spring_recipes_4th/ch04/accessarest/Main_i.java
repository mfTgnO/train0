package spring_recipes_4th.ch04.accessarest;

import org.springframework.web.client.RestTemplate;

public class Main_i {
    public static void main(String[] args) {
        final String uri = "http://localhost:8080/members_i.xml";
        RestTemplate restTemplate = new RestTemplate();
        String result = restTemplate.getForObject(uri, String.class);
        System.out.println(result);
    }
}
