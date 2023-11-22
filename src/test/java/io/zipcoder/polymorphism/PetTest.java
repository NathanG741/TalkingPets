package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PetTest {

    @Test
    public void testInheritance() {
        Pet petty = new Cat(null);
        Assert.assertTrue(petty instanceof Pet);
    }
}