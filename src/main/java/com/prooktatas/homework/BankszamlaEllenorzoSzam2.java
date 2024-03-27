/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.prooktatas.homework;

/**
 *
 * @author Orlando
 */
public class BankszamlaEllenorzoSzam2 {

    public static void main(String[] args) {
        System.out.println(BankszamlaEllenorzoSzam2.isBankszamlaSzam("10400559-86767782-72721019"));

    }

    public static boolean isBankszamlaSzam(String bankszamlaSzam) {
        bankszamlaSzam = bankszamlaSzam.replaceAll("[-]", "");
        System.out.println(bankszamlaSzam);
        char[] szamokTomb = bankszamlaSzam.toCharArray();

        int osszeg = 0;
        int osszeg2 = 0;
        int foOsszeg = 0;
        int foOsszeg2 = 0;
        for (int i = 0; i < szamokTomb.length - 17; i++) {
            int szam = Integer.parseInt(String.valueOf(szamokTomb[i]));
            if (szamokTomb[i] == szamokTomb[0]
                    || szamokTomb[i] == szamokTomb[4]) {
                osszeg = szam * 9;
            } else if (szamokTomb[i] == szamokTomb[1]
                    || szamokTomb[i] == szamokTomb[5]) {
                osszeg = szam * 7;
            } else if (szamokTomb[i] == szamokTomb[2]
                    || szamokTomb[i] == szamokTomb[6]) {
                osszeg = szam * 3;
            } else if (szamokTomb[i] == szamokTomb[3]) {
                osszeg = szam * 1;
            }

            foOsszeg = foOsszeg + osszeg;

        }

        for (int i = 8; i < szamokTomb.length - 1; i++) {
            int szam2 = Integer.parseInt(String.valueOf(szamokTomb[i]));
            if (szamokTomb[i] == szamokTomb[8]
                    || szamokTomb[i] == szamokTomb[12] || szamokTomb[i] == szamokTomb[16]
                    || szamokTomb[i] == szamokTomb[20]) {
                osszeg2 = szam2 * 9;
            } else if (szamokTomb[i] == szamokTomb[9]
                    || szamokTomb[i] == szamokTomb[13]
                    || szamokTomb[i] == szamokTomb[17]
                    || szamokTomb[i] == szamokTomb[21]) {
                osszeg2 = szam2 * 7;
            } else if (szamokTomb[i] == szamokTomb[10]
                    || szamokTomb[i] == szamokTomb[14]
                    || szamokTomb[i] == szamokTomb[18]
                    || szamokTomb[i] == szamokTomb[22]) {
                osszeg2 = szam2 * 3;
            } else if (szamokTomb[i] == szamokTomb[11] || szamokTomb[i] == szamokTomb[15]
                    || szamokTomb[i] == szamokTomb[19]) {
                osszeg2 = szam2 * 1;
            }
            foOsszeg2 = foOsszeg2 + osszeg2;

        }

        int ellenorzoSzam = 10 - (foOsszeg % 10);
        int ellenorzoSzam2 = 10 - (foOsszeg2 % 10);
        System.out.println(ellenorzoSzam);
        System.out.println(ellenorzoSzam2);
        if (ellenorzoSzam
                == Integer.parseInt(String.valueOf(szamokTomb[7]))
                && ellenorzoSzam2
                == Integer.parseInt(String.valueOf(szamokTomb[23]))) {

            return true;

        }
        return false;

    }
}
