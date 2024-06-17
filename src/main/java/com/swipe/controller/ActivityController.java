package com.swipe.controller;


import com.swipe.model.request.UpdateLikesCountRequest;
import com.swipe.service.ActivityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
@RequestMapping("/activity")
@Validated
public class ActivityController {
    private final ActivityService activityService;

    @Autowired
    public ActivityController(ActivityService activityService) {
        this.activityService = activityService;
    }

    @PatchMapping("/likes")
    @ResponseStatus(value = HttpStatus.NO_CONTENT)
    public void updateLikesCount(@RequestBody @Valid UpdateLikesCountRequest updateLikesCountRequest) {
        activityService.updateLikesCount(updateLikesCountRequest);
    }

    @PostMapping("/{roomId}")
    @ResponseStatus(value = HttpStatus.NO_CONTENT)
    public void createActivity(@PathVariable String roomId) {
        activityService.createActivity(roomId);
    }
}
