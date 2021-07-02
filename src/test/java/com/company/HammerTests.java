package com.company;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HammerTests {
    // we have to test the functionality of AbstractEntity in one of the classes that inherit from it
    @Test
    public void testId() {
        Hammer testHammerOne = new Hammer("roofing");
        Hammer testHammerTwo = new Hammer("claw");
        Assertions.assertEquals(1, testHammerOne.getId());
        Assertions.assertEquals(2, testHammerTwo.getId());
    }
}
