package animalkingdom;

public class Birds extends Animals
{
    public Birds(String name, int year)
    {
        super(name, year);
    }

    @Override
    public String reproduce() {
        return "eggs";
    }
    
    @Override
    public String move() {
        return "fly";
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