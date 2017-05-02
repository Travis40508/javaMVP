package com.company.Calculator;

/**
 * Created by rodneytressler on 5/1/17.
 */
public interface CalculatorView {
    void startOpeningMessage();

    void askForSecondNum();

    void displaySum(int firstNum, int secondNum, int sum);

    void startOver();

    void sayGoodbye();

    void invalidResponse();
}
