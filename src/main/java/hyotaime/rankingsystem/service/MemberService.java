package hyotaime.rankingsystem.service;

import hyotaime.rankingsystem.domain.Member;
import hyotaime.rankingsystem.repository.MemberRepository;

import java.util.List;
import java.util.Optional;


public class MemberService {
    private final MemberRepository memberRepository;
    public MemberService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    public List<Member> findMembers() {
        return memberRepository.findAll();
    }

    public Optional<Member> findByName(String name) {
        return memberRepository.findByName(name);
    }

    public Optional<Member> findByUid(String uid) {
        return memberRepository.findByUid(uid);
    }
}
