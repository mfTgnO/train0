/*
package spring_recipes_4th.ch04.publishxml.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import spring_recipes_4th.ch04.domain.Member;
import spring_recipes_4th.ch04.domain.Members;
import spring_recipes_4th.ch04.publishxml.service.MemberService;
// http://localhost:8080/members_iv
// http://localhost:8080/member_iv/2

@Controller
public class RestMemberController_iv {
    private final MemberService memberService;

    public RestMemberController_iv(MemberService memberService) {
        this.memberService = memberService;
    }

    @RequestMapping("/members_iv")
    @ResponseBody
    public Members getRestMembers() {
        Members members = new Members();
        members.addMembers(memberService.findAll());
        return members;
    }

    @RequestMapping("/member_iv/{memberid}")
    @ResponseBody
    public Member getMember(@PathVariable("memberid") long memberID) {
        return memberService.find(memberID);
    }
}
*/
