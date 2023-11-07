package br.com.mfarias25.controller.controller;


import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController //Definição de apiRest
@RequestMapping("/primeiraController") //Definição de recurso
public class PrimeiraController {
    @GetMapping("/primeiroMetodo/{id}")
    public String primeiroMetodo(@PathVariable String id) {
        return "O parametro é: " + id;
    }

    @GetMapping("/metodoComQueryParams")
    public String metodoComQueryParams(@RequestParam String id) {
        return "O parametro com metodoComQueryParams é: " + id;
    }

    @GetMapping("/metodoComQueryParams2")
    public String metodoComQueryParams2(@RequestParam Map<String, String>  allParams) {
        return "O parametro com metodoComQueryParams2 é: " + allParams.entrySet();
    }


    @PostMapping("/metodoComBodyParams")
    public String metodoComBodyParams(@RequestBody Usuario usuario) {
        return "metodoComBodyParams" + usuario.username;
    }

    record Usuario (String username) {

    }


}
