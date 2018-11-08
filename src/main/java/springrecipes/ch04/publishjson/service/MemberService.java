package springrecipes.ch04.publishjson.service;

import springrecipes.ch04.domain.Member;

import java.util.Collection;

public interface MemberService {
    Collection<Member> finaAll();

    Member find(long id);
}
