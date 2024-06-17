package com.swipe.model;

import lombok.Builder;
import lombok.Data;

import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;


@Data
@Builder
public class Activity {
    @Id
    private UUID activityId;

    @NotNull
    private String roomId;

    private ConcurrentHashMap<String, Integer> tileLikesCountMap;
}
