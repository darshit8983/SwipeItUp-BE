package com.swipe.model.request;

import lombok.Data;

import javax.validation.constraints.NotNull;
import java.util.UUID;

@Data
public class UpdateLikesCountRequest {

    @NotNull
    private UUID activityId;
    @NotNull
    private String tileId;
}
