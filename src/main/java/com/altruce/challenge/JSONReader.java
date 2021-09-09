package com.altruce.challenge;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;

/**
 * JSON Reader to deal with the json simple library
 */
public class JSONReader {

    private final JSONParser parser;

    public JSONReader() {
        parser = new JSONParser();
    }

    /**
     * Read JSON from the given file
     *
     * @param file String
     * @return JSONArray
     */
    public JSONObject readFile(String file) throws IOException, ParseException {
        return (JSONObject) parser.parse(new FileReader(file));
    }
}
