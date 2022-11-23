import java.util.Scanner;

public class Ejercicio5 {
    // Creamos una función de tipo booleano y le pasaremos una String
    static boolean esVocal(String vocal) {
        // Declaramos la variable esVocal en true
        boolean esVocal = true;
        // En este switch le pasaremos la vocal introducida por el usuario
        switch (vocal) {
            // Si alguna de las letras es vocal saldrá del switch directamente y la variable
            // seguirá en true
            case "a", "e", "i", "o", "u":
                break;
            // En caso de que no esa vocal la variable booleana cambia a false
            default:
                esVocal = false;
                break;
        } // Devolvemos la variable booleana
        return esVocal;
    }

    public static void main(String[] args) {
        // Creamos variables
        String vocal;

        // Creamos un escaner para leer datos
        Scanner key = new Scanner(System.in);

        // Pedimos variable al usuario
        System.out.println("Deme una vocal: ");
        vocal = key.nextLine();

        // Imprimimos resultado llamando a la función. Hago un operador ternario para
        // que si me devuelve true imprima que es vocal.
        System.out.println((esVocal(vocal) == true ? "Es vocal" : "No es vocal"));

    }
}
