package com.mabb.tistory.mbk1991.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorContoller {
    @Autowired
    Calculator calculator;

    @RequestMapping("/plus/{v1}/{v2}")
    String sum(@PathVariable String v1, @PathVariable String v2){
        return calculator.plus(Integer.parseInt(v1), Integer.parseInt(v2)) + "";
    }
}
