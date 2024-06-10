/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package homework_06_09;

import java.util.ArrayList;

/**
 *
 * @author Orlando
 */
public class DivLists {
     private String Szoveg;

    public String getSzoveg() {
        return Szoveg;
    }

    public void setSzoveg(String Szoveg) {
        this.Szoveg = Szoveg;
    }
     private ArrayList<Span> spans = new ArrayList<>();

    public ArrayList<Span> getSpans() {
        return spans;
    }

    public void setSpans(ArrayList<Span> spans) {
        this.spans = spans;
    }
    
     public void addSpan (Span spans) {
        this.spans.add(spans);
    }
    

       public Span getSpan(int index){
        return this.spans.get(index);
    }

   
    
}

