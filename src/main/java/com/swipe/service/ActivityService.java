package com.swipe.service;

import com.swipe.model.request.UpdateLikesCountRequest;

public interface ActivityService {
    void updateLikesCount(UpdateLikesCountRequest updateLikeCountRequest);

    void createActivity(String roomId);
}
