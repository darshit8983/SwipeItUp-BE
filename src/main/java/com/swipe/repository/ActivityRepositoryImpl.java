package com.swipe.repository;

import com.swipe.model.Activity;
import org.springframework.stereotype.Repository;

import java.util.Map;
import java.util.HashMap;
import java.util.UUID;

@Repository
public class ActivityRepositoryImpl implements  ActivityRepository {
    private final Map<UUID, Activity> activityMap = new HashMap<>();
    @Override
    public Activity findById(UUID id) {
        return activityMap.get(id);
    }

    @Override
    public void save(Activity activity) {
        if (activity.getActivityId() == null) {
            activity.setActivityId(UUID.randomUUID());
        }
        activityMap.put(activity.getActivityId(), activity);
    }
}
