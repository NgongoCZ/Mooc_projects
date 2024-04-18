import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("How long will the array be ?");
        Scanner myScanner = new Scanner(System.in);
        int howMany = myScanner.nextInt();
        int[] myArray = new int[howMany];

        System.out.println("Write " + howMany + " numbers");

        for (int i = 0; i < howMany; i++){
            int addNumber = myScanner.nextInt();
            myArray[i] = addNumber;
        }

        System.out.println("Here are your numbers");
        for (int num : myArray){
            System.out.println(num);
        }
    }
}