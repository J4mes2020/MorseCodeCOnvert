package dev.odionfox.morsecode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        StringBuilder outputMorse = new StringBuilder();
        System.out.println("Input morse code: ");
        String[] morseInput = scanner.nextLine().split(" ");
        LinkedList<String> convertedMorse = new CodeConverter().convertCode(morseInput);
        for (String morseLetters : convertedMorse) {
            outputMorse.append(morseLetters);
        }

        System.out.println(outputMorse);

    }
}
