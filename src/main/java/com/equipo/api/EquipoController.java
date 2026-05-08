package com.equipo.api;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/equipo")
public class EquipoController {

    // Endpoint base — no modificar
    @GetMapping
    public List<String> integrantes() {
        return List.of("Equipo listo. Cada integrante agrega su endpoint abajo.");
    }

    @GetMapping("Steven")
    public String saludo() {
        return "Hola, soy Steven y este es mi endpoint.";
    }

    @GetMapping("Yeion-Carmona")
    public String saludo2() {
        return "Hola, soy Yeison-Carmona y este es mi endpoint.";
    }
    @GetMapping("/Juan-Esteban-Rodriguez")
    public String saludo3() {
        return "Hola, soy Juan-Esteban-Rodriguez y este es mi endpoint.";
    }

}



