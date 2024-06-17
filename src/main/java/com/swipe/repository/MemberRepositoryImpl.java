package com.swipe.repository;

import com.swipe.model.Member;

import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

public class MemberRepositoryImpl {

    private Map<UUID, Member> memberMap = new ConcurrentHashMap<>();

    public Member getMemberByMemberId(UUID memberId) {
        return memberMap.get(memberId);
    }

    public Member save(Member member) {
        memberMap.put(member.getMemberId(), member);

        return member;
    }
}
