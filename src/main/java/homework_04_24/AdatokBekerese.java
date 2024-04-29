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
public class AdatokBekerese extends Szemely {

    public AdatokBekerese(String nev, int magassag, int eletkor) {
        super(nev, magassag, eletkor);

    }

    public String setNev() {
        Pattern pattern = Pattern.compile("^[A-Z&a-z]{1,} [A-Z&a-z]{1,}");
        Matcher matcher = pattern.matcher(this.nev);
        if (matcher.find()) {
            return super.nev;
        } else {return null;
        }
        

    }

    public int setEletkor() {
        if (this.eletkor < 18) {
            System.out.println("Te még fiatal vagy a társkeresőhöz.");
        } else if (this.eletkor > 99) {
            System.out.println("Ön sajnos már túl öreg a társkereséshez.");
        } else {
            return super.eletkor;
        }
        return 0;
       

    }

    public int setMagassag() {
        return super.magassag;
    }

}
