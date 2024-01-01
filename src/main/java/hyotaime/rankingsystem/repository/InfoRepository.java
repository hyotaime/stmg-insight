package hyotaime.rankingsystem.repository;

import hyotaime.rankingsystem.domain.Info;

import java.util.List;


public interface InfoRepository {
    List<Info> findAll();

}