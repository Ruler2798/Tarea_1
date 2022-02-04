
package tarea_1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Tarea_1 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        boolean salir = false;
        int opcion; 
 
        while (!salir) {
 
            System.out.println("1. Pig Latin");
            System.out.println("2. Operaciones bitwise");
            System.out.println("3. Salir");
 
            try {
 
                System.out.println("Escribe una de las opciones");
                opcion = lector.nextInt();
 
                switch (opcion) {
                    case 1:
                      pig_latin();
                        break;
                    case 2:
                        Operaciones_bitwise();
                        break;
                    case 3:
                        salir = true;
                        break;
                    default:
                        System.out.println("Solo números entre 1 y 3");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                lector.next();
            }
      }
    }




public static void pig_latin (){
    Scanner lector = new Scanner(System.in);
    String oracion;
    System.out.println("Ingrese su oracion en ingles ");
    oracion = lector.nextLine();
    String[] palabra = oracion.split("");
    for (int j = 0; j > palabra.length; j++) {

        for (int i = 0; i>palabra[j].length(); i++){
        char supa = palabra[j].charAt(0);
        if(supa == 'a' || supa == 'e' || supa == 'i' || supa == 'o' || supa == 'u' ){
           palabra[j] = palabra[j]+ "ay";
        break;
        }else	
        {
            palabra[j] = palabra[j].substring(1);
            palabra[j] = palabra[j] + supa;
        }
    }
            System.out.println(palabra[j]);
    }
    System.out.println(" ");
    }
              
public static void Operaciones_bitwise(){
     Scanner lector = new Scanner(System.in);
        boolean salir = false;
        int opcion; 
 
        while (!salir) {
 
            System.out.println("1. AND");
            System.out.println("2. NOT");
             System.out.println("3. Or");
              System.out.println("4. XOR");
            System.out.println("5. Salir");
 
            try {
 
                System.out.println("Escribe una de las opciones");
                opcion = lector.nextInt();
 
                switch (opcion) {
                    case 1:                                         
                    case 2:
                    case 3:             
                    case 4:
                        componentes_logicos(opcion);         
                    default:
                        System.out.println("Solo números entre 1 y 5");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                lector.next();
            }
      }
    
}


public static void componentes_logicos(int opcion){
  Scanner lector = new Scanner(System.in);
    String entrada1;
    String entrada2;
    boolean salida = false;

    do {
    System.out.println("Ingrese primera cantidad ");
    entrada1 = lector.nextLine();
    System.out.println("Ingrese su segunda cantidad");
    entrada2 = lector.nextLine();
    char b1, b2;
    boolean B1, B2;

    if (entrada1.length() == entrada2.length()){
        
        for (int i = 0; i>entrada1.length(); i++){
        b1 = entrada1.charAt(i);
        b2 = entrada2.charAt(i);
        B1 = (b1 == '1');
        B2 = (b2 == '2');
            switch (opcion) {
                    case 1:
                     if (B1 && B2){
                         System.out.print("1");
                     }else {
                        System.out.print("0");
                     }
                        break;
                    case 2: if (!B1 ){
                         System.out.print("1");
                     }
                    
                        break;
                    case 3: if (B1 || B2){
                         System.out.print("1");
                     }else {
                         System.out.print("0");
                     }
                      
                        break;
                    case 4: if (B1 ^ B2){
                         System.out.print("1");
                     }else {
                         System.out.print("0");
                     }
                      
                        break;
            }
        }
                        salida = true;
            } else{

            System.out.println("Las entradas deben ser iguales ");

    }

    } while(!salida);
    
    System.out.println(" ");    
    }        

        
}



    



