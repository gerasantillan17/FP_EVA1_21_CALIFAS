/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication25;

import java.util.Scanner;

/**
 *
 * @author gerar
 */
public class JavaApplication25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int calif;
        Scanner captu = new Scanner (System.in);
        System.out.println("Calificacion(0-100)");
        calif = captu.nextInt();
        
        if(calif >=90 && calif <=100){
            System.out.println("A");
        }else if(calif >=80 && calif <=89){
            System.out.println("B");
        } else if(calif >=70 && calif <=79){
            System.out.println("C");
        } else if(calif >=60 && calif <=69){
            System.out.println("D");
        } else if(calif <=59){
            System.out.println("F");
        }
    }
    
}
