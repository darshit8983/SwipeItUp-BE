package com.swipe.repository;

import com.swipe.model.Member;

import java.util.UUID;

public interface MemberRepository {

    Member findById(UUID memberId);

    Member save(Member member);
}
