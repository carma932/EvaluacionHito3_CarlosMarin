package com.pepe.ejemplo1.Controladores;

import com.pepe.ejemplo1.Modelos.Estudiante;
import com.pepe.ejemplo1.Servicios.EstudiantesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v3/estudiantes")
public class EstudiantesController {

    @Autowired
    private EstudiantesService estudiantesService;

    @GetMapping("/agregar")
    public String agregarEstudiante(
            @RequestParam(defaultValue = "0") int id,
            @RequestParam(defaultValue = "SinNombre") String nombre,
            @RequestParam(defaultValue = "0") double puntaje) {

        return estudiantesService.agregarEstudiante(id, nombre, puntaje);
    }

    @GetMapping
    public List<Estudiante> mostrarEstudiantes() {
        return estudiantesService.mostrarEstudiantes();
    }

    @GetMapping("/ordenados")
    public List<Estudiante> mostrarOrdenados() {
        return estudiantesService.mostrarOrdenados();
    }

    @GetMapping("/buscar/{nombre}")
    public Object buscarEstudiante(@PathVariable String nombre) {
        Estudiante e = estudiantesService.buscarPorNombre(nombre);

        if (e == null) {
            return "Estudiante '" + nombre + "' no encontrado.";
        }

        return e;
    }
}