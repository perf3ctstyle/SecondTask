package com.epam.task.second.data;

import java.util.Scanner;

public class ConsoleDataReader {

    public String readData() {
        Scanner in = new Scanner(System.in);
        System.out.print("Input: ");
        String input = in.nextLine();
        return input;
    }
}
