package animalkingdom;

public class Main 
{
    public static void main(String[] args)
    {
        System.out.println("Check this out");

        // initializing Mammals
        Mammals panda = new Mammals("Panda", 1869);
        Mammals zebra = new Mammals("Zebra", 1778);
        Mammals koala = new Mammals("Koala", 1816);
        Mammals sloth = new Mammals("Sloth", 1804);
        Mammals armadillo = new Mammals("Armadillo", 1758);
        Mammals raccoon = new Mammals("Raccoon", 1758);
        Mammals bigfoot = new Mammals("Bigfoot", 2021);

        // initializing Birds
        Birds pigeon = new Birds("Pigeon", 1837);
        Birds peacock = new Birds("Peacock", 1821);
        Birds toucan = new Birds("Toucan", 1758);
        Birds parrot = new Birds("Parrot", 1824);
        Birds swan = new Birds("Swan", 1758);

        // initializing Fish
        Fish salmon = new Fish("Salmon", 1758);
        Fish catfish = new Fish("Catfish", 1817);
        Fish perch = new Fish("Perch", 1758);

        // ArrayList => size is not fixed BUT elements must be of the same type
        // Thus, in this scenario, defining it as an 'Animals' type will suffice

        // initializing ArrayList
        List<Animals> animalList = new ArrayList<>();

        // adding elements to ArrayList
        animalList.add(panda);
        animalList.add(zebra);
        animalList.add(koala);
        animalList.add(sloth);
        animalList.add(armadillo);
        animalList.add(raccoon);
        animalList.add(bigfoot);

        animalList.add(pigeon);
        animalList.add(peacock);
        animalList.add(toucan);
        animalList.add(parrot);
        animalList.add(swan);

        animalList.add(salmon);
        animalList.add(catfish);
        animalList.add(perch);
    }

    
}