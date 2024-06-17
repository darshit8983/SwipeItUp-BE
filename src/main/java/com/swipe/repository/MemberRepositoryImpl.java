package com.swipe.repository;

import com.swipe.model.Member;
import org.springframework.stereotype.Repository;

import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

@Repository
public class MemberRepositoryImpl implements MemberRepository {

    private Map<UUID, Member> memberMap = new ConcurrentHashMap<>();

    public Member findById(UUID memberId) {
        return memberMap.get(memberId);
    }

    public Member save(Member member) {
        memberMap.put(member.getMemberId(), member);

        return member;
    }
}
