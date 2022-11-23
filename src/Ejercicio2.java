
import java.util.Scanner;

public class Ejercicio2 {

    // Creamos función eco y creamos como parámetro de entrada la variable veceseco
    // en int
    static void numeroscomprendidos(int num1, int num2) {
        // En este bucle imprimimos todos los números comprendidos entre dos números
        // pasados. En la i comprobamos cual es el número más pequeño de los dos y le
        // sumamos uno para que empiecen por el número siguiente. En cambio en el rango
        // máximo será comprobando cual de los dos es más grande.
        for (int i = (num1 < num2 ? num1 : num2); i < (num1 > num2 ? num1 : num2) + 1; i++) {
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

        // Llamamos a la función y le pasamos como parámetro la variable creada
        numeroscomprendidos(num1, num2);

    }
}
