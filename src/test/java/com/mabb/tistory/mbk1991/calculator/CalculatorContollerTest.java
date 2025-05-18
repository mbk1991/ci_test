package com.mabb.tistory.mbk1991.calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorContollerTest {

    private Calculator calculator = new Calculator();

    @Test
    void plus테스트(){
        assertEquals(10, calculator.plus(3,7));
    }

    @Test
    void minus테스트(){
        assertEquals(3, calculator.minus(10,7));
    }

    @Test
    void product테스트(){
        assertEquals(21, calculator.product(3,7));
    }

    @Test
    void devide테스트(){
        assertEquals(2, calculator.devide(5,2));
    }

    @Test
    void mod테스트(){
        assertEquals(1, calculator.mod(7,3));
    }


}
