/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lv.rigacoding.day5;

import java.util.Scanner;

/**
 *
 * @author oscar
 */
public class Loops {
    public static void cutN(){
         Scanner input = new Scanner(System.in);
        System.out.println("Ievadi skaitli N: ");
        
        int n = input.nextInt();
        if(n<=0){
            System.out.println("Ievadīta neatļauta vērtība = " );
            
        }
        else{
            // pirma darbiba ir ko mes apskatam
            // otra darbiba lidz kuram izpildam ciklu 
            // tresa darbiba ir matematiska darbiba
           for(int i = n; i >= 1; i--){
            
            
            
            System.out.print(i);
       
        
        }  
        }
       
        
        System.out.println("Dilstoši skaitļi = " );
        
        
        
    }
    public static void whatTimeN(){
        Scanner input = new Scanner(System.in);
        System.out.println("Ievadi dienu P,O,T,C,Pk,Se,Sv: ");
        String n = input.next();
        System.out.println("Vai ir atvalinajums? ");
        String n2 = input.next();
        if (n2 .equals("true") ){
            System.out.println("Ir atvalinajums ");
               if (n2.equals("P") || n2.equals("O") || n2.equals("T") || n2.equals("C") || n2.equals("Pk")){
           System.out.println("10:00");
           
            if(n2.equals("Se") || n2.equals("Sv")){
            System.out.println("off");
        }
         
        else if (n2 .equals("false")){
              System.out.println("Nav atvalinajums ");
         }
        
        
        if (n.equals("P") || n.equals("O") || n.equals("T") || n.equals("C") || n.equals("Pk")){
           System.out.println("7:00");
        }
        else if(n.equals("Se") || n.equals("Sv")){
            System.out.println("10:00");
          
            
            
        }
               }
        }
      
        
    }
        
    
    
    public static void divdesmitViensN(){
        Scanner input = new Scanner(System.in); 
        System.out.println("Ievadi pirmo skaitli ") ;
        int n = input.nextInt();
        
        System.out.println("Ievadi otro skaitli ") ;
        int n2 = input.nextInt();
	
        
         if (n <= 21 && n2 <= 21) {
            if (n>n2){
                System.out.println(n);
            } 
            else if(n<n2)
                System.out.println(n2);
            else {
                System.out.println("Neizškirts");
            }    
            
        } 
         else if (n > 21 && n2 < 22) {
            if(n2>n)
                System.out.println(n2);
        }
                
                
        else if (n < 22 && n2 < 22) {
            if(n2>n)
                
    
                System.out.println(n2);
            }
	
	
        
        }
        public static void speedN(){
        Scanner input = new Scanner(System.in);
        System.out.println("Ievadi atrumu ");
        int n = input.nextInt();
        System.out.println("Vai ir dzimsanas diena? ");
        String n2 = input.next();
        if (n2 .equals("true") ){
            System.out.println("Ir dz/d ");
            n= n-5;
        }
         
        else if (n2 .equals("false")){
              System.out.println("Nav dz/d ");
         }
        
        if (n >= 60 ) {
            
                System.out.println("0-soda nav");
        }
       else  if (n > 61 && 80 < n){
            System.out.println("1-neliels sods");
         }
        else if(n > 80)
             System.out.println("2-liels sods");
        
           
        }
        
        
    
    
}


