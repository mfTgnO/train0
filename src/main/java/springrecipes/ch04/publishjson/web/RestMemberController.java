package springrecipes.ch04.publishjson.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import springrecipes.ch04.domain.Members;
import springrecipes.ch04.publishjson.service.MemberService;
// localhost:8080/members
@Controller
public class RestMemberController {
    private final MemberService memberService;

    public RestMemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    @RequestMapping("/members")
    public String getRestMembersJson(Model model) {
        // Return view jsonmembertemplate. Via resolver the view
        // will be mapped to a jackson ObjectMapper bound to the Member class
        Members members = new Members();
        members.addMembers(memberService.finaAll());
        model.addAttribute("members", members);
        return "jsonmembertemplate";
    }
}
