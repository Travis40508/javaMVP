package com.company.Calculator;

/**
 * Created by rodneytressler on 5/1/17.
 */
public class CalculatorPresenter {
    private CalculatorView view;
    private int firstNum;
    private int secondNum;
    private int sum;


    public void setView(Calculator calculator) {
        this.view = calculator;
        if(view != null) {
            getView().startOpeningMessage();
        }
    }

    public CalculatorView getView() {
        return view;
    }

    public void firstNumEntered(int i) {
        this.firstNum = i;
        getView().askForSecondNum();
    }

    public void secondNumEntered(int i) {
        this.secondNum = i;
        calculateSum();
    }

    public void calculateSum() {
        this.sum = firstNum + secondNum;
        getView().displaySum(firstNum, secondNum, sum);
    }

    public void moreResponse(String response) {
        if (response.charAt(0) == 'y') {
            getView().startOver();
        } else if (response.charAt(0) == 'n') {
            getView().sayGoodbye();
        } else {
            getView().invalidResponse();
        }
    }
}
