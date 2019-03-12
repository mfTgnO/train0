/*
package spring_recipes_4th.ch04.publishxml.web;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import spring_recipes_4th.ch04.domain.Member;
import spring_recipes_4th.ch04.domain.Members;
import spring_recipes_4th.ch04.publishxml.service.MemberService;

// http://localhost:8080/members_v
// http://localhost:8080/member_v/2
@Controller
public class RestMemberController_v {
    private final MemberService memberService;

    public RestMemberController_v(MemberService memberService) {
        this.memberService = memberService;
    }

    @RequestMapping("/members_v")
    @ResponseBody
    public Members getRestMembers() {
        Members members = new Members();
        members.addMembers(memberService.findAll());
        return members;
    }

    @RequestMapping("/member_v/{memberid}")
    @ResponseBody
    public ResponseEntity<Member> getMember(@PathVariable("memberid") long memberID) {
        Member member = memberService.find(memberID);
        if (member != null) {
            return new ResponseEntity<>(member, HttpStatus.OK);
        }
        return new ResponseEntity<>(member, HttpStatus.NOT_FOUND);
    }
}
*/
