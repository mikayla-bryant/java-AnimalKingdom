package animalkingdom;

// Abstract Class
abstract class Animals
{
    protected static int maxId = 0;
    protected int id;
    protected String name;
    protected int year;

    abstract String reproduce();
    abstract String move();
    abstract String breathe();
    abstract String filteredString();

    
    // default constructor
    public Animals(String name, int year) 
    {
        maxId++;
        id = maxId;
        this.name = name;
        this.year = year;
    }

    String getName() {
        return name;
    }

    int getId() {
        return id;
    }

    int getYear() {
        return year;
    }
    
    // this will override what the ArrayList prints out for each element
    @Override
    public String toString(){
        return "id = " + id + " name = " + name + " year = " + year;
    }

}