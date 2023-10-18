package hyotaime.rankingsystem.repository;

import hyotaime.rankingsystem.domain.Member;

import java.util.List;
import java.util.Optional;


public interface MemberRepository {
    Optional<Member> findByName(String name);

    Optional<Member> findByUid(String uid);

    List<Member> findAll();

}
