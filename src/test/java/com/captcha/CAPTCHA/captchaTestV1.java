package com.captcha.CAPTCHA;

import org.junit.Assert;
import org.junit.Test;

public class captchaTestV1 {

    @Test
    public void patternOneShouldGenerateOnePlus1(){
        Captcha captcha = new Captcha(1,1,1,1);
        Assert.assertEquals("One + 1",captcha.toString());
    }

    @Test
    public void patternOneShouldReturnNinePlus1() {
        Captcha captcha = new Captcha(1,9,1,1);
        Assert.assertEquals("Nine + 1",captcha.toString());
    }

    @Test
    public  void  patternOneShouldReturnResultLeftOperand(){
        Captcha captcha = new Captcha(1,1,1,1);
        Assert.assertEquals("One",captcha.getLeft());
    }

    @Test
    public void patternOneShouldReturnResultNine() {
        Captcha captcha = new Captcha(1,9,1,1);
        Assert.assertEquals("Nine",captcha.getLeft());
    }

    @Test
    public  void patternTwoShouldReturnResult1(){
        Captcha captcha = new Captcha(2,1,1,1);
        Assert.assertEquals("1",captcha.getLeft());
    }

    @Test
    public void  patternTwoShouldReturnNumberRightOperand(){
        Captcha captcha = new Captcha(1,1,1,1);
        Assert.assertEquals("1",captcha.getRight());
    }

    @Test
    public void  patternTwoShouldReturnNStringRightOperand(){
        Captcha captcha = new Captcha(2,1,1,1);
        Assert.assertEquals("One",captcha.getRight());
    }

}
