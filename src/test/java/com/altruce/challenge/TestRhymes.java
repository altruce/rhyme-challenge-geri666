package com.altruce.challenge;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestRhymes {

    @Test
    public void testCompletedRhymes()
    {
        PrintStream originalOut = System.out;
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(bos));

        String input = "Als ich aufsah\nwar niemand mehr _\n\nEs war, als hätt' der Himmel\ndie Erde still geküsst,\nDass sie im _\nVon Ihm nun träumen _\n\nDie Luft ging durch die Felder,\nDie Ähren wogten sacht,\nEs rauschten leis' die _\nSo sternklar war die _";

        // action
        Main.main(input.split(" "));

        // assertion
        assertEquals("Als ich aufsah\nwar niemand mehr da\n\nEs war, als hätt' der Himmel\ndie Erde still geküsst,\nDass sie im Blütenschimmer\nVon Ihm nun träumen müsst\n\nDie Luft ging durch die Felder,\nDie Ähren wogten sacht,\nEs rauschten leis' die Wälder\nSo sternklar war die Waldesnacht\n", bos.toString());

        // undo the binding in System
        System.setOut(originalOut);
    }
}