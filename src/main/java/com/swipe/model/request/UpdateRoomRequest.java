package com.swipe.model.request;

import lombok.Data;

import javax.validation.constraints.NotNull;
import java.util.UUID;

@Data
public class UpdateRoomRequest {

    @NotNull
    private UUID roomId;

    @NotNull
    private UUID memberId;
}
