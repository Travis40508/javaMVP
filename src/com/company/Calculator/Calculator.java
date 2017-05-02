package com.company.Calculator;

import java.util.Scanner;

/**
 * Created by rodneytressler on 5/1/17.
 */
public class Calculator implements CalculatorView {
    private CalculatorPresenter presenter;
    private Scanner scanner;

    public Calculator() {

    }

    public void init() {
        presenter = new CalculatorPresenter();
        scanner = new Scanner(System.in);
        presenter.setView(this);
    }

    @Override
    public void startOpeningMessage() {
        System.out.println("Welcome to the adding calculator! Please enter your first number");
        presenter.firstNumEntered(scanner.nextInt());
    }

    @Override
    public void askForSecondNum() {
        System.out.println("Please enter your second number");
        presenter.secondNumEntered(scanner.nextInt());
    }

    @Override
    public void displaySum(int firstNum, int secondNum, int sum) {
        System.out.println("The sum of " + firstNum + " and " + secondNum + " = " + sum);
        System.out.println("Another?");
        presenter.moreResponse(scanner.next());
    }

    @Override
    public void startOver() {
        startOpeningMessage();
    }

    @Override
    public void sayGoodbye() {
        System.out.println("Thanks for stopping by!");
    }

    @Override
    public void invalidResponse() {
        System.out.println("Invalid response, please try again");
        System.out.println("Would you like to perform another calculation?");
        presenter.moreResponse(scanner.next());
    }
}
