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
public class NO5 {

    /**
     * @param args the command line arguments
     */
    // TO menentukan matriks identitas
    public static void main(String[] args) {
       Scanner mat = new Scanner(System.in);
        
        System.out.println("Masukkan matriks 3x3 (di pisah '.'): ");
        int[][] matrix = new int[3][3];
        
        for (int x = 0; x < 3; x++) {
            String input = mat.nextLine();
            String [] row = input.split("\\.");
            for (int y = 0; y < 3; y++) {
                matrix[x][y] = Integer.parseInt(row[y]);
            }
        }
        mat.close();
		if (cekMatrix(matrix)) {
			System.out.println("Matriks ini adalah matriks identitas.");
		} else {
			System.out.println("Matriks ini bukan matriks identitas.");
	        }
	    }

	    public static boolean cekMatrix(int[][] matrix) {
	        if (matrix.length != 3 || matrix[0].length != 3) {
	            return false;
	        }

	        for (int a = 0; a < matrix.length; a++) {
	            for (int z = 0; z < matrix[a].length; z++) {
	                if ((a == z && matrix[a][z] != 1) || (a != z && matrix[a][z] != 0)) {
	                    return false;
	                }
	            }
	        }
	        return true;

	}

}
