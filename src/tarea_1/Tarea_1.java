
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
    String oracion_1;
    System.out.println("Ingrese su oracion en ingles");
    oracion_1 = lector.next();
    
          
              
}

public static void Operaciones_bitwise(){
    
    
}
        
}
    
