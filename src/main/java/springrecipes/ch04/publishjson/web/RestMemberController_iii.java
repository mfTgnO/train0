package springrecipes.ch04.publishjson.web;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import springrecipes.ch04.domain.Member;
import springrecipes.ch04.domain.Members;
import springrecipes.ch04.publishjson.service.MemberService;

// http://localhost:8080/members_iii
// http://localhost:8080/members_iii/1
@Controller
public class RestMemberController_iii {
    private final MemberService memberService;

    public RestMemberController_iii(MemberService memberService) {
        this.memberService = memberService;
    }

    @RequestMapping("/members_iii")
    @ResponseBody
    public Members getRestMembers() {
        Members members = new Members();
        members.addMembers(memberService.finaAll());
        return members;
    }

    @RequestMapping("/members_iii/{memberid}")
    @ResponseBody
    public ResponseEntity<Member> getMember(@PathVariable("memberid") long memberid) {
        Member member = memberService.find(memberid);
        if (member != null) {
            return new ResponseEntity<>(member, HttpStatus.OK);
        }
        return new ResponseEntity<>(member, HttpStatus.NOT_FOUND);
    }
}
