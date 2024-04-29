/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package homework_04_24;

/**
 *
 * @author Orlando
 */
public class Osszeilloseg extends AdatokBekerese {

    public Osszeilloseg(String nev, int magassag, int eletkor) {
        super(nev, magassag, eletkor);
    }

    

   

    public int egyKorosztaly(AdatokBekerese ferfi, AdatokBekerese no) {
        if (ferfi.setEletkor() - no.setEletkor() < 15
                & no.setEletkor() - ferfi.setEletkor() < 15) {

            return 1;

        } else {
            return 0;
        }

    }

    public int egyMagassag(AdatokBekerese ferfi, AdatokBekerese no) {
        if (ferfi.setMagassag() - no.setMagassag() < 25
                & no.getMagassag() - ferfi.getMagassag() < 5) {

            return 1;
        } else {
            return 0;
        }

    }

    public String osszeillenekVagyNem(AdatokBekerese ferfi , AdatokBekerese no) {
        
        if (ferfi.setNev() == null  |  no.setNev() == null ){
            System.out.println("Nem adtad meg a neved, az összeillőség így maxinum 50%.");
        } else
        {if (egyMagassag(ferfi, no) == 1 & egyKorosztaly(ferfi, no) == 1) {
            System.out.println("Gratulálunk nagyon összeilletek, 120% az esélyetek.");
        } else if (egyKorosztaly(ferfi, no) == 1 & egyMagassag(ferfi, no) == 0) {
            System.out.println("Az esélyetek 75%, hajrá!");
        } else if (egyKorosztaly(ferfi, no) == 0 & egyMagassag(ferfi, no) == 1) {
            System.out.println("Az esélyetek 55%, egy próbát megérhet!");
        } else {
            System.out.println("Sajnos nincs sok esélyetek, keress inkább mást!");

        }
        return "Köszönjük hogy minket választottál! :)";
        
        }
        return "Köszönjük hogy minket választottál! :)";
         
      
    
    
}
}

