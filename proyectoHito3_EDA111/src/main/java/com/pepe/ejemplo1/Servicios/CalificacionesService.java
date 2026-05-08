package com.pepe.ejemplo1.Servicios;

import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class CalificacionesService {

    private double[] notas = new double[110];
    private int cantidad = 0;

    public CalificacionesService() {
        notas[0] = 80;
        notas[1] = 45;
        notas[2] = 70;
        notas[3] = 92;
        notas[4] = 3;
        cantidad = 5;
    }

    public String agregarCalificacion(double nota) {
        if (cantidad == 110) {
            return "Ya no hay espacio";
        }

        notas[cantidad] = nota;
        cantidad++;

        return "Nota guardada: " + nota;
    }

    public List<Double> obtenerTodas() {
        List<Double> lista = new ArrayList<>();

        for (int i = 0; i < cantidad; i++) {
            lista.add(notas[i]);
        }

        return lista;
    }

    public List<Double> obtenerAprobados() {
        List<Double> lista = new ArrayList<>();

        for (int i = 0; i < cantidad; i++) {
            if (notas[i] >= 51) {
                lista.add(notas[i]);
            }
        }

        return lista;
    }

    public double calcularPromedio() {
        if (cantidad == 0) {
            return 0;
        }

        double suma = 0;

        for (int i = 0; i < cantidad; i++) {
            suma += notas[i];
        }

        return suma / cantidad;
    }

    public double obtenerMax() {
        if (cantidad == 0) {
            return -1;
        }

        double mayor = notas[0];

        for (int i = 1; i < cantidad; i++) {
            if (notas[i] > mayor) {
                mayor = notas[i];
            }
        }

        return mayor;
    }

    public double obtenerMin() {
        if (cantidad == 0) {
            return -1;
        }

        double menor = notas[0];

        for (int i = 1; i < cantidad; i++) {
            if (notas[i] < menor) {
                menor = notas[i];
            }
        }

        return menor;
    }

    public List<Double> obtenerMayoresDeDiez() {
        List<Double> lista = new ArrayList<>();

        for (int i = 0; i < cantidad; i++) {
            if (notas[i] > 10) {
                lista.add(notas[i]);
            }
        }

        return lista;
    }

    public List<Double> obtenerMenoresDeCinco() {
        List<Double> lista = new ArrayList<>();

        for (int i = 0; i < cantidad; i++) {
            if (notas[i] < 5) {
                lista.add(notas[i]);
            }
        }

        return lista;
    }
}   