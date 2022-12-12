package com.calculator.api.service;

import com.calculator.api.data.CalculatorResponse;
import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

    public CalculatorResponse add(double val1, double val2) {
        return new CalculatorResponse(val1 + val2);
    }

    public CalculatorResponse divide(double val1, double val2) {
        return new CalculatorResponse(val1 / val2);
    }
}
