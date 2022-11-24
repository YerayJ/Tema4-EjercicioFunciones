
import java.util.Scanner;

public class Ejercicio2 {

    // Creamos función eco y creamos como parámetro de entrada la variable veceseco
    // en int
    // Precondición el número num1 pasado tiene que ser menor que el segundo
    static void numeroscomprendidos(int num1, int num2) {
        // En este bucle imprimimos todos los números comprendidos entre dos números
        // pasados.
        for (int i = num1; i < num2; i++) {
            // Imprimimos el mensaje por cada bucle
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        // Creamos variable num1 y num2 para pedírsela al usuario
        int num1, num2;

        // Creamos escaner para leer datos
        Scanner key = new Scanner(System.in);

        // Pedimos datos al usuario
        System.out.println("Deme dos números: ");
        num1 = key.nextInt();
        num2 = key.nextInt();

        // Hacemos un if que comprobamos cual de los dos es más pequeño y llamamos a la función
        if (num1 < num2) {
            // Pasamos primero num1
            numeroscomprendidos(num1, num2);
        } else { // Pasamos primero num2
            numeroscomprendidos(num2, num1);
        }
        // Cerramos el escaner
        key.close();
    }
}
