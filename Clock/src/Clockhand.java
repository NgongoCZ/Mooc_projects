public class Clockhand {

    private int value;
    private int limit;

    public Clockhand(int limit){
        this.value = 0;
        this.limit = limit;
    }

    public void advance(){
        this.value++;
        if (this.value >= this.limit){
            this.value = 0;
        }
    }

    public int valueOf(){
        return this.value;
    }

    @Override
    public String toString(){
        if (this.value < 10){
            return "0" + value;
        }else{
            return "" + this.value;
        }
    }
}
