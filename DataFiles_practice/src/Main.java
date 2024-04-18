import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {

        while (true) {

            Scanner myScanner = new Scanner(System.in);
            ArrayList<String> myArray = new ArrayList<>();
            System.out.println("What file do you want to check ? ");
            String fileName = myScanner.nextLine();

            try {
                Scanner listScanner = new Scanner(Paths.get(fileName));
                while (listScanner.hasNextLine()) {
                    String getName = listScanner.nextLine();
                    myArray.add(getName);
                }
            } catch (IOException e) {
                System.out.println("Exception: " + e + ". Reading the file: " + fileName + " failed, please try again.");
                continue;
            }

            System.out.println("What name are you looking for ?");
            String findName = myScanner.nextLine();
            if (findName.isEmpty()){
                System.out.println("No such name, please try again");
                continue;
            }

            if (myArray.contains(findName)) {
                System.out.println(findName + " is present");
            } else System.out.println(findName + " is not present");

        }
    }
}