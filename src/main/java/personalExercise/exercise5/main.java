package personalExercise.exercise5;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 * Read the exercise5.txt file using the NIO methods.
 * Display the values as shown.
 * */
public class main {

    public static void main(String[] args) throws IOException {

        Integer totalBounty = 0;
        Path path = Paths.get("/Projects/JavaMasterClass/src/main/java/personalExercise/exercise5/exercise5.txt");

        List<String> contents = Files.readAllLines(path);
        List<Integer> bounties = new ArrayList<>();


        for (int i=1; i<contents.size() ; i++) {
            String content = contents.get(i);
            String[] output = content.split(",");
            System.out.println("\nName: " + output[0]);
            System.out.println("Address: " + output[1]);
            System.out.println("Bounty: " + output[2]);
            bounties.add(Integer.parseInt(output[2]));
        }

        totalBounty = bounties.stream().reduce(0,(integer, integer2) -> Math.addExact(integer,integer2));
        System.out.println("\nTotal Bounty: " + totalBounty);





//        try(BufferedReader reader = Files.newBufferedReader(path, Charset.forName("UTF-8"))){
//
//            String currentLine = null;
//
//            reader.readLine(); // to read first line
//            while((currentLine = reader.readLine()) != null){ //while there is content on the current line
//                String[] output = currentLine.split(",");
//                System.out.println("Name: " + output[0]);
//                System.out.println("Address: " + output[1]);
//                System.out.println("Bounty: " + output[2]);
//                System.out.println();
//
//                totalBounty = Math.addExact(totalBounty, Integer.parseInt(output[2]));
//            }
//
//            System.out.println("Total Bounty: " +totalBounty);
//        }catch(IOException ex){
//            ex.printStackTrace(); //handle an exception here
//        }

    }
}
