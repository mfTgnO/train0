package springrecipes.ch04.publishxml.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import springrecipes.ch04.domain.Members;
import springrecipes.ch04.publishxml.service.MemberService;

@Controller
public class RestMemberController {
    private final MemberService memberService;

    public RestMemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    @RequestMapping("/members")
    public String getRestMembers(Model model) {
        // Return view membertemplate. Via resolver the view
        // will be mapped to a JAXB Marshaller bound to the Member class
        Members members = new Members();
        members.addMembers(memberService.finfAll());
        model.addAttribute("members", members);
        return "membertemplate";
    }
}
