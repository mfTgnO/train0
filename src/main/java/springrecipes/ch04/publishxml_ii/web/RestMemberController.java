package springrecipes.ch04.publishxml_ii.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import springrecipes.ch04.domain.Members;
import springrecipes.ch04.publishxml_ii.service.config.MemberService;

@Controller
public class RestMemberController {
    private final MemberService memberService;

    @Autowired
    public RestMemberController(MemberService memberService) {
        super();
        this.memberService = memberService;
    }

    @RequestMapping("/members")
    @RequestBody
    public Members getRestMembers() {
        Members members = new Members();
        members.addMembers(memberService.findAll());
        return members;
    }
}
