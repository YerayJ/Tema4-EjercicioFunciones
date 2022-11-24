import java.util.Scanner;

public class Ejercicio7 {
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

    static int divisoresPrimos(int num) {
        int contador = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                if (esPrimo(i)) {
                    contador++;
                }
            }
        }
        return contador;
    }

    public static void main(String[] args) {
        // Creamos variables
        int num;

        // Creamos un escaner para leer datos
        Scanner key = new Scanner(System.in);

        // Pedimos variable al usuario
        System.out.println("Deme un número: ");
        num = key.nextInt();

        // Imprimimos resultado
        System.out.println("El número de divisores primos de " + num + " es " + divisoresPrimos(num));
        
        // Cerramos escaner
        key.close();
    }
}
