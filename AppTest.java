package org.example;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    @Test

    public void given_number_add_number2_equal_and_resultadd_return_true(){

        int number1=9, number2=10;

        Assert.assertEquals(App.addNum(number1,number2),19);
    }
    @Test

    public void given_number1_multiply_number2__and_resul_multiply_return_true(){

        int number1=9, number2=10;

        Assert.assertEquals(App.mulNum(number1,number2),90);
    }
    @Test

    public void given_number_subtract_number2_equal_and_result_subtract_return_true(){

        int number1=19, number2=10;

        Assert.assertEquals(App.subNum(number1,number2),9);
    }

    @Test

    public void given_number_divide_number2_equal_and_result_divide_return_true(){

        int number1=90, number2=10;

        Assert.assertEquals(App.divNum(number1,number2),9);
    }

}
