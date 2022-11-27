import java.util.Scanner;

public class Ejercicio8 {
    // Creamos una función que devuelve un valor double y le pasamos tres parámetros 
    static double calculadora(double num1, double num2, int opc) {
        // Crearemos la variable para devolver el resultado y la inicializamos para hacer operaciones
        double res = 0;
        // Hacemos un switch en el que el parámetro de entrada sea la opción
        switch (opc) {
            // En la primer opción haremos la suma entre las dos variables
            case 1:
                res = num1 + num2;
                // Hacemos break para salir del switch
                break;
            // En la segunda opción haremos la resta entre las dos variables
            case 2:
                res = num1 - num2;
                // Hacemos break para salir del switch
                break;
            // En la tercera opción haremos la multiplicación entre las dos variables
            case 3:
                res = num1 * num2;
                // Hacemos break para salir del switch
                break;
            // En la cuarta opción haremos la división entre las dos variables
            case 4:
                res = num1 / num2;
                // Hacemos break para salir del switch
                break;
            // El default controlará que no pasemos ninguna opción errónea
            default:
                // Le asignamos 0 a la variable res
                res = 0;
                // Hacemos break para salir del switch
                break;
        }
        // Y devolvemos el resultado
        return res;
    }

    public static void main(String[] args) {
        // Creamos dos variables que sean num para pedir al usuario
        int num1, num2;
        // La variable opc para pedírsela al usuario y identificar la opción que vamos a usar
        int opc;

        // Creamos un escaner para leer datos
        Scanner key = new Scanner(System.in);

        // Pedimos variable al usuario
        System.out.println("Deme un primer número: ");
        num1 = key.nextInt();
        System.out.println("Deme un segundo número: ");
        num2 = key.nextInt();
        // Imprimimos un menú orientativo al usuario
        System.out.println("-------MENÚ-------\n" +
                "Elige una opción:\n" +
                "1. Suma\n" +
                "2. Resta\n" +
                "3. Multiplicación\n" +
                "4. División");
        // Y pedimos la opción por pantalla
        opc = key.nextInt();

        // Imprimimos resultado pidiendo a la función el resultado
        System.out.println("El resultado es: " + calculadora(num1, num2, opc));

        // Cerramos escaner
        key.close();
    }
}
