package main;

import arraybasico.Array;
import persona.Persona;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa el tamaño del arreglo:");
        Array array = new Array(scanner.nextInt());
        capturarDatos(new Scanner(System.in),array);
       // recorre(array.getDiasDeSemana());
        recorre(array.getPersonas());

        //Array.iterarMatriz();
        //Array array = new Array(2);


    }

    public static void recorre(Persona [] personas){
        for (int i = 0; i < personas.length; i++) {
            System.out.println(personas[i]);
        }


    }

    public static void capturarDatos(Scanner scanner, Array array){
        int contador = 0;
        while (contador <  array.getDiasDeSemana().length){
          /*  System.out.println("REGISTRA UN DÍAS DE LA SEMANA");
            array.addDia(scanner.next());*/
            System.out.println("Ingresa el nombre de la persona: ");
            String nombre = scanner.next();
            System.out.println("Ingresa la edad de la persona: ");
            int edad = scanner.nextInt();
            array.addPersona(new Persona(nombre,edad));
            contador++;
        }
    }

}
