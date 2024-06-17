package com.swipe.service;

import com.swipe.model.Member;
import com.swipe.model.Room;
import com.swipe.model.request.UpdateRoomRequest;
import com.swipe.repository.MemberRepository;
import com.swipe.repository.RoomRepository;
import com.swipe.util.IdGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;
import org.springframework.web.server.ResponseStatusException;

@Service
public class RoomServiceImpl implements RoomService {

    @Autowired
    RoomRepository roomRepository;

    @Autowired
    MemberRepository memberRepository;

    public Room getRoom(String roomCode) {
        Room room = roomRepository.findRoomByRoomCode(roomCode);

        if (ObjectUtils.isEmpty(room)) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Requested Room not found");
        }

        return room;
    }

    public Room createRoom(Member member) {
        String roomId = IdGenerator.generateUniqueId();

        Room.RoomBuilder roomBuilder = Room.builder();
        roomBuilder.roomCode(roomId);
        roomBuilder.member(member);
        roomBuilder.adminMember(member.getMemberId());

        Room room = roomBuilder.build();

        room = roomRepository.save(room);

        return room;
    }

    public Room addMemberToRoom(UpdateRoomRequest updateRoomRequest) {
        Room room = roomRepository.findById(updateRoomRequest.getRoomId());

        if (ObjectUtils.isEmpty(room)) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Requested Room not found");
        }

        Member member = memberRepository.findById(updateRoomRequest.getMemberId());

        if (ObjectUtils.isEmpty(member)) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Requested Member not found");
        }

        room = room.toBuilder().member(member).build();

        return room;
    }
}
