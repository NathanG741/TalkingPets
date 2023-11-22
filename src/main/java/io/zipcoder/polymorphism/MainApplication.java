package io.zipcoder.polymorphism;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class MainApplication {

    Map<String, String> pets;

    public MainApplication() {
        this.pets = new LinkedHashMap<>();

    }

    public Integer getHowManyPets() {
        Scanner scanner = new Scanner(System.in);
        Integer petCount = scanner.nextInt();
        return petCount;
    }

    public String getWhatKindOfPet() {
        Scanner scanner = new Scanner(System.in);
        String petType = scanner.nextLine();
        return petType;
    }

    public String getNameOfPet() {
        Scanner scanner = new Scanner(System.in);
        String petName = scanner.nextLine();
        return petName;
    }

    public static void main(String[] args) {
        MainApplication results = new MainApplication();
        System.out.println("\nHow many pets do you have?");
        Integer petCount = results.getHowManyPets();

        ArrayList<String> arr = new ArrayList<>();
        String petName = "";
        for (int i = 1; i <= petCount; i++) {
            System.out.println("\nWhat kind of pet is pet #" + i + "?");
            String petType = results.getWhatKindOfPet();

            System.out.println("\nWhat is the name of pet #" + i + "?");
            petName = results.getNameOfPet();


            arr.add(petType);

        }
        for(int j = 0; j < arr.size(); j++) {
            if (arr.get(j).equals("Dog")) {
                Dog dog = new Dog(petName);
                System.out.println(arr.get(j) + " named " + dog.getName() + " says " + dog.speak() + ".");
            }
        }

        for(int j = 0; j < arr.size(); j++) {
            if (arr.get(j).equals("Cat")) {
                Cat cat = new Cat(petName);
                System.out.println(arr.get(j) + " named " + cat.getName() + " says " + cat.speak() + ".");
            }
        }

        for(int j = 0; j < arr.size(); j++) {
            if (arr.get(j).equals("Tiger")) {
                Tiger tiger = new Tiger(petName);
                System.out.println(arr.get(j) + " named " + tiger.getName() + " says " + tiger.speak());
            }
        }
    }
}
