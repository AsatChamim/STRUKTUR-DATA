/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan.pkg5;

/**
 *
 * @author lenovo
 */
public class insertsion_shorting {

    public static void sort(int[] data) {
        for (int i = 1; i < data.length; i++) {
            int key = data[i]; // Element masukan
            int j = i - 1;
// Untuk mengeser Elemen
            while (j >= 0 && data[j] > key) {
                data[j + 1] = data[j];
                j--;
            }

            // Masukkan elemen  pada posisi yang benar
            data[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] data = {60, 30, 20, 10, 40, 70, 90};

        System.out.println("Original data:");
        for (int element : data) {
            System.out.print(element + " ");
        }

        sort(data);  // Urutkan array

        System.out.println("\nSorted data:");
        for (int element : data) {
            System.out.print(element + " ");
        }
    }
}
