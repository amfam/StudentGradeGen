package schoolprogram;
import java.util.*;

public class Result {
    double gradePoint;
    int totalMarks;

    String[] subject = {"Bangla  ", "English ", "Science "};
    HashMap<Double, String> grade = new HashMap<Double, String>();

    {
        grade.put(5.00, "A+");
        grade.put(4.00, "A ");
        grade.put(3.50, "A-");
        grade.put(3.00, "B ");
        grade.put(2.00, "C ");
        grade.put(1.00, "D ");
        grade.put(0.00, "F ");
    }

    public double getGradePoint(int marks) {
        if (marks >= 80) {
            return 5.00;
        } else if (marks >= 70 && marks < 80) {
            return 4.00;
        } else if (marks >= 60 && marks < 70) {
            return 3.50;
        } else if (marks >= 50 && marks < 60) {
            return 3.00;
        } else if (marks >= 40 && marks < 50) {
            return 2.00;
        } else if (marks >= 33 && marks < 40) {
            return 1.00;
        } else {
            return 0.00;
        }
    }

    public String getSubjectGrade(int i, int marks) {
        totalMarks += marks;
        gradePoint = getGradePoint(marks);

        return subject[i] + "|" +
                "  " + marks + "   |" +
                "     " + gradePoint + "     |" +
                "   " + grade.get(gradePoint) + "   |";

    }

    public String calculateGPA() {
        int marks = totalMarks / 3;
        gradePoint = getGradePoint(marks);
        return "           GPA  |" +
                "     " + gradePoint + "     |" +
                "   " + grade.get(gradePoint) + "   |";
    }

}