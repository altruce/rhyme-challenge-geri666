package com.altruce.challenge;

import org.json.simple.JSONObject;
import java.io.BufferedReader;
import java.io.StringReader;
import java.util.ArrayList;

/*
Altruce GmbH
modified by gergely szijarto, 11.9.2021
 */

public class Main {

    public static void main(final String[] args) {
        try {
            String completedRhymes = "";
            JSONReader jsonReader = new JSONReader();
            JSONObject rhymes = jsonReader.readFile("src/main/resources/rhymes.json");
            String input = String.join(" ", args);
            // String input = "Als ich aufsah\nwar niemand mehr _\n\nEs war, als hätt' der
            // Himmel\ndie Erde still geküsst,\nDass sie im _\nVon Ihm nun träumen _\n\nDie
            // Luft ging durch die Felder,\nDie Ähren wogten sacht,\nEs rauschten leis' die
            // _\nSo sternklar war die _";
            BufferedReader bufReader = new BufferedReader(new StringReader(input));
            String rhyme = null;
            String line = null;
            String newLine = null;
            int i = 0;
            ArrayList<String> rhymeList = new ArrayList<>();

            while ((line = bufReader.readLine()) != null) {
                if (line.equals("")) {
                    completedRhymes += "\n";
                    continue;
                }

                String lastWord = line.substring(line.lastIndexOf(' ') + 1, line.length()).replaceAll(",", "");

                if (!lastWord.equals("_")) {
                    completedRhymes += line + "\n";
                    rhyme = getRhyme(lastWord, rhymes);
                    rhymeList.add(rhyme);
                } else {
                    newLine = line.replace("_", rhymeList.get(i++));
                    completedRhymes += newLine + "\n";
                }

            }

            // even if you created a fancy export / illustration from the completed rhymes
            // we need this print to run the automated grading test
            System.out.print(completedRhymes);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.exit(1);
        }

    }

    public static String getRhyme(String firstWord, JSONObject rhymes) {
        return (String) rhymes.get(firstWord);
    }

    public static int getCharPos(String input, String chars) {
        return input.indexOf(chars);
    }

}
