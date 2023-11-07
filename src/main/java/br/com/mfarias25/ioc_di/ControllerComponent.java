package br.com.mfarias25.ioc_di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/components")
public class ControllerComponent {

    @Autowired
    MeuComponent meuComponent;
    @GetMapping("/")
    public String chamandoComponent(){
        var resultado = meuComponent.chamarMeuComponent();
        return resultado;
    }
}
