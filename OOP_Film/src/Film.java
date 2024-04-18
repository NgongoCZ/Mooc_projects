public class Film {

    private String name;
    private int ageRate;

    public Film(String name, int ageRate){
        this.name = name;
        this.ageRate = ageRate;
    }

    public String name(){
        return "Name: " + this.name;
    }

    public int getAgeRate(){
        return this.ageRate;
    }

    public boolean isOldEnough(int getAge){
        if (getAge >= this.getAgeRate()){
            return true;
        }else return false;
    }

}
