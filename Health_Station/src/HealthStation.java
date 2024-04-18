public class HealthStation {

    private int numOfWeighings;

    public HealthStation(){
        this.numOfWeighings = 0;
    }
    public int getWeight(Person person){
        return person.getWeight();

    }

    public void feed (Person person){
        person.setWeight(person.getWeight() + 1);
    }

    public int weighing(Person person){
        return numOfWeighings++;

    }
    public int numOfWeight(){
        return this.numOfWeighings;
    }

}
