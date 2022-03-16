package dev.odionfox.morsecode;

import java.util.LinkedList;

public class CodeConverter {

    public LinkedList<String> convertCode(String[] morseInput) {

        LinkedList<String> morseStringArray = new LinkedList<>();

        for (String morse : morseInput) {
            switch (morse) {
                case "/" -> morseStringArray.add(" ");
                case ".-" -> morseStringArray.add("A");
                case "-..." -> morseStringArray.add("B");
                case "-.-." -> morseStringArray.add("C");
                case "-.." -> morseStringArray.add("D");
                case "." -> morseStringArray.add("E");
                case "..-." -> morseStringArray.add("F");
                case "--." -> morseStringArray.add("G");
                case "...." -> morseStringArray.add("H");
                case ".." -> morseStringArray.add("I");
                case ".---" -> morseStringArray.add("J");
                case "-.-" -> morseStringArray.add("K");
                case ".-.." -> morseStringArray.add("L");
                case "--" -> morseStringArray.add("M");
                case "-." -> morseStringArray.add("N");
                case "---" -> morseStringArray.add("O");
                case ".--." -> morseStringArray.add("P");
                case "--.-" -> morseStringArray.add("Q");
                case ".-." -> morseStringArray.add("R");
                case "..." -> morseStringArray.add("S");
                case "-" -> morseStringArray.add("T");
                case "..-" -> morseStringArray.add("U");
                case "...-" -> morseStringArray.add("V");
                case ".--" -> morseStringArray.add("W");
                case "-..-" -> morseStringArray.add("X");
                case "-.--" -> morseStringArray.add("Y");
                case "--.." -> morseStringArray.add("Z");
            }
        }

        return morseStringArray;

    }
}
