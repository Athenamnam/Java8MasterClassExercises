package personalExercise.exercise3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;

public class main {

    public static void main(String[] args) throws ParseException {
        //TODO: create a Predicate that accepts String and checks if there are no leading and lagging white space


        String inputString = "2023-62-31";

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd", Locale.ENGLISH);
        LocalDate date = LocalDate.parse(inputString, formatter);
        System.out.println(date); // 2010-01-02

    }
}
