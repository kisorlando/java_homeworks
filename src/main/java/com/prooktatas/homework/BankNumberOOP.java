/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.prooktatas.homework;

/**
 *
 * @author Orlando
 */
public class BankNumberOOP extends CheckNumberOOP{
    
   
    
     public static boolean checkBankAccountNumber(String bankAccount) {
     int[] number = {9,7,3,1};
       int   sum1   = 0;
       int   sum2   = 0;
       int   check1 = 0;
       int   check2 = 0;
     if(bankAccount.length() == 16 || bankAccount.length() == 24){
           //Első 7 szamjegy
           for (int i = 0; i < 7; i++) {
               sum1 += Integer.parseInt(bankAccount.substring(i, i+1))*number[i%4];
           }
           //sum1 ellenőrzése
           check1 = sum1 % 10 == 0 ? 0 : 10-(sum1 % 10);
           /*
           if(sum1 % 10 == 0) {
               check1 = 0;
           } else {
               check1 = 10-(sum1 % 10);
           }
           */
           if(check1 != Integer.parseInt(bankAccount.substring(7, 8))){
               return false;
           }
           if(bankAccount.length() == 16){
                for (int i = 9; i < 15; i++) {
                    sum2 += Integer.parseInt(bankAccount.substring(i, i+1))*number[i%4];
                }
           }
           
           if(bankAccount.length() == 24){
                for (int i = 9; i < 23; i++) {
                    sum2 += Integer.parseInt(bankAccount.substring(i, i+1))*number[i%4];
                }
           }
           //sum2 ellenőrzése
           check2 = sum2 % 10 == 0 ? 0 : 10-(sum2 % 10);
           if(check2 == Integer.parseInt(bankAccount.substring(bankAccount.length()-1))
                   ){
               return true;
           }
       }
       return false;
    }
       public void ellenorzes (){
    System.out.println(BankNumberOOP.checkBankAccountNumber("057667554-76584932-45768796"));
} 
}

    
    
    
    
    
    
    
