import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Ride enterprise = new Ride("Enterprise", 160);
        System.out.println(enterprise);
        while (true){
            Scanner myScanner = new Scanner(System.in);
            System.out.println("Create a person");
            System.out.println("Set name");
            String name = myScanner.nextLine();
            System.out.println("Set height");
            int height = myScanner.nextInt();
            myScanner.nextLine();
            Person guy = new Person(height, name);

            enterprise.isHighEnough(guy);
            System.out.println("Do you want to continue ?");
            String answer = myScanner.nextLine();
            if (answer.equals("yes")){
                continue;
            } else if (answer.equals("no")) {
                System.out.println("Exit");
                break;
            }
        }
        System.out.println("Number of rides: " + enterprise.getNumberOfRides());
    }
}