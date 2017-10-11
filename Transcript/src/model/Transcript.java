package model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by carlorizzante on 21/08/17.
 */
public class Transcript {

    /**
     * INVARIANT: course list and grade list are the same size
     * each course has a grade associated, and vice versa, at matching indices
     */

    private int id;
    private String name;
    private List<String> courses = new ArrayList<String>();
    private List<Double> grades = new ArrayList<Double>();


    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }


    public Transcript(String name, int id) {
        this.name = name;
        this.id = id;
    }


    // EFFECTS: Returns the student's name as string
    public String getStudentName() { return getName(); }


    // REQUIRES: Course and valid grade [0.0, 4.0]
    // MODIFIES: this
    // EFFECTS: Adds new grade to courses and grades lists
    public void addGrade(String course, double grade) {
        courses.add(course);
        grades.add(grade);
    }


    // REQUIRES: none
    // MODIFIES: none
    // EFFECTS: Returns the list of grades<Double>
    public List<Double> getGrades() { return grades; }


    // REQUIRES: String course - the course being retrieved
    // MODIFIES: none
    // EFFECTS: Returns requested course and relative grade as string
    public String getGrade(String course) {
        String result = "";
        int limit = courses.size();
        for (int i = 0; i < limit; i++) {
            if (courses.get(i) == course) {
                result = courses.get(i);
                String grade = String.valueOf(grades.get(i));
                result += ": " + grade;
            }
        }
        return result;
    }


    // REQUIRES: none
    // MODIFIES: none
    // EFFECTS: Returns entire student's transcript as string
    public String getTranscript() {
        String transcript = "";
        int limit = courses.size();
        for (int i = 0; i < limit; i++) {
            transcript += courses.get(i) + ": " + String.valueOf(grades.get(i)) + ", ";
        }
        // Remove closing comma and space - ", "
        if (transcript != null && transcript.length() > 1) {
            transcript = transcript.substring(0, transcript.length() - 2);
        }
        return transcript;
    }


    // TODO 3: Implement printTranscript
    // REQUIRES: none
    // MODIFIES: none
    // EFFECTS: Prints out the entire transcript for current student
    public void printTranscript() {
        System.out.println(getTranscript());
    }


    // REQUIRES: none
    // MODIFIES: none
    // EFFECTS: Returns the current GPA
    public double getGPA() {
        Double result = 0.0;
        int len = grades.size();
        for (Double g : grades) {
            result += g;
        }
        return result / len;
    }

}
