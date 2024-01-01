package hyotaime.rankingsystem.service;

import hyotaime.rankingsystem.domain.Info;
import hyotaime.rankingsystem.repository.InfoRepository;

import java.util.List;

public class InfoService {
    private final InfoRepository infoRepository;
    public InfoService(InfoRepository infoRepository) {
        this.infoRepository = infoRepository;
    }

    public List<Info> findInfo() {
        return infoRepository.findAll();
    }

}
