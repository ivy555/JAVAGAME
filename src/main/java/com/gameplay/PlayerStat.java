/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gameplay;


import com.gameplay.api.Player;
import com.gameplay.logging.Log;

import java.util.HashMap;
import java.util.Map;

/**
 * This class represents a player which is able to send and receive message with other players
 *
 * @author Dilip
 */
public class PlayerStat implements Player {

    /**
     * Player name
     */
    private final String name;
    /**
     * Keep track of received messages for each other player
     */
    private final Map<Player, Integer> receivedMessages = new HashMap<>();

    /**
     * Create a new player with the given name
     * @parameter name
     */
    public PlayerStat(String name) {
        this.name = name;
    }

    /**
     * @return the player name
     */
    @Override
    public String getName() {
        return name;
    }

    /**
     * Sends a message to another player
     * @parameter toPlayer call receiveMessage on otherPlayer
     * @parameter message  the message sent to the other player
     * @return returns message + counter (messages sent to otherPlayer)
     */
    public String sendMessage(Player toPlayer, String message){
        Log.write(this.name + " sent a message '" +message + "' to " +toPlayer.getName(), PlayerStat.class.getName());
        return toPlayer.receiveMessage(this, message);
    }

    /**
     * Receives a message from another player.
     * If the number of messages received from this player is 10 exit the program gracefully
     * @parameter fromPlayer the reference of the other player
     * @parameter message   the message received from the other player
     * @return  returns message + counter (messages received from otherPlayer)
     */
    public String receiveMessage(Player fromPlayer, String message) {
        Integer counter = receivedMessages.getOrDefault(fromPlayer, 0) + 1;
        receivedMessages.put(fromPlayer, counter);
        Log.write(this.name + " received a (counter: "+counter+") message '" +message + "' from " +fromPlayer.getName(), PlayerStat.class.getName());
        if (counter == 10) {
            System.exit(0);
        }
        return message + counter;
    }
}
