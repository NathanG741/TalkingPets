package io.zipcoder.polymorphism;

public class Tiger extends Pet {
    public Tiger (String name) {super(name);}

    @Override
    public String speak() {return "rawr!";}
}