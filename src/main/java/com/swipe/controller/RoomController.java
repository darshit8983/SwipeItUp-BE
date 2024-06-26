package com.swipe.controller;

import com.swipe.model.Member;
import com.swipe.model.Room;
import com.swipe.model.request.UpdateRoomRequest;
import com.swipe.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import static com.swipe.util.GlobalConstant.BASE_API_PATH_V1;

@RestController
@RequestMapping(BASE_API_PATH_V1 + "/rooms")
public class RoomController {

    @Autowired
    private RoomService roomService;

    @GetMapping("/{roomCode}")
    public Room getRoomDetails(@PathVariable("roomCode") String roomCode) {
        return roomService.getRoom(roomCode);
    }

    @PostMapping()
    public Room createRoom(@NotNull Member member) {
        return roomService.createRoom(member);
    }

    @PatchMapping("/addMembers")
    public Room addMembersToRoom(@RequestBody @Valid UpdateRoomRequest updateRoomRequest) {
        return roomService.addMemberToRoom(updateRoomRequest);
    }
}
