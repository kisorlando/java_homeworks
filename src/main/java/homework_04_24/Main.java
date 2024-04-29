/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package homework_04_24;

/**
 *
 * @author Orlando
 */
public class Main {

    public static void main(String[] args) {

        KoEsFestek haloSzoba = new KoEsFestek(4.4, 5.3, 2.7);
        System.out.println("1. szoba alapterülete: "
                + haloSzoba.alapterulet() + "m2");
        System.out.println("1. szoba fal és mennyezet felülete: "
                + haloSzoba.falEsMennyezet() + "m2");
        System.out.println("1. szoba burkolásához: "
                + haloSzoba.szuksegesKo() + " m2 burkolat szükséges.");
        System.out.println("1. szoba festéséhez: "
                + haloSzoba.szuksegesFestek() + " l festék szükséges.");
        System.out.println("-----------------------------------------");

        KoEsFestek furdoSzoba = new KoEsFestek(2, 3.6, 2.7);
        System.out.println("2. szoba alapterülete: "
                + furdoSzoba.alapterulet() + "m2");
        System.out.println("2. szoba fal és mennyezet felülete: "
                + furdoSzoba.falEsMennyezet() + "m2");
        System.out.println("2. szoba burkolásához: "
                + furdoSzoba.szuksegesKo() + " m2 burkolat szükséges.");
        System.out.println("2. szoba festéséhez: "
                + furdoSzoba.szuksegesFestek() + " l festék szükséges.");
        System.out.println("-----------------------------------------");

        KoEsFestek folyoso = new KoEsFestek(3.2, 8.5, 2.7);
        System.out.println("3. szoba alapterülete: "
                + folyoso.alapterulet() + "m2");
        System.out.println("3. szoba fal és mennyezet felülete: "
                + folyoso.falEsMennyezet() + "m2");
        System.out.println("3. szoba burkolásához: "
                + folyoso.szuksegesKo() + " m2 burkolat szükséges.");
        System.out.println("3. szoba festéséhez: "
                + folyoso.szuksegesFestek() + " l festék szükséges.");
        System.out.println("-----------------------------------------");

        
         Munkavallalo melos = new Munkavallalo("Kis János", 4, 23);
        System.out.println(melos.megKivehetoSzabadsag(7));
        System.out.println("-----------------------------------------");
          
       
        AdatokBekerese ferfi = new AdatokBekerese("Kis Jenő", 183, 50);
        AdatokBekerese no = new AdatokBekerese ("Nagy Piroska", 178, 45);
        Osszeilloseg valami = new Osszeilloseg("",0,0);
        System.out.println(valami.osszeillenekVagyNem(ferfi, no));
        
        
        
        
    }
    
    
     
         
    
    
    
}
