package io.zipcoder.polymorphism;

public class Dog extends Pet{
    public Dog (String name) {
        super(name); //from constructor
    }

    public Dog() {

    }

    @Override
    public String speak() {
        return "bork";
    }

}