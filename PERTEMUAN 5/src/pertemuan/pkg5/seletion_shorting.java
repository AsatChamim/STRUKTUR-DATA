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
public class seletion_shorting {

    public static void sort(int[] data) {

        for (int i = 0; i < data.length - 1; i++) {
            int minIndex = i; // Indeks elemen minimum saat ini60, 30, 20, 10, 40, 70, 90
            for (int j = i + 1; j < data.length; j++) {
                if (data[j] < data[minIndex]) {
                    minIndex = j; // Perbarui data
                }
            }
            // menukar elemen i sesuai urutan
            if (minIndex != i) {
                int temp = data[i];
                data[i] = data[minIndex];
                data[minIndex] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] data = {60, 30, 20, 10, 40, 70, 90};

        System.out.println("Original data:");
        for (int element : data) {
            System.out.print(element + " ");
        }

        sort(data);  // untuk mengurutkan

        System.out.println("\nSorted data:");
        for (int element : data) {
            System.out.print(element + " ");
        }
    }
}
