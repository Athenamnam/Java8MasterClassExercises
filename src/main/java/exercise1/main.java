package exercise1;

public class main {

    interface Counter {

        abstract Integer count(String message);
    }

    public static void main(String[] args) {

        Counter lengthCounter = String::length;

        Counter lettersCounter = m -> {
            int letter = 0;

            char[] ch = m.toCharArray();

            for (int i = 0; i < m.length(); i++) {
                if (Character.isLetter(ch[i])) {
                    letter++;
                }
            }
            return letter;
        };


        System.out.println(lengthCounter.count("There are 8 planets in the solar system!"));

        System.out.println(lettersCounter.count("There are 8 planets in the solar system!"));
    }
}
