package com.stackroute.unittest.quickstart;

import org.junit.Test;

import static org.junit.Assert.*;

public class AppTest2 {

    @Test
    public void concatAndConvertString() {
        //Arrange
        String expectedValue="HELLOWORLD";
        App app=new App();
        //Act
        String actualValue=app.concatAndConvertString("Hello", "World");
        //Assert
        assertNotNull(actualValue);
        assertEquals(expectedValue, actualValue);
    }
}