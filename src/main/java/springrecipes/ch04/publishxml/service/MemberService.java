package springrecipes.ch04.publishxml.service;

import springrecipes.ch04.domain.Member;

import java.util.Collection;

public interface MemberService {
    Collection<Member> finfAll();

    Member find(long id);
}
