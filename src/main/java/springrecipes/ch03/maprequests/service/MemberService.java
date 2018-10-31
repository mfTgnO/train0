package springrecipes.ch03.maprequests.service;

import springrecipes.ch03.maprequests.domain.Member;

import java.util.List;

public interface MemberService {
    void add(Member member);

    void remove(String memberName);

    List<Member> list();
}
