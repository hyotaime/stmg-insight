package hyotaime.rankingsystem;

import hyotaime.rankingsystem.repository.InfoRepository;
import hyotaime.rankingsystem.repository.MemberRepository;
import hyotaime.rankingsystem.service.MemberService;
import hyotaime.rankingsystem.service.InfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {
    private final MemberRepository memberRepository;
    private final InfoRepository infoRepository;


    @Autowired
    public SpringConfig(MemberRepository memberRepository, InfoRepository infoRepository) {
        this.memberRepository = memberRepository;
        this.infoRepository = infoRepository;
    }

    @Bean
    public MemberService memberService() {
        return new MemberService(memberRepository);
    }

    @Bean
    public InfoService infoService() {
        return new InfoService(infoRepository);
    }
}