package org.example;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.message.ObjectMessage;

public class Main {
    private static final Logger logger = LogManager.getLogger(Main.class);

    public static void main(String[] args) {
        RemoveDuplicate removeDuplicate = new RemoveDuplicate();

        logger.info(new ObjectMessage("starting in main"));
        int output = removeDuplicate.removeDuplicates(new int[] {1, 1, 1, 2, 3, 4, 4, 4, 5, 6, 6, 6, 6, 6, 6});
        System.out.println(output);
    }
}