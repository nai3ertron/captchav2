package com.captcha.CAPTCHA;

import java.util.List;

public class Captcha {

    private String[] patternArray = {"1", "2"};
    private String[] rightArrayOperand = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
    private String[] operatorArray = {".", "+", "-", "*", "/"};
    private String[] leftArrayOperand = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};

    private int pattern;
    private int leftOperand;
    private int operater;
    private int rightOperand;

    public Captcha(int pattern, int leftOperand, int operater, int rightOperand) {
        this.pattern = pattern;
        this.rightOperand = rightOperand;
        this.operater = operater;
        this.leftOperand = leftOperand;
    }

    public int getPattern() {
        return pattern;
    }

    public void setPattern(int pattern) {
        this.pattern = pattern;
    }

    public int getLeftOperand() {
        return leftOperand;
    }

    public void setLeftOperand(int leftOperand) {
        this.leftOperand = leftOperand;
    }

    public int getOperater() {
        return operater;
    }

    public void setOperater(int operater) {
        this.operater = operater;
    }

    public int getRightOperand() {
        return rightOperand;
    }

    public void setRightOperand(int rightOperand) {
        this.rightOperand = rightOperand;
    }

    @Override
    public String toString() {
        String word = "";

        word = this.getLeft() + " " + this.getOperator() + " " + this.getRight();

        return word;
    }

    public String getRight() {
        if (this.pattern == 1) {
            return this.rightArrayOperand[this.rightOperand];
        } else {
            return this.leftArrayOperand[this.leftOperand];
        }

    }

    public String getLeft() {
        if (this.pattern == 1) {
            return this.leftArrayOperand[this.leftOperand];
        } else {
            return this.rightArrayOperand[this.leftOperand];
        }

    }

    public String getOperator() {
        return this.operatorArray[this.operater];
    }


}


















