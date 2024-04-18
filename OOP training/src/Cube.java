public class Cube {
    private int edgeLength;

    public Cube(int edgeLength){
        this.edgeLength = edgeLength;
    }

    public int volume(){
        return edgeLength * edgeLength * edgeLength;
    }

    @Override
    public String toString(){
        return "The edge of the cube is: " +this.edgeLength + " and the volume of the cube is: " + this.volume();
    }
}
