import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //all numbers
        Statistics statistics = new Statistics();
        Statistics evenStatistics = new Statistics();
        Statistics oddStatistic = new Statistics();

        Scanner myScanner = new Scanner(System.in);
        System.out.println("Write numbers, -1 exits the program");

        while (true){
            int inputNumber = myScanner.nextInt();
            if (inputNumber == -1){
                System.out.println("Exit");
                break;
            }
            statistics.addNumber(inputNumber);

            if (inputNumber % 2 == 0){
                evenStatistics.addNumber(inputNumber);
            }else oddStatistic.addNumber(inputNumber);
        }



        System.out.println("Total sum: " + statistics.sum());
        System.out.println("Even sum: " + evenStatistics.sum());
        System.out.println("Odd sum: " + oddStatistic.sum());



    }
}