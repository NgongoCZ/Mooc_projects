public class Television_program {
    private String name;
    private int duration;

    public Television_program(String name, int duration){
        this.name = name;
        this.duration = duration;
    }

    public int getDuration(){
        return this.duration;
    }

    @Override
    public String toString(){
        return "Name: " + this.name + ", Duration: " + this.duration;
    }
}