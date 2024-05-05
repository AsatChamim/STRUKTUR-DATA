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
public class aray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //cara deklarasi array
        int arry[] = new int[5];
        arry[0] = 100;
        arry[1] = 200;
        arry[2] = 300;
        arry[3] = 400;
        arry[4] = 500;
        int[] arr = {100, 200, 300, 400, 500};
        //untuk menampilkan semua array
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        //nilai minmum
        int minimum = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        //nilai maksimum
        int max = arr[0];
        for (int i = max; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        //rata rata nilai
        double total = 0;
        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
        }

        double average = total / arr.length;
        System.out.println("Nilai Rata-rata = " + average);
        System.out.println("Nilai maximum   = " + max);
        System.out.println("Nilai minimum   = " + min);

    }

}
