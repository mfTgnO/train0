package springrecipes.ch04.publishxml_ii.service.config;

import springrecipes.ch04.domain.Member;

import java.util.Collection;

public interface MemberService {
    Collection<Member> findAll();

    Member find(long id);
}
