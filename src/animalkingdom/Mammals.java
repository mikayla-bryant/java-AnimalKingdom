package animalkingdom;

public class Mammals extends Animals
{
    //inheriting fields from Animal
    public Mammals(String name, int year) {
        super(name, year);
    }

    @Override
    public String reproduce() {
        return "live births";
    }

    @Override
    public String move() {
        return "walk";
    }

    @Override
    public String breathe() {
        return "lungs";
    }

    @Override
    public String filteredString()
    {
        return name + " " + reproduce() + " " + move() + " " + breathe() + " " + year; 
    }
}