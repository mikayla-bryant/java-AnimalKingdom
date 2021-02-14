package animalkingdom;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Main 
{   
    private static List<Animals> filterAnimal(List<Animals> animal, CheckAnimal tester)
    {
        List<Animals> tempList = new ArrayList<>();
        for(Animals a : animal)
        {
            if (tester.test(a))
            {
                tempList.add(a);
            }
        }

        return tempList;
    }

    public static void main(String[] args)
    {
        System.out.println("Here's a list of animals:");

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

        System.out.println(animalList);
        System.out.println("\n *** Sort List ***");

        // Lambda Expressions

        System.out.println("\n List of animals by year in descending order: \n");
        animalList.sort((a1, a2) -> Integer.compare(a2.getYear(), a1.getYear()));
        animalList.forEach((a) -> System.out.println(" * " + a.getName() + " - " + a.getYear()));

        System.out.println("\n List of animals in alphabetical order: \n");
        animalList.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
        animalList.forEach((a) -> System.out.println(" * " + a.getName()));

        System.out.println("\n List of animals in order by how they move: \n");
        animalList.sort((a1, a2) -> a1.move().compareToIgnoreCase(a2.move()));
        animalList.forEach((a) -> System.out.println(" * " + a.getName() + " - " + a.move()));

        System.out.println("\n List of animals that breathe with lungs: \n");
        List<Animals> lungAnimals = filterAnimal(animalList, (a) -> a.breathe() == "lungs");
        lungAnimals.forEach((a) -> System.out.println(" * " + a.getName()));

        System.out.println("\n List of animals that breathe with lungs and were named in 1758: \n");
        List<Animals> lungYearAnimals = filterAnimal(animalList, (a) -> a.breathe() == "lungs" && a.getYear() == 1758);
        lungYearAnimals.forEach((a) -> System.out.println(" * " + a.getName()));

        System.out.println("\n List of animals that breathe with lungs and lay eggs: \n");
        List<Animals> lungEggsAnimals = filterAnimal(animalList, (a) -> a.breathe() == "lungs" && a.reproduce() == "eggs");
        lungEggsAnimals.forEach((a) -> System.out.println(" * " + a.getName()));

        System.out.println("\n List of animals that were named in 1758: \n");
        List<Animals> yearAnimals = filterAnimal(animalList, (a) -> a.getYear() == 1758);
        yearAnimals.forEach((a) -> System.out.println(" * " + a.getName()));

        System.out.println("\n STRETCH CHALLENGE: List of mammals in alphabetical order: \n");
        List<Animals> mammalsAlphabetical = filterAnimal(animalList, (a) -> (a instanceof Mammals));
        mammalsAlphabetical.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
        mammalsAlphabetical.forEach((a) -> System.out.println(" * " + a.getName()));
        
    }

    
}