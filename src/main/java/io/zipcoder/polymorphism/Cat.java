package io.zipcoder.polymorphism;

public class Cat extends Pet{


    public Cat (String name) {
        super(name); //from constructor
    }


    @Override
    public String speak() {
        return "meow";
    }

}
