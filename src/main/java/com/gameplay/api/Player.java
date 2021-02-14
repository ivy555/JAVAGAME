/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gameplay.api;

/**
 * A player is able to send and receive messages with other players
 * @author Dilip
 */
public interface Player {
    /**
     * @return the player name
     */
    String getName();
    /**
     * Sends a message to another player
     * @parameter toPlayer a reference to the other player
     * @parameter message  the message sent to the other player
     * @return returns the reply from the other player
     */
    String sendMessage(Player toPlayer, String message);

    /**
     * Receives a message from another player.
     * @parameter fromPlayer the reference of the other player
     * @parameter message   the message received from the other player
     * @return  returns a reply to be sent to the sender
     */
    String receiveMessage(Player fromPlayer, String message) ;
}

