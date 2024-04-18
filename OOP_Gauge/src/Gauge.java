public class Gauge {

    private int value;

    public Gauge(){

    }

    public void increase(){
        if (this.value <= 5){
            value++;
        }
    }

    public void decrease(){
        if (this.value >= 0){
            value--;
        }
    }

    public int getValue(){
        return this.value;
    }

    public boolean isFull(){
        return this.value == 5;
    }


}
