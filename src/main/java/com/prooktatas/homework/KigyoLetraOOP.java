/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.prooktatas.homework;

import java.util.Random;

/**
 *
 * @author Orlando
 */
public class KigyoLetraOOP {

    public int aktualPozicio = 1;
    public int dobasokSzama = 0;
    public int[] kigyokLetrak = new int[100];
    public Random random = new Random();

    public KigyoLetraOOP() {

        this.kigyokLetrak[4] = 14;
        this.kigyokLetrak[9] = 31;
        this.kigyokLetrak[20] = 37;
        this.kigyokLetrak[49] = 11;
        
        }
     public int jatek(){
         
         
         
        while (this.aktualPozicio < 100) {
            this.aktualPozicio += random.nextInt(6) + 1;
            if (this.aktualPozicio < 100 && this.kigyokLetrak[aktualPozicio] > 0) {
                this.aktualPozicio = this.kigyokLetrak[aktualPozicio];
            }
            this.dobasokSzama++;
            //System.out.println(kigyokLetrak [aktualPozicio]);
            // Arrays.binarySearch(kigyokLetrak, aktualPozicio);

        }
        return this.dobasokSzama;
    }

    public int dobasokSzama() {
        return this.dobasokSzama;

    }

    public static void kiir() {
        System.out.println("Tesztvalami");
    }
}
