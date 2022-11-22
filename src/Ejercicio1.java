
import java.util.Scanner;

public class Ejercicio1 {

    // Creamos función eco y creamos como parámetro de entrada la variable veceseco
    // en int
    static void eco(int veceseco) {
        // En este bucle Eco se repetirá el número de veces que contenga la variable
        // veceseco
        for (int i = 0; i < veceseco; i++) {
            // Imprimimos el mensaje por cada bucle
            System.out.println("Eco...");
        }
    }

    public static void main(String[] args) {
        // Creamos variable n para pedírsela al usuario
        int n;

        // Creamos escaner para leer datos
        Scanner key = new Scanner(System.in);

        // Pedimos datos al usuario
        System.out.println("Deme un número: ");
        n = key.nextInt();

        // Llamamos a la función y le pasamos como parámetro la variable creada
        eco(n);

    }
}
