public class Main {
    public static void main(String[] args) {

        System.out.println("bienvenido a Screen Match");
        System.out.println("Pelicula : Matrix");

        int fechaDeLanzamiento = 1999;
        boolean incluidoEnELPlan = true;
        double notaDeLaPelicula = 7.8;

        double media = (notaDeLaPelicula + 6.0+ 9.0) / 3;
        System.out.println(media);

        //prueba de string mas concatenado

        String sinopsis = """
                Matrix es una paradoja
                La mejor pelicula del fin del milenio
                Fué lanzada en :
                """ + fechaDeLanzamiento;
        System.out.println(sinopsis);







    }
}