package springrecipes.ch04.publishxml.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import springrecipes.ch04.domain.Members;
import springrecipes.ch04.publishxml.service.MemberService;

// http://localhost:8080/members_i
@Controller
public class RestMemberController_i {
    private final MemberService memberService;

    @Autowired
    public RestMemberController_i(MemberService memberService) {
        super();
        this.memberService = memberService;
    }

    @RequestMapping("/members_i")
    public String getRestMembers(Model model) {
        Members members = new Members();
        members.addMembers(memberService.findAll());
        model.addAttribute("members", members);
        return "membertemplate";
    }
}
