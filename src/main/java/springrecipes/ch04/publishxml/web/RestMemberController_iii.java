package springrecipes.ch04.publishxml.web;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springrecipes.ch04.domain.Members;
import springrecipes.ch04.publishxml.service.MemberService;

// localhost:8080/members_iii
@RestController
public class RestMemberController_iii {
    private final MemberService memberService;

    public RestMemberController_iii(MemberService memberService) {
        this.memberService = memberService;
    }

    @RequestMapping("/members_iii")
    public Members getRestMembers(Model model) {
        Members members = new Members();
        members.addMembers(memberService.findAll());
        return members;
    }
}
