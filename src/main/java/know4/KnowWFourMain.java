package know4;

import java.util.ArrayList;
import java.util.Arrays;

public class KnowWFourMain {
    public static void main(String[] args) {

        ArrayList<String> employeeList = new ArrayList<>(Arrays.asList("Arbaaz","Rohit","Sidharth","Gowthami","Roger",
                "Sangeetha","Ankita","Omprakash"));

        KnowWFour object = new KnowWFour();
        object.meetScheduler(employeeList);

    }
}