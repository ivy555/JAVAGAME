/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gameplay;
import com.gameplay.api.Player;

import com.ginsberg.junit.exit.ExpectSystemExit;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

/**
 * game tests
 * @author Dilip
 */
public class GameTest {
    private Player initiator;
    private Player player2;

    /**
     * Create two players, initiator and player2
     */
    @BeforeEach
   public void initialization() {
        initiator = new PlayerStat("initiator");
        player2 = new PlayerStat("player2");
    }

    /**
     * Initiator sends a message to player2
     */
    @Test
    public void sendMessageToPlayer2() {
        assertNotNull(initiator.sendMessage(player2, "Initiate game"));
    }

    /**
     * When initiator sends a message to player2, check if player2 received the same message
     */
    @Test
    public void whenInitiatorSendsMessageToPlayer_thenPlayer2SendsBackMessageWithCounter() {
        String receivedMessage = initiator.sendMessage(player2, "Initiate game");
        assertEquals("Initiate game1", receivedMessage);
    }

    /**
     * When the 10 messages are going to be send and received exit the program gracefully
     */
    @Test
    @ExpectSystemExit
    public void when10MessageSentAndReceived_thenFinalizeTheProgramGracefully() {
        for (int i = 0; i < 100; i++) {
            initiator.sendMessage(player2, "Initiate game");
        }
    }
}
