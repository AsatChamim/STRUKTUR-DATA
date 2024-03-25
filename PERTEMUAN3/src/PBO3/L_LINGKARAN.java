/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBO3;

/**
 *
 * @author lenovo
 */
public class L_LINGKARAN {

    public static void main(String[] args) {
        LINGKARAN LUAS = new LINGKARAN();

        LUAS.phi = 22/7;
        LUAS.jari2 = 14;

        LUAS.luas = LUAS.phi * (LUAS.jari2 * LUAS.jari2);

        System.out.println("Phi = " + LUAS.phi);
        System.out.println("Jari - Jari : " + LUAS.jari2);
        System.out.println(" Luas lingkaran :" + LUAS.luas);

    }

}
