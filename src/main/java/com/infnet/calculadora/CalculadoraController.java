package com.infnet.calculadora;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculadora")
public class CalculadoraController {

    @GetMapping("/soma")
    public int soma(@RequestParam int a, @RequestParam int b ) {
        return a + b;
    }

    @GetMapping("/subtracao")
    public int subtracao(@RequestParam int a, @RequestParam int b ) {
        return a + b;
    }

    @GetMapping("/multiplicacao")
    public int multiplicacao(@RequestParam int a, @RequestParam int b ) {
        return a + b;
    }

    @GetMapping("/divisao")
    public int divisao(@RequestParam int a, @RequestParam int b ) {
        return a + b;
    }

}
