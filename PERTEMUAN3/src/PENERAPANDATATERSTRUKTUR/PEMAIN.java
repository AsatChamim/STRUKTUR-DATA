/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PENERAPANDATATERSTRUKTUR;

/**
 *
 * @author lenovo
 */
public class PEMAIN {
    int kecepatan;
    String nama;
    int healthpoin;

    void run() {
        System.out.println(nama + " is Running ...");
        System.out.println("Kecepatan = " + kecepatan);
    }

    boolean isDead() 
    {
        if(healthpoin <=0)return true;
        return false;
    }
}
