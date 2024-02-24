/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete6;

public class Matrix {

    public static void main(String[] args) {
        int nfilas, ncols;     // filas y columnas de la matriz
        do {
            System.out.print("Número de filas de la matriz:    ");
            nfilas = Leer.datoInt();
        } while (nfilas < 1);    // no permitir un valor negativo
        do {
            System.out.print("Número de columnas de la matriz: ");
            ncols = Leer.datoInt();
        } while (ncols < 1);     // no permitir un valor negativo

        float[][] m = new float[nfilas][ncols]; // crear la matriz m
        int fila = 0, col = 0; // subíndices
        float sumafila = 0;    // suma de los elementos de una fila

        System.out.println("Introducir los valores de la matriz.");
        for (fila = 0; fila < nfilas; fila++) {
            for (col = 0; col < ncols; col++) {
                System.out.print("m[" + fila + "][" + col + "] = ");
                m[fila][col] = Leer.datoFloat();
            }
        }

        // Visualizar la suma de cada fila de la matriz
        System.out.println();

        for (fila = 0; fila < nfilas; fila++) {
            for (col = 0; col < ncols; col++) {
                System.out.print(m[fila][col] + "\t\t");
            }

            System.out.println("");
        }

        for (fila = 0; fila < nfilas; fila++) {
            sumafila = 0;
            for (col = 0; col < ncols; col++) {
                sumafila += m[fila][col];
            }
            System.out.println("Suma de la fila " + fila + ": " + sumafila);
        }
        System.out.println("\nFin del proceso.");
    }
}
