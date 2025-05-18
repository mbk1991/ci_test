package com.mabb.tistory.mbk1991.calculator;

import org.springframework.stereotype.Service;

@Service
public class Calculator {

    private static final String TEST = "wrong constant";

    public int plus(int v1, int v2) {
        return v1 + v2;
    }

    public int minus(int v1, int v2) {
        return v1 - v2;
    }

    public int product(int v1, int v2) {
        return v1 * v2;
    }

    public int devide(int v1, int v2) {
        return v1 / v2;
    }

    public int mod(int v1, int v2) {
        return v1 % v2;
    }

}
