public class Main {
    public static void main(String[] args) {

        Clock myClock = new Clock();
        while (true){
            myClock.advance();
            System.out.println(myClock);
        }
    }
}