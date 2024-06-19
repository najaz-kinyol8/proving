import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // Crear un objeto Random para generar números aleatorios
        Random random = new Random();
        // Número aleatorio entre 1 y 100
        int numeroAleatorio = random.nextInt(100) + 1;

        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        int intento = 0;
        int numeroUsuario = 0;

        // Mensaje inicial
        System.out.println("¡Bienvenido al juego de adivinanza!");
        System.out.println("He escogido un número entre 1 y 100. ¡Intenta adivinarlo!");

        // Bucle del juego
        while (numeroUsuario != numeroAleatorio) {
            intento++;
            System.out.print("Intento " + intento + ": ");
            numeroUsuario = scanner.nextInt();

            if (numeroUsuario < numeroAleatorio) {
                System.out.println("El número es mayor.");
            } else if (numeroUsuario > numeroAleatorio) {
                System.out.println("El número es menor.");
            } else {
                System.out.println("¡Felicidades! Has adivinado el número en " + intento + " intentos.");
            }
        }

        // Cerrar el scanner
        scanner.close();
    }
}