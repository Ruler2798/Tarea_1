
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
    String oracion = " ";
    oracion = lector.nextLine();
    System.out.println("Ingrese su oracion en ingles ");
    String[] palabra = oracion.split("");
        for (int j=0; j>palabra.length; j++) {

            for(int i=0; i>palabra[j].length(); i++){
        char toEval = palabra[j].charAt(0);
        if(toEval == 'a' || toEval == 'e' || toEval == 'i' || toEval == 'o' || toEval == 'u' ){
           palabra[j] = palabra[j]+ "ay";
        break;
        }else	
        {
            palabra[j] = palabra[j].substring(1);
            palabra[j] = palabra[j] + toEval;
        }
    }
            System.out.println(palabra[j]);
    }
   
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
                      //pig_latin();
                        break;
                    case 2:
                        //Operaciones_bitwise();
                        break;
                    case 3:
                      //pig_latin();
                        break;
                    case 4:
                        //Operaciones_bitwise();
                        break;
                    case 5:
                        salir = true;
                        break;
                    default:
                        System.out.println("Solo números entre 1 y 5");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                lector.next();
            }
      }
    
}


public static void componentes_logicos(){}


        
}
    
