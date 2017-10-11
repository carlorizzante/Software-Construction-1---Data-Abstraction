package ui;

import model.Transcript;

/**
 * Created by carlorizzante on 22/08/17.
 */
public class Main {

    public static void main(String[] args) {

        Transcript t1 = new Transcript("Jon Snow", 1234);
        Transcript t2 = new Transcript("Jane Doe", 2341);
        Transcript t3 = new Transcript("Julia Mao", 4518);

        t1.addGrade("CPSC-210", 3.5);
        t1.addGrade("ENGL-201", 4.0);
        t1.addGrade("CPSC-110", 3.1);

        t2.addGrade("CPSC-210", 3.3);
        t2.addGrade("ENGL-201", 3.9);
        t2.addGrade("CPSC-110", 3.7);

        t3.addGrade("CPSC-210", 3.0);
        t3.addGrade("ENGL-201", 2.7);
        t3.addGrade("CPSC-110", 3.5);

        System.out.print(t1.getStudentName() + ": ");
        t1.printTranscript();
        System.out.println("GPA: " + t1.getGPA());

        System.out.print(t2.getStudentName() + ": ");
        t2.printTranscript();
        System.out.println("GPA: " + t2.getGPA());

        System.out.print(t3.getStudentName() + ": ");
        t3.printTranscript();
        System.out.println("GPA: " + t3.getGPA());

        System.out.print("All done!");
    }
}
