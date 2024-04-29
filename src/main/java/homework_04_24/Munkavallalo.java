/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package homework_04_24;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Orlando
 */
public class Munkavallalo {
    String nev;
    int fizetesiKategoria;
    int evesSzabadsag;
    int eddigKivettSzabadsag;

    public Munkavallalo(String nev, int fizetesiKategoria) {
        this.nev = nev;
        this.fizetesiKategoria = fizetesiKategoria;
    }

    public Munkavallalo(String nev, int fizetesiKategoria, int evesSzabadsag) {
        this.nev = nev;
        this.fizetesiKategoria = fizetesiKategoria;
        this.evesSzabadsag = evesSzabadsag;
    }

    public boolean megKivehetoSzabadsag(int eddigKivettSzabadsag){
         Pattern pattern = Pattern.compile("^[A-Z&a-z]{1,} [A-Z&a-z]{1,}");
            Matcher matcher = pattern.matcher(this.nev);
        if (matcher.find() & 
                (this.fizetesiKategoria >=1 & this.fizetesiKategoria <= 5)){
        int maradekSzabadsag = this.evesSzabadsag - eddigKivettSzabadsag;
            System.out.println("A munkavállalónak: " 
                    + maradekSzabadsag + " nap szabadsága maradt.");
         } else {
            System.out.println("Ilyen munkavállaló nem létezik.");
        }
        return true;
        
    }
    
}
