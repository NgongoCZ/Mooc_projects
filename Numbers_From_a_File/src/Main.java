import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> intList = new ArrayList<>();
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Select a file");
        String fileName = myScanner.nextLine();

        try{
            Scanner fileScanner = new Scanner(Paths.get(fileName));
            while (fileScanner.hasNextLine()){
                String stringNumber = fileScanner.nextLine();
                if (stringNumber.isEmpty()){
                    continue;
                }
                int number = Integer.parseInt(stringNumber);
                intList.add(number);
            }
            System.out.println("Test print");
            for (int num : intList){
                System.out.println(num);
            }

        }catch(IOException e){
            System.out.println("Exception " + e + " happened.");
        }

        System.out.println("Select a lower range");
        int lowerRange = myScanner.nextInt();
        myScanner.nextLine();
        System.out.println("Select upper range");
        int upperRange = myScanner.nextInt();
        myScanner.close();

        System.out.println("Numbers within your range:");
        for (int num : intList){
            if (num >= lowerRange && num <= upperRange){
                System.out.println(num);
            }
        }
    }
}