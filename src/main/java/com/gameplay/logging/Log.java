/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gameplay.logging;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;


/**
 *Logging helps class to write logs in output.log
 * @author Dilip
 */
public class Log {
     public static void write(String logText, String className) {
        // write some logs
        Logger LOGGER = Logger.getLogger(className);
        try {
            /* create logs directory if it doesn't exist */
            File logDir = new File("./logs/");
            if (!(logDir.exists()))
                logDir.mkdir();

            /* append logText to output.log */
            FileHandler handler = new FileHandler(logDir + File.separator + "output.log", true);
            handler.setFormatter(new SimpleFormatter());
            LOGGER.addHandler(handler);
            LOGGER.info(logText);
            handler.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}
