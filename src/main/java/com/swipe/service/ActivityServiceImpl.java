package com.swipe.service;

import com.swipe.model.Activity;
import com.swipe.model.request.UpdateLikesCountRequest;
import com.swipe.repository.ActivityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ActivityServiceImpl implements ActivityService {

    private final ActivityRepository activityRepository;

    @Autowired
    public ActivityServiceImpl(ActivityRepository activityRepository) {
        this.activityRepository = activityRepository;
    }

    @Override
    public void updateLikesCount(UpdateLikesCountRequest updateLikesCountRequest) {
        Activity activity = activityRepository.findById(updateLikesCountRequest.getActivityId());
        Integer tileLikeCount = activity.getTileLikesCountMap().getOrDefault(updateLikesCountRequest.getTileId(), 0);
        activity.getTileLikesCountMap().put(updateLikesCountRequest.getTileId(), tileLikeCount + 1);
        activityRepository.save(activity);
    }

    @Override
    public void createActivity(String roomId) {
        Activity activity = Activity.builder().roomId(roomId).build();
        activityRepository.save(activity);
    }
}
