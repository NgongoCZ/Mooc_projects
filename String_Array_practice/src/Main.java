/*
tak a closer look at the nested for loop because of the int age variable
 */

public class Main {
    public static void main(String[] args) {
        String[] csvData = new String[]{"Josh,21", "Hammond,42", "Brian,32"};

        int theOldest = 0;
        String oldestName = "";
        double averageAge = 0;
        int sum = 0;

        for (int i = 0; i < csvData.length; i++){
            String[] unSplitWord = csvData[i].split(",");
            for (int index = 0; index < unSplitWord.length; index++){
                System.out.println("Name: " + unSplitWord[index]);
                System.out.println("Age: " + unSplitWord[index+=1]);
                int age = Integer.parseInt(unSplitWord[1]);
                if (theOldest < age){
                    theOldest = age;
                    oldestName = unSplitWord[0];
                }
                sum+=age;

            }
        }
        averageAge = 1.00 * sum / csvData.length;
        System.out.println("The oldest is " + theOldest + " and the name is: " + oldestName);
        System.out.println("The average age is " + averageAge);
    }
}