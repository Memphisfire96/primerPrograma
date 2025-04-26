public class Desiciones {
    public static void main(String[] args) {
        int fechaDeLanzamiento = 1999;
        boolean incluidoEnELPlan = false;
        double notaDeLaPelicula = 7.8;
        String tipoPlan = "plus";

        if (fechaDeLanzamiento >= 2022){
            System.out.println("Peliculas más populares");
        }else {
            System.out.println("Peliculas retro que aun vale la pena ver");
        }

        if (incluidoEnELPlan || tipoPlan.equals("plus")){
            System.out.println("disfrute de su pelicula");
        }else {
            System.out.println("pelicula no disponible para su plan actual");
        }
    }
}
