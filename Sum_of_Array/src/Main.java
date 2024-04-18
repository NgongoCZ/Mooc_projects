public class Main {

    public static void sumOfTheArray(int[] myArray){
        for (int i = 0; i < myArray.length - 1; i++){
            System.out.print(myArray[i] + ", ");
        }
        System.out.print(myArray[myArray.length -1]);
    }

    public static void main(String[] args) {

        int[] myArray = new int[]{2,4,7,1};
        sumOfTheArray(myArray);

    }
}