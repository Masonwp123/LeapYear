package edu.bsu.cs;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LeapYearCalculatorTest {

    @Test
    public void is2024ArrayLeapYear() {
        assertIsLeapYear(2024);
    }

    @Test
    public void is2025ArrayLeapYear() {
        assertIsNotLeapYear(2025);
    }

    @Test
    public void is2000ArrayLeapYear() {
        assertIsLeapYear(2000);
    }

    public void assertIsLeapYear(int inYear) {
        boolean isLeapYear = FindLeapYear.isLeapYear(inYear);
        Assertions.assertTrue(isLeapYear);
    }

    public void assertIsNotLeapYear(int inYear) {
        boolean isLeapYear = FindLeapYear.isLeapYear(inYear);
        Assertions.assertFalse(isLeapYear);
    }
}