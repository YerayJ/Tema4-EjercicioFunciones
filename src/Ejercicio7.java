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

    // Creamos una función que nos diga cuales son divisores primos y le pasamos num
    // de tipo int
    static int divisoresPrimos(int num) {
        // Creamos un contador para iniciar
        int contador = 0;
        // Creamos un bucle que recorra desde el 1 hasta el número que hayamos pasado
        for (int i = 1; i < num; i++) {
            // Comprobamos cuál de los números es divisible
            if (num % i == 0) {
                // Para comprobar si es primo le pasamos la i actual a la función 
                if (esPrimo(i)) {
                    // Si es primo añadimos 1 al contador
                    contador++;
                }
            }
        }
        // Por último devolvemos la variable contador
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
