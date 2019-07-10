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
    private void patternOneShould() {

    }

}
