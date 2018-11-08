package springrecipes.ch04.publishjson.web;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import springrecipes.ch04.domain.Members;
import springrecipes.ch04.publishjson.service.MemberService;

// http://localhost:8080/members_ii.json
// http:localhost:8080/members_ii.xml
@Controller
public class RestMemberController_ii {
    private final MemberService memberService;

    public RestMemberController_ii(MemberService memberService) {
        this.memberService = memberService;
    }

    @RequestMapping(value = "/members_ii", produces = MediaType.APPLICATION_XML_VALUE)
    public String getRestMemberXml(Model model) {
        // Return view membertemplate. Via resolver the view
        // will be mapped to a JAXB Marshaller bound to the Member class

        Members members = new Members();
        members.addMembers(memberService.finaAll());
        model.addAttribute("members", members);
        return "xmlmembertemplate";
    }

    @RequestMapping(value = "members_ii", produces = MediaType.APPLICATION_JSON_VALUE)
    public String getRestMemberJson(Model model) {
        // Return view jsonmembertemplate. Via resolver the view
        // will be mapped to a jackson ObjectMapper bound to the Member class

        Members members = new Members();
        members.addMembers(memberService.finaAll());
        model.addAttribute("members", members);
        return "jsonmembertemplate";
    }
}
