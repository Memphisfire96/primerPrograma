import java.util.Scanner;

public class Lectura {
    public static void main(String[] args) {
        //utilizo escaner para introducir datos desde teclado
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el nombre de tu película favorita");
        String pelicula = teclado.nextLine();
        System.out.println("ahora escribe la fecha de lanzamiento");
        int fechaLanzamiento = teclado.nextInt();
        System.out.println("Por ultimo dinos que nota le das a esta pelicula");
        double nota = teclado.nextDouble();


        System.out.println(pelicula);
        System.out.println(fechaLanzamiento);
        System.out.println(nota);

    }
}
