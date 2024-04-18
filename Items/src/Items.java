import java.time.LocalTime;

public class Items {

    private String name;

    //variable for current time
    private LocalTime now;

    public Items(String name, LocalTime now){
        this.name = name;
        this.now = now;
    }

    @Override
    public String toString(){
        return "Name " + this.name + ", Time: " + now;
    }


}
