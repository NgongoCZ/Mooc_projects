import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

        while (true){
            System.out.println("Write a sentence, empty input  exits the program");
            String sentence = myScanner.nextLine();
            if (sentence.isEmpty()){
                System.out.println("Exiting program");
                break;
            }
            String[] arrayString = sentence.split(" ");
            System.out.println("Test print");
            for (String word : arrayString){
                System.out.println(word);
            }
            System.out.println("What letter are you looking for ?");
            String findLetter = myScanner.nextLine();

            for (int i = 0; i < arrayString.length; i++){
                if (arrayString[i].contains(findLetter)){
                    System.out.println(arrayString[i]);
                    System.out.println("At index of: " + i);
                }

            }

        }


    }
}