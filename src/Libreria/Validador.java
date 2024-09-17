package Libreria;

import java.time.LocalDateTime;
import java.util.Scanner;


public class Validador {
    public static int anioLibro(){
        Scanner ingreso = new Scanner(System.in);
        int anio = 0;
        boolean terminar = false;
        LocalDateTime fechaactual = LocalDateTime.now();

        do{
            if (ingreso.hasNextInt()) {
                anio = ingreso.nextInt();

                // Verifica si el año es menor o igual al año actual
                if (anio<= fechaactual.getYear()) {
                    terminar = true;
                } else {
                    System.out.println("El año ingresado es mayor que el año actual. Inténtelo de nuevo.");
                }
            }
            else {
                System.out.println("Lo siento, ingrese un valor correcto.");
                ingreso.next();  // Limpia la entrada incorrecta
            }

        }while(!terminar);
        return(anio);
    }
}
