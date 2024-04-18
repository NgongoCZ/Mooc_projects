public class Main {
    public static void main(String[] args) {

        Timer myTimer = new Timer();
        while (true){
            myTimer.advance();
            System.out.println(myTimer);
        }
    }
}