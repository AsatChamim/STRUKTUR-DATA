/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts_asatchamim;

import java.util.*;

/**
 *
 * @author lenovo
 */
public class NO6 {

    /**
     * @param args the command line arguments
     */
    //untuk mentranspose matriks
    public static void main(String[] args) {
        Scanner mat = new Scanner(System.in);

        System.out.println("Masukkan matriks 3x3 (di pisah '.'): ");
        int[][] matrix = new int[3][3];

        for (int i = 0; i < 3; i++) {
            String input = mat.nextLine();
            String[] row = input.split("\\.");
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = Integer.parseInt(row[j]);
            }
        }
        mat.close();

        System.out.println("Sebelum di-transposisi:");
        gambarMatrix(matrix);

        int[][] transposedMatrix = transposeMatrix(matrix);

        System.out.println("Setelah di-transposisi:");
        gambarMatrix(transposedMatrix);

    }

    public static int[][] transposeMatrix(int[][] matrix) {
        int[][] transposedMatrix = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                transposedMatrix[j][i] = matrix[i][j];
            }
        }
        return transposedMatrix;
    }

    public static void gambarMatrix(int[][] matrix) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }

}
