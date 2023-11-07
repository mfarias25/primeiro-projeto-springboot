package br.com.mfarias25.ioc_di;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

// @Component ou @Service
@Service
public class MeuComponent {

    public String chamarMeuComponent() {
        return "ChamMeuComponent";
    }
}
