package com.pepe.ejemplo1.Servicios;

import org.springframework.stereotype.Service;

@Service
public class AulaService {

    private int[][] aula = new int[5][15];

    public AulaService() {
        for (int fila = 0; fila < 5; fila++) {
            for (int columna = 0; columna < 15; columna++) {
                aula[fila][columna] = 1;
            }
        }

        aula[0][0] = 0;
        aula[0][1] = 0;
        aula[1][2] = 0;
        aula[2][5] = 0;
    }

    public int[][] obtenerMatriz() {
        return aula;
    }

    public String mostrarMatriz() {
        String texto = "";

        for (int fila = 0; fila < 5; fila++) {
            for (int columna = 0; columna < 15; columna++) {
                texto += aula[fila][columna] + " ";
            }
            texto += "\n";
        }

        return texto;
    }

    public String ocuparAsiento(int fila, int columna) {
        if (fila < 0 || fila >= 5 || columna < 0 || columna >= 15) {
            return "Posicion invalida";
        }

        if (aula[fila][columna] == 0) {
            return "El asiento ya esta ocupado";
        }

        aula[fila][columna] = 0;
        return "Asiento ocupado";
    }

    public String liberarAsiento(int fila, int columna) {
        if (fila < 0 || fila >= 5 || columna < 0 || columna >= 15) {
            return "Posicion invalida";
        }

        if (aula[fila][columna] == 1) {
            return "El asiento ya esta libre";
        }

        aula[fila][columna] = 1;
        return "Asiento liberado";
    }

    public int contarOcupados() {
        int contador = 0;

        for (int fila = 0; fila < 5; fila++) {
            for (int columna = 0; columna < 15; columna++) {
                if (aula[fila][columna] == 0) {
                    contador++;
                }
            }
        }

        return contador;
    }

    public int contarLibres() {
        int contador = 0;

        for (int fila = 0; fila < 5; fila++) {
            for (int columna = 0; columna < 15; columna++) {
                if (aula[fila][columna] == 1) {
                    contador++;
                }
            }
        }

        return contador;
    }

    public int getFilas() {
        return 5;
    }

    public int getColumnas() {
        return 15;
    }
}