package spring_recipes_4th.ch04.accessarest;

import org.springframework.web.client.RestTemplate;

import java.util.HashMap;

public class Main_ii {
    public static void main(String[] args) {
        final String uri = "http://localhost:8080/members_iii/{memberid}.xml";
        HashMap<String, String> params = new HashMap<>();
        params.put("memberid", "1");
        RestTemplate restTemplate = new RestTemplate();
        String result = restTemplate.getForObject(uri, String.class, params);
        System.out.println(result);
    }
}
