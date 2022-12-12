package com.calculator.api.controller;

import com.calculator.api.data.CalculatorResponse;
import com.calculator.api.service.CalculatorService;
import org.junit.jupiter.api.Test;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorControllerTest {

    private final CalculatorService service = new CalculatorService();
    private final CalculatorController controller = new CalculatorController(service);

    @Test
    void add() {
        ResponseEntity<CalculatorResponse> expectedResult = ResponseEntity.ok().body(new CalculatorResponse(17.0));
        ResponseEntity<CalculatorResponse> result = controller.add(9, 8);
        assertEquals(expectedResult, result);
    }

    @Test
    void divide() {
        ResponseEntity<CalculatorResponse> expectedResult = ResponseEntity.ok().body(new CalculatorResponse(2.0));
        ResponseEntity<CalculatorResponse> result = controller.divide(10, 5);
        assertEquals(expectedResult, result);
    }

    @Test
    void divideByZero() {
        ResponseEntity<CalculatorResponse> expectedResult = ResponseEntity.ok().body(new CalculatorResponse(Double.POSITIVE_INFINITY));
        ResponseEntity<CalculatorResponse> result = controller.divide(10, 0);
        assertEquals(expectedResult, result);
    }



}