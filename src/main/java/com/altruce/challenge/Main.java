package com.altruce.challenge;

import org.json.simple.JSONObject;

public class Main {

    public static void main(final String[] args) {
        try {
            String completedRhymes = "";
            JSONReader jsonReader = new JSONReader();
            JSONObject rhymes = jsonReader.readFile("src/main/resources/rhymes.json");
            String input = String.join(" ", args);

            // TODO - complete rhymes

            // TODO - export / illustrate rhymes

            // even if you created a fancy export / illustration from the completed rhymes
            // we need this print to run the automated grading test
            System.out.print(completedRhymes);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.exit(1);
        }
    }
}
