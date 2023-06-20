package personalExercise.exercise2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class main {

    public static void main(String[] args) {
        //TODO: create a Function that accepts two integers, adds the two Integers and returns it as type DOUBLE

//        Integer[] numArr = {7, 5, 901, 175, 8, 100, 21, 16, 3, 26, 34, 89, 82, 1, 1000, 101}; // First Middle number is 21
//
        Integer[] numArr = { 7, 5, 8, 901, 175, 100, 21, 16, 3, 26, 34, 89, 1, 1000, 101 }; // Middle number is 16

        List<Double> newList = Arrays.stream(numArr)
                .filter(tempNum -> tempNum <= 100)
                .sorted((f1, f2) -> Integer.compare(f2, f1))
                .map(oldInt -> Double.valueOf(oldInt))
                .collect(Collectors.toList());

        int middlePlace = newList.size() % 2 == 0 ? (newList.size() / 2) - 1 : newList.size() / 2;

        System.out.println("New List: " + newList);
        System.out.println("First Middle number: " + newList.get(middlePlace));


    }
}
