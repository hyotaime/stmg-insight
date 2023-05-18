package hyotaime.rankingsystem.repository;

import hyotaime.rankingsystem.domain.Member;

import java.util.*;

public class MemoryMemberRepository implements MemberRepository {

    private static Map<String, Member> store = new HashMap<>();

    @Override
    public Optional<Member> findByName(String name) {
        return store.values().stream()
                .filter(member -> member.getName().equals(name))
                .findAny();
    }

    @Override
    public List<Member> findAll() {
        return null;
    }

    public void clearStore() {
        store.clear();

    }
}
