package com.pepe.ejemplo1.Controladores;

import com.pepe.ejemplo1.Servicios.CalificacionesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/notas")
public class NotasController {

    @Autowired
    private CalificacionesService servicio;

    @GetMapping("/agregar/{nota}")
    public String agregar(@PathVariable double nota) {
        return servicio.agregarCalificacion(nota);
    }

    @GetMapping
    public List<Double> mostrarTodas() {
        return servicio.obtenerTodas();
    }

    @GetMapping("/aprobados")
    public List<Double> mostrarAprobados() {
        return servicio.obtenerAprobados();
    }

    @GetMapping("/promedio")
    public String promedio() {
        return "Promedio: " + servicio.calcularPromedio();
    }

    @GetMapping("/max")
    public String max() {
        return "Nota maxima: " + servicio.obtenerMax();
    }

    @GetMapping("/min")
    public String min() {
        return "Nota minima: " + servicio.obtenerMin();
    }


}