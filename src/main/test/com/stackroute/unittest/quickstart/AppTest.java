package com.stackroute.unittest.quickstart;

import org.junit.*;

import static org.junit.Assert.*;

public class AppTest {


    App app;
    @BeforeClass
    public static void setUpOnce(){
        System.out.println("Inside setup once");

    }

    @AfterClass
    public static void teardownOnce(){
        System.out.println("Inside teardown once");

    }
    @Before
    public void setUp(){
        System.out.println("Inside setup");
         app=new App();
    }

    @After
    public void tearDown(){
        System.out.println("Inside teardown");
        app=null;
    }
   @Test
   @Ignore
    public void testConcatAndConvertString() throws Exception {
       //Arrange
       String expectedValue="BCA";

       //Act
       String actualValue=app.concatAndConvertString("bc", "A");
       //Assert
       assertEquals(expectedValue, actualValue);
       assertNotNull(actualValue);
    }

    @Test
    public void testConcatAndConvertStringIsNotNull() throws Exception {
        //Arrange
        String expectedValue="fffBCA";

        //Act
        String actualValue=app.concatAndConvertString("bc", "A");
        //Assert
           assertNotNull(actualValue);
    }
}



