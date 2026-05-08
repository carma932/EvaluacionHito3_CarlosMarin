package com.pepe.ejemplo1.Servicios;

import com.pepe.ejemplo1.Estructuras.ListaEstudiantes;
import com.pepe.ejemplo1.Modelos.Estudiante;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class EstudiantesService {

    private ListaEstudiantes lista = new ListaEstudiantes();

    public EstudiantesService() {
        lista.insertar(new Estudiante(1, "Ana", 95));
        lista.insertar(new Estudiante(2, "Juan", 42));
        lista.insertar(new Estudiante(3, "Maria", 88));
        lista.insertar(new Estudiante(4, "Luis", 73));
        lista.insertar(new Estudiante(5, "Pedro", 30));
    }

    public String agregarEstudiante(int id, String nombre, double puntaje) {
        if (puntaje < 0 || puntaje > 100) {
            return "Error: el puntaje debe estar entre 0 y 100.";
        }

        Estudiante e = new Estudiante(id, nombre, puntaje);
        lista.insertar(e);

        return "Estudiante '" + nombre + "' agregado con id=" + id + " y puntaje=" + puntaje;
    }

    public List<Estudiante> mostrarEstudiantes() {
        return lista.mostrarTodos();
    }

    public List<Estudiante> mostrarOrdenados() {
        return lista.ordenarAprobadosPorPuntaje();
    }

    public Estudiante buscarPorNombre(String nombre) {
        return lista.buscarPorNombre(nombre);
    }

    public int getTotalEstudiantes() {
        return lista.getTamanio();
    }
}