import java.sql.Array;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

       int[] myArray = new int[]{1, 3, 5, 7, 9};

       for (int num : myArray){
           System.out.println(num);
       }

       System.out.println("Which numbers do you want to swap?");
       Scanner myScanner = new Scanner(System.in);
       int firstNumber = myScanner.nextInt();
       myScanner.nextLine();
       int secondNumber = myScanner.nextInt();


       int helper = myArray[firstNumber];
       myArray[firstNumber] = myArray[secondNumber];
       myArray[secondNumber] = helper;

       for (int i = 0; i < myArray.length; i++){
           System.out.println(myArray[i]);
       }


    }
}