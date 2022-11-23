import java.util.Scanner;

public class Ejercicio4 {
    // Creamos una funcióm en la que pasamos dos números y volvemos un valor de tipo
    // int
    static int nummax(int num1, int num2) {
        // Haremos un ternario para devolver el mayor de los dos
        return (num1 > num2 ? num1 : num2);
    }

    public static void main(String[] args) {
        // Creamos variables pedidas por el ejercicio
        int num1, num2;

        // Creamos escaner para leer datos
        Scanner key = new Scanner(System.in);

        // Pedimos las variables al usuario
        System.out.println("Deme un número: ");
        num1 = key.nextInt();
        System.out.println("Deme otro número: ");
        num2 = key.nextInt();

        // Pedimos a la función que nos devuelva el número más grande y lo imprimimos
        System.out.println("El número máximo es " + nummax(num1, num2));

    }
}
