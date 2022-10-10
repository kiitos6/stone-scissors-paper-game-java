package com.game.ssp.logic.impl;

import com.game.ssp.logic.api.SspGameManagement;
import com.game.ssp.logic.dto.ChoiceEnum;
import com.game.ssp.logic.dto.PlayDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class SspGameManagementImpl implements SspGameManagement {

    @Override
    public void getComputerChoice(PlayDTO play) {

        int computerChoice = (int)(Math.random() * 3) + 1;
        log.debug("Computer has done its choice {}", computerChoice);

        int userChoice = play.getUserChoice().getSelectedIndex();

    }


}
