package com.epam.task.second.data;

import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class FileDataReaderTest {

    private final FileDataReader reader = new FileDataReader();
    private final static String TEST_DATA = "./src/test/resources/input.txt";
    private final static String NON_EXISTENT_TEST_DATA = "./src/test/resources/doesntExist.txt";

    @Test
    public void testShouldReadLinesFromExistingFile() throws IOException {
        String expected = "Hello, this is John from Florida. I work for a company called LinkedIn. " +
                "My position in the company is Director of Product Management.";

        String actual = reader.readData(TEST_DATA);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testShouldThrowExceptionBecauseOfNonExistentFile() {
        try {
            reader.readData(NON_EXISTENT_TEST_DATA);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
