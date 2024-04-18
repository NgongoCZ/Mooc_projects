public class Main {
    public static void main(String[] args) {

        Gauge g = new Gauge();
        System.out.println(g.getValue());
        System.out.println(g.isFull());
        for (int i = 0; i < 5; i++){
            g.increase();
        }
        System.out.println(g.getValue());
        System.out.println(g.isFull());

        g.decrease();
        g.decrease();
        System.out.println(g.getValue());
        System.out.println(g.isFull());
    }
}

