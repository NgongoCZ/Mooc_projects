import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Television_program>myPrograms = new ArrayList<>();

        while (true){
            Scanner myScanner = new Scanner(System.in);
            System.out.println("Insert televison program name, empty input exits");
            String programName = myScanner.nextLine();
            if (programName.isEmpty()){
                System.out.println("Exit");
                break;
            }

            System.out.println("Enter program duration");
            int programDuration = myScanner.nextInt();

            myPrograms.add(new Television_program(programName, programDuration));
        }

        Scanner durationScanner = new Scanner(System.in);
        System.out.println("How long is the program supposed to be ?");
        int preferedDuration = durationScanner.nextInt();
        durationScanner.close();
        for (Television_program program : myPrograms){
            if (program.getDuration() <= preferedDuration){
                System.out.println(program);
            }
        }
    }
}