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

    public int KigyoLetraOOP() {

        kigyokLetrak[4] = 14;
        kigyokLetrak[9] = 31;
        kigyokLetrak[20] = 37;
        kigyokLetrak[49] = 11;

        while (aktualPozicio < 100) {
            aktualPozicio += random.nextInt(6) + 1;
            if (aktualPozicio < 100 && kigyokLetrak[aktualPozicio] > 0) {
                aktualPozicio = kigyokLetrak[aktualPozicio];
            }
            dobasokSzama++;
            //System.out.println(kigyokLetrak [aktualPozicio]);
            // Arrays.binarySearch(kigyokLetrak, aktualPozicio);

        }
        return dobasokSzama;
    }

    public int dobasokSzama() {
        return this.dobasokSzama;

    }

    public static void kiir() {
        System.out.println("Tesztvalami");
    }
}
