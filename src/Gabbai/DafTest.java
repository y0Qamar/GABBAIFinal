package Gabbai;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class DafTest {

    //https://stackoverflow.com/questions/32241057/how-to-test-a-print-method-in-java-using-junit

    //want to test that UCry pulls up when called
    @Test
   public void testUcryOpps() throws Exception  {
     //convers UCry to outputstrem
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        //outcontent variable
        System.setOut(new PrintStream(outContent));
        //test variable
        var homies = new Daf();
        // After this all System.out.println() statements will come to outContent stream.
        homies.ucryOpps();
        String expectedOut = "Type (C) to create milah\nType (R) to read milim\nType (U) to update milah\nType (Y) to yeet milah\nType (Q) to quit\n";

        assertEquals(expectedOut,outContent.toString());
    }

}