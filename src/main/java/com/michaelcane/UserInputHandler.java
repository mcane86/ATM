package com.michaelcane;

import java.util.Scanner;

public class UserInputHandler extends DummyUserInputHandler {

    Scanner sc = new Scanner(System.in);

    public int takeInput(int input) {
        return 0;
    }

    public long takeInput(long input) {
        return 0;
    }

    public String takeInput(String input) {
        return "nothing";
    }
}
