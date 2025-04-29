import java.util.Scanner;

public class Evaluaciones {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double nota = 0;
        double mediaEvaluaciones = 0;
        double totalEvaluaciones = 0;

        //uso de while

        while (nota != -1){
            System.out.println("Escribe la nota que le darias a la película matriz");
            nota = teclado.nextDouble();

            if (nota != -1) {
                mediaEvaluaciones = mediaEvaluaciones + nota;
                totalEvaluaciones++;
            }
        }

        System.out.println("la media de evaluaciones para matrix es: " + mediaEvaluaciones/ totalEvaluaciones);

    }
}
