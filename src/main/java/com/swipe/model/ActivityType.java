package com.swipe.model;

import lombok.NoArgsConstructor;

public enum ActivityType {
    MOVIE("MOVIE");

    String value;

    public String getValue() {
        return value;
    }

    ActivityType(String value) {
        this.value = value;
    }
}
