/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package homework_07_29;

/**
 *
 * @author Orlando
 */
public class MainClass {
    public static void main(String[] args) {
        
        TartomanyClass tartomany = new TartomanyClass();
        FeltetelClass feltetel = new FeltetelClass();
        SZUIMHAFuggveny szum = new SZUIMHAFuggveny();
        int eredmeny = SZUIMHAFuggveny.SZUMHAFuggveny
            (tartomany.getTartomany(), feltetel.getFeltetel());
        
        System.out.println("A keresett összeg: " +eredmeny);
    }
}  
