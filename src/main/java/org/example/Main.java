package org.example;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.message.ObjectMessage;

public class Main {
    private static final Logger logger = LogManager.getLogger(Main.class);

    public static void main(String[] args) {
        String serviceName = System.getenv("OTEL_SERVICE_NAME");
        String exporterEndpoint = System.getenv("OTEL_EXPORTER_OTLP_ENDPOINT");
        String exporterHeaders = System.getenv("OTEL_EXPORTER_OTLP_HEADERS");

        logger.info("Service Name: {}", serviceName);
        logger.info("Exporter Endpoint: {}", exporterEndpoint);
        logger.info("Exporter Headers: {}", exporterHeaders);

        RemoveDuplicate removeDuplicate = new RemoveDuplicate();

        logger.info(new ObjectMessage("starting in main"));
        int output = removeDuplicate.removeDuplicates(new int[] {1, 1, 1, 2, 3, 4, 4, 4, 5, 6, 6, 6, 6, 6, 6});
        System.out.println(output);
    }
}