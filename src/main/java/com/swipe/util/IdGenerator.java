package com.swipe.util;

import java.net.Inet4Address;
import java.time.Instant;
import java.util.concurrent.atomic.AtomicInteger;

public class IdGenerator {

    private static final AtomicInteger counter = new AtomicInteger(0);
    private static final int MAX_COUNTER = 9999;

    public static String generateUniqueId() {
        long currentTimestamp = Instant.now().getEpochSecond();

        int currentCounter = counter.getAndIncrement();
        if (currentCounter > MAX_COUNTER) {
            counter.set(0);
            currentCounter = counter.getAndIncrement();
        }

        long uniqueValue = (currentTimestamp % 100000) * 10000 + currentCounter;

        String uniqueIdString = String.valueOf(uniqueValue);

        return uniqueIdString.substring(uniqueIdString.length() - 4);
    }
}
