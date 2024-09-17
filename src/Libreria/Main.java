/**
 * TDA Libro y Biblioteca
 * o Crea un TDA Libro con atributos como título, autor, año de
 * publicación, y número de copias disponibles. Luego, crea un
 * TDA Biblioteca que maneje un conjunto de libros y permita
 * operaciones como agregar un libro, buscar por título o autor, y
 * prestar o devolver un libro.
 */

package Libreria;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        //defino un dato del tipo Libro y reservo los espacios de memoria necesarios para su uso
        Libro lib = new Libro();
        Scanner ingreso = new Scanner(System.in);
        LocalDateTime fechaactual = LocalDateTime.now();
        System.out.println("Hola, ingrese el titulo del libro o un fin para salir:");
        lib.setTitulo(ingreso.nextLine());

        do{

            if(lib.getTitulo().equals("fin")){
                break;
           }

            else{
                System.out.println("Ingrese el autor del libro: ");
                lib.setAutor(ingreso.nextLine());

                System.out.println("Ingrese la editorial del libro: ");
                lib.setEditorial(ingreso.nextLine());

                /*boolean terminar = false;

                do {
                    System.out.println("Ingrese el año de publicación: ");

                    // Verifica si la entrada es un número entero
                    if (ingreso.hasNextInt()) {
                        int anio = ingreso.nextInt();
                        lib.setAniodepublicacion(anio);

                        // Verifica si el año es menor o igual al año actual
                        if (lib.getAniodepublicacion() <= fechaactual.getYear()) {
                            terminar = true;
                        } else {
                            System.out.println("El año ingresado es mayor que el año actual. Inténtelo de nuevo.");
                        }
                    }
                    else {
                        System.out.println("Lo siento, ingrese un valor correcto.");
                        ingreso.next();  // Limpia la entrada incorrecta
                    }
                } while (!terminar);

                 */
                System.out.println("Ingrese el año de publicación: ");
                lib.setAniodepublicacion(Validador.anioLibro());

                System.out.println("ingrese el numero de copias que tiene el libro:");
                lib.setNumerosdecopias(ingreso.nextInt());

            }
            System.out.println("Hola, ingrese el titulo del libro o un fin para salir:");

            ingreso.nextLine();//absorbe el salto de linea de nextInt

            lib.setTitulo(ingreso.nextLine());

        }while(!lib.getTitulo().equals("fin"));

        System.out.println(lib.getTitulo());
        System.out.println(lib.getAutor());
        System.out.println(lib.getEditorial());
        System.out.println(lib.getAniodepublicacion());
        System.out.println(lib.getNumerosdecopias());
    }
}