/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package homework_04_24;

/**
 *
 * @author Orlando
 */
public class KoEsFestek extends Epulet {

    public KoEsFestek(double szelesseg, double hosszusag, double belmagassag) {
        super(szelesseg, hosszusag, belmagassag);
    }

    public double szuksegesKo() {

        double koMennyiseg = 1.3 * super.alapterulet();
        return koMennyiseg;

    }

    public double szuksegesFestek() {

        double festekMennyiseg = 0.4 * super.falEsMennyezet();
        return festekMennyiseg;

    }

}
