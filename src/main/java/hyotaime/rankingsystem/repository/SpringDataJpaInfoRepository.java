package hyotaime.rankingsystem.repository;


import hyotaime.rankingsystem.domain.Info;
import org.springframework.data.jpa.repository.JpaRepository;


public interface SpringDataJpaInfoRepository extends JpaRepository<Info, String>, InfoRepository {
}

