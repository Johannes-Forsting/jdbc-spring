package com.example.demo.services;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServicesTest {


    @Test
    void whatIsIt() {
        Services calc = new Services();
        //Arrange
        String excpectedMorning = "morning";
        String excpectedAfternoon = "afternoon";
        String excpectedEvening = "evening";
        String excpectedNight = "night";


        //Act
        String morningResult = calc.whatIsIt(7);
        String afternoonResult = calc.whatIsIt(14);
        String eveningResult = calc.whatIsIt(18);
        String nighRestult = calc.whatIsIt(02);


        //Assert
        assertEquals(excpectedMorning, morningResult);
        assertEquals(excpectedAfternoon, afternoonResult);
        assertEquals(excpectedEvening, eveningResult);
        assertEquals(excpectedNight, nighRestult);
    }

    @Test
    void isDepartmentNumberValid() {
        Services calc = new Services();
        //Arrange
        boolean expectedInvalid = false;
        boolean expectedValid = true;


        //Act
        boolean invalidResult1 = calc.isDepartmentNumberValid(223);
        boolean invalidResult2 = calc.isDepartmentNumberValid(1000);
        boolean invalidResult3 = calc.isDepartmentNumberValid(9);
        boolean invalidResult4 = calc.isDepartmentNumberValid(-110);
        boolean invalidResult5 = calc.isDepartmentNumberValid(998);
        boolean validResult1 = calc.isDepartmentNumberValid(110);
        boolean validResult2 = calc.isDepartmentNumberValid(910);
        boolean validResult3 = calc.isDepartmentNumberValid(30);
        boolean validResult4 = calc.isDepartmentNumberValid(100);
        boolean validResult5 = calc.isDepartmentNumberValid(990);


        //Assert
        assertEquals(expectedInvalid, invalidResult1);
        assertEquals(expectedInvalid, invalidResult2);
        assertEquals(expectedInvalid, invalidResult3);
        assertEquals(expectedInvalid, invalidResult4);
        assertEquals(expectedInvalid, invalidResult5);
        assertEquals(expectedValid, validResult1);
        assertEquals(expectedValid, validResult2);
        assertEquals(expectedValid, validResult3);
        assertEquals(expectedValid, validResult4);
        assertEquals(expectedValid, validResult5);
    }
}