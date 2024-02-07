package com.luiscutilak.certification_nlw;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// tudo que estiver abaixo vai retornar via json.(REST)
@RestController
@RequestMapping("/primeiraController")
public class PrimeiraController {

    @GetMapping("/retornarPrimeiraController")
    public Usuario retornoPrimeiraController() {
        var usuario = new Usuario("Luis",  37);
         return usuario;
    }
    
    record Usuario(String nome, int idade) {
    }


}