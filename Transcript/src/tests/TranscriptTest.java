package tests;

import model.Transcript;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created by carlorizzante on 23/08/17.
 */
public class TranscriptTest {

    private Transcript t;
    private String studentName = "Jon Snow";


    @Before
    public void setup() {
        t = new Transcript(studentName, 1234);
        t.addGrade("CPSC-210", 3.5);
        t.addGrade("ENGL-307", 3.9);
        t.addGrade("EENG-101", 2.7);
    }


    @Test
    public void testGetStudentName() {
        String name = t.getStudentName();
        assertEquals(name, studentName);
    }


    @Test
    public void testAddGrade() {
        t.addGrade("DUDA-123", 4.0);
        String result = t.getGrade("DUDA-123");
        String expected = "DUDA-123: 4.0";
        assertEquals(expected, result);
    }


    @Test
    public void testRetrieveSpecificGrade() {
        String result = t.getGrade("ENGL-307");
        String expected = "ENGL-307: 3.9";
        assertEquals(expected, result);
    }


    @Test
    public void testRetrieveInvalidGrade() {
        String result = t.getGrade("NONE-991");
        String expected = "";
        assertEquals(expected, result);
    }


    @Test
    public void testGetGrades() {
        List<Double> results = t.getGrades();
        List<Double> expected = new ArrayList<Double>();
        expected.add(3.5);
        expected.add(3.9);
        expected.add(2.7);
        assertEquals(expected, results);
    }


    @Test
    public void testGetTranscript() {
        String result = t.getTranscript();
        String expected = "CPSC-210: 3.5, ENGL-307: 3.9, EENG-101: 2.7";
        assertEquals(expected, result);
    }


    @Test
    public void testGetGPA() {
        Double result = t.getGPA();
        Double expected = (3.5 + 3.9 + 2.7) / 3;
        assertEquals(expected, result);
    }
}
