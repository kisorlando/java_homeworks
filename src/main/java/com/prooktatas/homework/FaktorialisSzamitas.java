/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.prooktatas.homework;

/**
 *
 * @author Orlando
 */
public class FaktorialisSzamitas {

    public static void main(String[] args) {
        int beadottSzam = 7;
        int faktorialis = 1;
        int i;
        for (i = 1; i <= beadottSzam; i++) {
            faktorialis = faktorialis * i;
        }
        System.out.println(beadottSzam + " faktorialisa " + faktorialis);
    }
}
