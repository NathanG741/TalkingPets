package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CatTest {

    @Test
    public void speak() {
        Cat kitty = new Cat(null);

        String testMeow = kitty.speak();
        String meow = "meow";

        Assert.assertEquals(meow, testMeow);

    }

    @Test
    public void testConstructor() {
        String expectedName = "Whitney";
        Cat cat = new Cat(expectedName);

        String actualName = cat.getName();

        Assert.assertEquals(expectedName, actualName);
    }
}