import java.util.ArrayList;
import java.util.Scanner;

public class Statistics {

    private int numberCount;
    private int sum;
    private int average;
    private ArrayList<Integer> addNumbers = new ArrayList<>();

    public Statistics(){
        this.numberCount = 0;
    }

    public void addNumber(int number){
        addNumbers.add(number);
        numberCount++;
    }

    public int getCount(){
        return this.numberCount;
    }

    public int sum(){
        for (int a : this.addNumbers){
            sum += a;
        }return sum;
    }

    public double average(){
        return 1.00 * this.sum / this.numberCount;
    }

}
