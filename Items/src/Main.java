import java.time.LocalTime;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        Scanner myScanner = new Scanner(System.in);
        ArrayList<Items>itemList = new ArrayList<>();

        while (true){
            String itemName = myScanner.nextLine();
            if (itemName.isEmpty()){
                System.out.println("Empty input, exit");
                break;
            }
            //saving a current time when the itemName was created and saved in the itemList
            LocalTime now = LocalTime.now();
            itemList.add(new Items(itemName,now));
        }

        for (Items item : itemList){
            System.out.println(item);
        }

    }
}