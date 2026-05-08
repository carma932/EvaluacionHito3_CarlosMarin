package com.pepe.ejemplo1.Controladores;

import com.pepe.ejemplo1.Servicios.AulaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v2/aula")
public class AulaController {

    @Autowired
    private AulaService aulaService;

    @GetMapping
    public String mostrarAula() {
        return aulaService.mostrarMatriz();
    }

    @GetMapping("/ocupar/{fila}/{columna}")
    public String ocupar(
            @PathVariable int fila,
            @PathVariable int columna) {

        return aulaService.ocuparAsiento(fila, columna);
    }

    @GetMapping("/liberar/{fila}/{columna}")
    public String liberar(
            @PathVariable int fila,
            @PathVariable int columna) {

        return aulaService.liberarAsiento(fila, columna);
    }

    @GetMapping("/ocupados")
    public String ocupados() {
        return "Ocupados: " + aulaService.contarOcupados()
                + " | Libres: " + aulaService.contarLibres()
                + " | Total: " + (aulaService.getFilas() * aulaService.getColumnas());
    }
}