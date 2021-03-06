package com.openclassrooms.testing;

/**
 * A very basic calculator.
 * Handy if you lose your phone.
 */
public class Calculator implements CalculatorInterface {

    /**
     * Adds the left argument to the right.
     * @param left The first number to be added
     * @param right A number to be added to the left argument
     * @return
     */
    public Double add(final Double left, final Double right) {
        return left + right;
    }

    /**
     * Subtracts one number from another.
     * @param left The first number to be added
     * @param right A number to be added to the left argument
     * @return result of the subtraction
     */
    public Double subtract(final Double left, final Double right) {
        return left - right;
    }
}
