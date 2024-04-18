public class Main {
    public static void main(String[] args) {

        int[] myArray = new int[]{5,1,3,4,2};

        for (int i = 0; i < myArray.length; i++){
            int numOfStars = myArray[i];
            for (int a = 0; a < numOfStars; a++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}