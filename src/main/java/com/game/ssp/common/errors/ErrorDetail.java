package com.game.ssp.common.errors;

import lombok.Data;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.UUID;

@Data
public class ErrorDetail {

    private String errorMessage;

    private String timestamp;

    private UUID uuid;

    private static final String DATE_PATTERN = "yyyy-MM-dd'T'HH:mm:ss'Z'";

    public ErrorDetail(String errorMessage) {

        this.errorMessage = errorMessage;
        this.timestamp = LocalDateTime.now(ZoneOffset.UTC).format(DateTimeFormatter.ofPattern(DATE_PATTERN));
        this.uuid = UUID.randomUUID();
    }
}
