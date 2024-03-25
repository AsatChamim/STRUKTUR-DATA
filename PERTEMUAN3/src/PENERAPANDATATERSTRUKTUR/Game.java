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
public class Game {
    public static void main(String[]args){
        PEMAIN Petani= new PEMAIN();
        
        Petani.nama="ASAT";
        Petani.kecepatan= 80;
        Petani.healthpoin= 0;
        
        
        Petani.run();
        if(Petani.isDead())
        {
            System.out.println("GAME IS OVER !!!");
        }
    
        }
}

