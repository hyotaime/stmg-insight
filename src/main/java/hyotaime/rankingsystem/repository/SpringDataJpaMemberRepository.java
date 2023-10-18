package hyotaime.rankingsystem.repository;

import hyotaime.rankingsystem.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SpringDataJpaMemberRepository extends JpaRepository<Member, String>, MemberRepository {
    @Override
    Optional<Member> findByName(String name);

    @Override
    Optional<Member> findByUid(String uid);
}
