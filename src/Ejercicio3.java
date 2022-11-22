
import java.math.MathContext;

import java.util.Scanner;

public class Ejercicio3 {

    // Creamos la función cilindro pasando como parámetros opcion, radio y altura.
    static void cilindro(int opcion, int radio, int altura) {
        // Creamos un switch para los dos opciones que necesitamos
        switch (opcion) {
            // Para la opción 1 meteremos el area
            case 1:
                // Indicamos area de tipo double para sacar decimales y metemos la fórmula
                // dentro de ella.
                double area = 2 * radio * (altura + radio);
                // Imprimimos el area con solo dos decimales
                System.out.printf("El área es %.2f", area);
                // Usamos el break para salir directamente del programa
                break;
            case 2:
                // Indicamos volumen de tipo double para sacar decimales y metemos la fórmula
                // dentro de ella. Usamos la función Math.PI para sacar el número PI
                double volumen = Math.PI * (radio * radio) * altura;
                // Imprimimos el volumen con solo dos decimales
                System.out.printf("El volumen es %.2f", volumen);
                // Usamos el break para salir directamente del programa
                break;
            // Para el default le diremos que la opción pasada no es correcta
            default:
                System.out.println("La opción pasada no es correcta");
                break;
        }
    }

    public static void main(String[] args) {
        // Creamos variable num1 y num2 para pedírsela al usuario
        int opcion, radio, altura;

        // Creamos escaner para leer datos
        Scanner key = new Scanner(System.in);

        // Pedimos datos al usuario
        System.out.println("Que opción quiere (1. Área o 2. Volumen): ");
        opcion = key.nextInt();
        System.out.println("Deme el radio: ");
        radio = key.nextInt();
        System.out.println("Deme la altura: ");
        altura = key.nextInt();

        // Llamamos a la función y le pasamos como parámetro la variable creada
        cilindro(opcion, radio, altura);

    }
}
