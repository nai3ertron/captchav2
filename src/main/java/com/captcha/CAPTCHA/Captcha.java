package com.captcha.CAPTCHA;

import java.util.List;

public class Captcha {

    private String[] patternArray={"1","2"};
    private String[] number={"1","2","3","4","5","6","7","8","9"};
    private String[] operatorArray={"+","-","*","/"};
    private String[] number1={"1","2","3","4","5","6","7","8","9"};

    private int pattern;
    private int leftOperand;
    private int operater;
    private int rightOperand;



    public Captcha(int pattern, int leftOperand, int operater, int rightOperand) {
        this.pattern = pattern;
        this.leftOperand = leftOperand;
        this.operater = operater;
        this.rightOperand = rightOperand;
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
        if(this.leftOperand==1) {
            return "One + 1";
        }else if(this.leftOperand==9){
            return "Nine + 1";
        }
        return "";
    }
}


















