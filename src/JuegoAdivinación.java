import java.util.Random;
import java.util.Scanner;

public class JuegoAdivinación {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numeroAleatorio = new Random().nextInt(100);
        int contador = 0;
        int numeroIngresado = 0;
        int numeroSecreto = 0;


        while (contador <= 4){
            System.out.println("Adivina el numero");
            numeroSecreto = numeroAleatorio;
            numeroIngresado = teclado.nextInt();
            if (numeroSecreto > numeroIngresado){
                System.out.println("El número secreto es mayor");
            }else if(numeroSecreto < numeroIngresado) {
                System.out.println("El número secreto es menor");
            }

            if(numeroIngresado == numeroSecreto){
                System.out.println("Adivinaste el número secreto Feliciades");
                break;
            }
            contador++;
            if (contador >= 5){
                System.out.println("no te quedan mas intentos");
            }
        }
    }
}
