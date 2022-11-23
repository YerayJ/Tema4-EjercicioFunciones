import java.util.Scanner;

public class Ejercicio6 {
    // Creamos una función de tipo booleano y le pasaremos una String
    static boolean esPrimo(int num) {
        // Declaramos la variable esVocal en true
        boolean esPrimo = true;
        // Creamos un if que si el resto del num da 0 el número es
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                // Devolvemos la variable booleana
                
                esPrimo = false;
                break;
            }
        } 
        return esPrimo;
    }

    public static void main(String[] args) {
        // Creamos variables
        int num;

        // Creamos un escaner para leer datos
        Scanner key = new Scanner(System.in);

        // Pedimos variable al usuario
        System.out.println("Deme un número: ");
        num = key.nextInt();

        // Imprimimos resultado llamando a la función. Hago un operador ternario para
        // que si me devuelve true imprima que es vocal.
        System.out.println((esPrimo(num) == true ? "Es primo" : "No es primo"));

    }
}
