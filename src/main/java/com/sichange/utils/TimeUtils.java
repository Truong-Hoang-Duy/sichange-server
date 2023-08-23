package com.sichange.utils;

import lombok.NoArgsConstructor;

import java.sql.Timestamp;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class TimeUtils {
    public static Timestamp getCurrentTimestamp() {
        Instant currentInstant = Instant.ofEpochMilli(System.currentTimeMillis());
        ZoneId utcPlus7 = ZoneId.of("Asia/Bangkok");
        ZonedDateTime zonedDateTime = currentInstant.atZone(utcPlus7);
        Timestamp timestamp = Timestamp.from(zonedDateTime.toInstant());
        return timestamp;
    }
}
