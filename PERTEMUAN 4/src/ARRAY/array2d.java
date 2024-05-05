/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ARRAY;

/**
 *
 * @author lenovo
 */
public class array2d {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //cara deklarasi array multi dimensi
        // Cara pertama
        System.out.println("Cara Pertamana = ");
        int[][] arr = new int[2][2];

        arr[0][0] = 100;
        arr[0][1] = 200;
        arr[1][0] = 300;
        arr[1][1] = 400;

        System.out.println("Variabel arr: ");

        System.out.println(arr[0][0] + " " + arr[0][1]);
        System.out.println(arr[1][0] + " " + arr[1][1]);

        System.out.println("");

        // cara kedua
        System.out.println("Cara Kedua");
        String arr2[][] = {{"100", "200"}, {"300", "400"}};

        System.out.println(arr2[0][0]);
        System.out.println(arr2[0][1]);
        System.out.println(arr2[1][0]);
        System.out.println(arr2[1][1]);

        System.out.println("");

        // cara ketiga
        System.out.println("Cara Ketiga");
        String arr3[][] = {{"100", "200"}, {"300", "400"}};

        for (int k = 0; k < arr3.length; k++) {
            for (int b = 0; b < arr3.length; b++) {
                System.out.println(arr3[k][b]);
            }
        }
    }
}
