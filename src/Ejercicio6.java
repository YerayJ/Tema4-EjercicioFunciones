import java.util.Scanner;

public class Ejercicio6 {
    // Creamos una función de tipo booleano y le pasaremos una String
    static boolean esPrimo(int num) {
        // Declaramos la variable esVocal en true
        boolean esPrimo = true;
        // Comprobamos que si nos dan el uno sea directamente falso
        if (num == 1) {
            esPrimo = false;
        }
        // Creamos un bucle que vaya recorriendo desde el dos al número.
        for (int i = 2; i < num; i++) {
            // Si un número es divisible entre nuestro número no será primo
            if (num % i == 0) {
                // Aignamos a la variable booleana false
                esPrimo = false;
                // Salimos del bucle, ya que no hay nada más que comprobar
                break;
            }
        } // Devolvemos la variable primo
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
        // que si me devuelve true imprima que es primo.
        System.out.println((esPrimo(num) == true ? "Es primo" : "No es primo"));

    }
}
