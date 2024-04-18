import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] myArray = new int[]{7, 3, 9, 7, 3};


        System.out.println("What numbers are you looking for ?");
        Scanner myScanner = new Scanner(System.in);
        int myNumber = myScanner.nextInt();
        int indexOf = 0;

        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] == myNumber) {
                indexOf = i;
                System.out.println("Number " + myNumber + " is on index of : " + indexOf);
            }
        }
    }
}