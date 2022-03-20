package com.udacity.examples.Testing;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class HelperParameterizedTest {

    private String input;
    private String output;

    public HelperParameterizedTest(String input, String output) {
        this.input = input;
        this.output = output;
    }

    @Parameterized.Parameters
    public static Collection initData(){
        String emNames [][] = {{"mshari","mshari"},{"mshari","ali"}};
        return Arrays.asList(emNames);
    }


    @Test
    public void verify_input_names_is_not_as_output_names_test(){
        Assert.assertNotEquals(input,output);

    }
}
