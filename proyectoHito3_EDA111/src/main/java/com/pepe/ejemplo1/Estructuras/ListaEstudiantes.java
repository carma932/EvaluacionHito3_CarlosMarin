package com.pepe.ejemplo1.Estructuras;

import com.pepe.ejemplo1.Modelos.Estudiante;
import java.util.ArrayList;
import java.util.List;

public class ListaEstudiantes {

    private Nodo cabeza;
    private int tamanio;

    public ListaEstudiantes() {
        this.cabeza = null;
        this.tamanio = 0;
    }

    public void insertar(Estudiante estudiante) {
        Nodo nuevo = new Nodo(estudiante);
        if (cabeza == null) {
            cabeza = nuevo;
        } else {
            Nodo actual = cabeza;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevo;
        }
        tamanio++;
    }

    public List<Estudiante> mostrarTodos() {
        List<Estudiante> resultado = new ArrayList<>();
        Nodo actual = cabeza;
        while (actual != null) {
            resultado.add(actual.estudiante);
            actual = actual.siguiente;
        }
        return resultado;
    }

    public List<Estudiante> ordenarAprobadosPorPuntaje() {

        List<Estudiante> aprobados = new ArrayList<>();
        Nodo actual = cabeza;
        while (actual != null) {
            if (actual.estudiante.getPuntaje() >= 51) {
                aprobados.add(actual.estudiante);
            }
            actual = actual.siguiente;
        }

        int n = aprobados.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (aprobados.get(j).getPuntaje() < aprobados.get(j + 1).getPuntaje()) {
                    Estudiante temp = aprobados.get(j);
                    aprobados.set(j, aprobados.get(j + 1));
                    aprobados.set(j + 1, temp);
                }
            }
        }
        return aprobados;
    }

    public Estudiante buscarPorNombre(String nombre) {
        Nodo actual = cabeza;
        while (actual != null) {
            if (actual.estudiante.getNombre().equalsIgnoreCase(nombre)) {
                return actual.estudiante;
            }
            actual = actual.siguiente;
        }
        return null;
    }

    public int getTamanio() {
        return tamanio;
    }
}
