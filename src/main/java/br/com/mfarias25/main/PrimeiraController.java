package br.com.mfarias25.main;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller //Definição de apiRest
@RequestMapping("/primeiraController") //Definição de recurso

public class PrimeiraController {

    @GetMapping("/primeiroMetodo")
    public String primeiroMetodo() {
        return "Primeiro Metodo Api-Rest";
    }
}
