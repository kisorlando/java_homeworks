/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package homework_04_24;

/**
 *
 * @author Orlando
 */
public class Epulet {

    double szelesseg;
    double hosszusag;
    double belmagassag;

    public Epulet(double szelesseg, double hosszusag, double belmagassag) {
        this.szelesseg = szelesseg;
        this.hosszusag = hosszusag;
        this.belmagassag = belmagassag;
    }

    public double alapterulet() {
        double alapterulet = this.szelesseg * this.hosszusag;

        return alapterulet;
    }

    public double falEsMennyezet() {
        double falTerulet = ((this.hosszusag * this.belmagassag) * 2)
                + ((this.szelesseg * this.belmagassag) * 2);
        double mennyezetTerulet = this.szelesseg * this.hosszusag;

        return falTerulet + mennyezetTerulet;
    }
}
