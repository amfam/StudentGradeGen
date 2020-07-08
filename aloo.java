package schoolprogram;
import java.util.ArrayList;
import java.util.List;

public class aloo {
    public static void main(String[] args) {
        MyFile myFile = new MyFile();

        List<String> list = new ArrayList<>();
        list.add("ID,Name,Bangla,English,Science");
        list.add("01,Ishmam,90,85,98");
        list.add("02,Hasan,20,50,69");
        list.add("03,Abir,80,85,93");
        list.add("04,Faisal,81,75,69");

        myFile.createMarksFile(list);
        myFile.getStudentsMarks();
        myFile.makeMarkSheet();


    }
}