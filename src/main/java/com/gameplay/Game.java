/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gameplay;

import com.gameplay.api.Player;

/**
 * This class starts a new game between two players
 *
 * @author Dilip
 */
public class Game {

    /**
     * Start a new game with two players.
     * Player1 sends two messages to player2, player2 sends one message to player1.
     * Print out the message received from both players
     *
     * @parameter args
     */
    public static void main(String[] args) {
        Player initiator = new PlayerStat("initiator");
        Player player2 = new PlayerStat("player2");

        String messageReceivedFromPlayer2 = initiator.sendMessage(player2, "Hello, my name is " + initiator.getName() + ", my message counter");
        String messageReceivedFromInitiator = player2.sendMessage(initiator, "Hello, my name is " + player2.getName() + ", my message counter");
        System.out.println("Message sent to player2, message received: " + messageReceivedFromPlayer2);

        messageReceivedFromPlayer2 = initiator.sendMessage(player2, "Hello, my name is " + initiator.getName() + ", my message counter");
        System.out.println("Message sent to player2, message received: " + messageReceivedFromPlayer2);
        System.out.println("Message sent to initator, message received: " + messageReceivedFromInitiator);
    }
}
