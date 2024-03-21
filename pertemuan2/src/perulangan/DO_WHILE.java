/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perulangan;

/**
 *
 * @author lenovo
 */
public class DO_WHILE {
    // PENGOPRASIAN PERULANGAN
    public static void main(String[] args) {
        int angka = 1;

        do {
            System.out.println("Nilai : " + angka);
            angka++;
        } while (angka <= 5);
    }
}