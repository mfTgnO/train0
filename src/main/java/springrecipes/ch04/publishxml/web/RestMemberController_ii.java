package springrecipes.ch04.publishxml.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import springrecipes.ch04.domain.Members;
import springrecipes.ch04.service.MemberService;

@Controller
public class RestMemberController_ii {
    private final MemberService memberService;

    public RestMemberController_ii(MemberService memberService) {
        this.memberService = memberService;
    }

    @RequestMapping("/members_ii")
    @ResponseBody
    public Members getRestMembers(Model model) {
        Members members = new Members();
        members.addMembers(memberService.findAll());
        model.addAttribute("members", members);
        /*<?xml version="1.0" encoding="UTF-8" standalone="yes"?><members><member><email>marten@deinum.biz</email><name>Marten Deinum</name><phone>00-31-1234567890</phone></member><member><email>john@doe.com</email><name>John Doe</name><phone>1-800-800-800</phone></member><member><email>jane@doe.com</email><name>Jane Doe</name><phone>1-801-802-803</phone></member></members>*/
        return members;
    }
}
