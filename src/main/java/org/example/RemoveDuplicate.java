package org.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.message.ObjectMessage;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class RemoveDuplicate {
    private static final Logger logger = LogManager.getLogger(RemoveDuplicate.class);
    public int removeDuplicates(int[] nums) {
        Map<String, String> mapMessage = new HashMap<>();
        logger.info("Inside remove deplicate function");
        int counter=1, writePointer=1;
        for (int i=1; i< nums.length; i++) {
            if(nums[i] != nums[i-1]){
                nums[writePointer]=nums[i];
                counter++;
                writePointer++;
                mapMessage.put("Body", "moving element, " + nums[i]);
                logger.info(new ObjectMessage(mapMessage));
            }
        }
        System.out.println(Arrays.toString(nums));
        return counter;
    }
}
