package com.epam.task.second.data;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import org.apache.log4j.Logger;

public class FileDataReader {

    private static final Logger LOGGER = Logger.getLogger(FileDataReader.class);

    public String readData(String filename) throws IOException {
        String processedData = new String();
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                processedData += line;
                processedData += " ";
            }
        } catch (IOException e) {
            LOGGER.error(e.getMessage(), e);
        }
        return processedData.trim();
    }
}
