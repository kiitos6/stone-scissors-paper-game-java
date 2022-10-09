package com.game.ssp.service;

import com.game.ssp.common.errors.ErrorDetail;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/api")
@Slf4j
public class SspGameController {

    @GetMapping(value="/get-computer-choice")
    public ResponseEntity<Object> getComputerChoice() {
        log.debug("Getting computer choice");

        try {

            return null;
        } catch (Exception e) {
            log.error("Exception while getting computer choice: {}", e);
            return ResponseEntity.internalServerError().body(new ErrorDetail("Error getting computer choice"));
        }

    }
}
