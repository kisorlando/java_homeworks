/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package homework_04_24;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**                                           
 *
 * @author Orlando
 */
public class Feladat01 {

    public static void main(String[] args) {
        System.out.println(mennyiAzAnnyi("ah", "ahahahkekeahahak"));
    }

    public static int mennyiAzAnnyi(String szoveg1, String szoveg2) {
        int eredmeny = 0;

        if (szoveg1.length() >= szoveg2.length()) {
            Pattern pattern = Pattern.compile(szoveg2);
            Matcher matcher = pattern.matcher(szoveg1);
            while (matcher.find()) {
                eredmeny = eredmeny + 1;
                /*  System.out.println(matcher.group());
            System.out.println("-----------------");
            System.out.println(eredmeny); */
            }

        } else {
            Pattern pattern = Pattern.compile(szoveg1);
            Matcher matcher = pattern.matcher(szoveg2);
            while (matcher.find()) {
                eredmeny = eredmeny + 1;
            }
        }

        return eredmeny;
    }

}
