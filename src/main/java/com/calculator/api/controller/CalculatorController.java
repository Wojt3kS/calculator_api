package com.calculator.api.controller;

import com.calculator.api.data.CalculatorResponse;
import com.calculator.api.service.CalculatorService;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {

    private final CalculatorService service;

    public CalculatorController(CalculatorService service) {
        this.service = service;
    }

    @PostMapping(path = "/add", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<CalculatorResponse> add(@RequestParam double val1, @RequestParam double val2) {
        return ResponseEntity.ok().body(service.add(val1, val2));
    }

    @GetMapping(path = "/div", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<CalculatorResponse> divide(@RequestParam double val1, @RequestParam double val2) {
        return ResponseEntity.ok().body(service.divide(val1, val2));
    }
}
