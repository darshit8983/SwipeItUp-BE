package com.swipe.repository;

import com.swipe.model.Activity;

import java.util.UUID;

public interface ActivityRepository {
    Activity findById(UUID id);
    void save(Activity activity);
}
