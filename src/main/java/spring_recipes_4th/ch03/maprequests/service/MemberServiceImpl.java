/*
package spring_recipes_4th.ch03.maprequests.service;

import org.springframework.stereotype.Service;
import spring_recipes_4th.ch03.maprequests.domain.Member;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

@Service
public class MemberServiceImpl implements MemberService {
    private Map<String, Member> members = new TreeMap<>();

    @Override
    public void add(Member member) {
        members.put(member.getName(), member);
    }

    @Override
    public void remove(String memberName) {
        members.remove(memberName);
    }

    @Override
    public List<Member> list() {
        return new ArrayList<>(members.values());
    }
}
*/
