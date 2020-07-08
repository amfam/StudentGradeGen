package schoolprogram;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class MyFile {
    File folder, folder2;
    File marks, resultSheet;
    List<String> studentList;

    PrintWriter printWriter;

    public MyFile() {
        folder = new File("file");
        folder.mkdir();
        folder2 = new File(folder.getPath() + "/marksheet");
        folder2.mkdir();
    }

    public void createMarksFile(List<String> list) {
        marks = new File(folder.getPath() + "/marks.txt");
        try {
            marks.createNewFile();
            printWriter = new PrintWriter(marks);
            if (marks.exists()) {
                for (String s : list) {
                    printWriter.println(s);
                }
                printWriter.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public void getStudentsMarks() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(marks));
            studentList = new ArrayList<>();
            String student;

            while ((student = reader.readLine()) != null) {
                studentList.add(student);
            }
            reader.close();
            studentList.remove(0);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void makeMarkSheet() {
        for (String s : studentList) {
            String[] student = s.split(",");
            resultSheet = new File(folder2.getPath() + "/" + student[0] + "-" + student[1] + ".txt");
            if (!resultSheet.exists()) {
                try {
                    resultSheet.createNewFile();
                    printWriter = new PrintWriter(resultSheet);
                    printWriter.println("Name: " + student[1] + "    " + "Student Roll: " + student[0]);
                    printWriter.println("_______________________________________");
                    printWriter.println("Subject | Marks | Grade Point | Grade  |");
                    printWriter.println("---------------------------------------");
                    Result result = new Result();
                    for (int i = 2; i < 5; i++) {
                        printWriter.println(result.getSubjectGrade((i - 2), Integer.valueOf(student[i])));
                        printWriter.println("---------------------------------------");
                    }
                    printWriter.println(result.calculateGPA());
                    printWriter.println("_______________________________________");
                    printWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }


}