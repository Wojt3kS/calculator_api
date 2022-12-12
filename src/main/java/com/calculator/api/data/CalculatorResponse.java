package com.calculator.api.data;

import java.util.Objects;

public class CalculatorResponse {

    private double value;

    public CalculatorResponse(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CalculatorResponse)) return false;
        CalculatorResponse that = (CalculatorResponse) o;
        return Double.compare(that.getValue(), getValue()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getValue());
    }
}
