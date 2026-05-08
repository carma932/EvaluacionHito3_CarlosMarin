package com.pepe.ejemplo1.Estructuras;

import com.pepe.ejemplo1.Modelos.Estudiante;

public class Nodo {
    public Estudiante estudiante;
    public Nodo siguiente;

    public Nodo(Estudiante estudiante) {
        this.estudiante = estudiante;
        this.siguiente = null;
    }
}
