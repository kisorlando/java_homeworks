/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.prooktatas.homework;

/**
 *
 * @author Orlando
 */
public class TajNumberOOP extends CheckNumberOOP {

  /*  public static void main(String[] args) {
        System.out.println(TajNumberOOP.isTajszam("057667554"));

    } */

    
    public static boolean isTajszam(String tajszam) {
        char[] szamokTomb = tajszam.toCharArray();
        int osszeg = 0;

        for (int i = 0; i < szamokTomb.length - 1; i++) {
            int szam = Integer.parseInt(String.valueOf(szamokTomb[i]));

            if (i % 2 == 0) {
                osszeg += szam * 7;
            } else {
                osszeg += szam * 3;
            }

        }
        int ellenorzoSzam = osszeg % 10;
        System.out.println(ellenorzoSzam);
        if (ellenorzoSzam
                == Integer.parseInt(String.valueOf(szamokTomb[8]))) {

            return true;

        }
        return false;

    }
 public  void ellenorzes() {
        System.out.println(TajNumberOOP.isTajszam("057667555")); 
    }
}