package io.zipcoder.polymorphism;
import org.junit.Assert;
import org.junit.Test;

public class DogTest {
    @Test
    public void testSpeak() {
        Dog doggo = new Dog (null);
        String testBark = doggo.speak();
        String bark = "bork";
        Assert.assertEquals(bark, testBark);
    }
    @Test
    public void testConstructor() {
        String expectedName = "No Name";
        Dog dog = new Dog(expectedName);
        String actualName = dog.getName();
        Assert.assertEquals(expectedName, actualName);
    }
}