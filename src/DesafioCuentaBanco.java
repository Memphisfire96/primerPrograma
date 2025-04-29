import java.util.Scanner;

public class DesafioCuentaBanco {
    public static void main(String[] args) {
        String nombrecliente = "Tony Stark";
        String tipoCuenta = "Corriente";
        double saldoDisponible = 1599.99;
        int ingresoNumero = 0;
        double retiro = 0;
        double deposito = 0;

        Scanner teclado = new Scanner(System.in);

        System.out.println("***********************************");
        System.out.println("\nNombre del cliente: "+ nombrecliente );
        System.out.println("Tipo de cuenta: "+ tipoCuenta);
        System.out.println("Saldo disponible: "+ saldoDisponible + "$");
        System.out.println("\n***********************************");

        String menu = """
                
                Escribe el número de la opción deseada
                
                1- Consultar saldo
                2- Retirar
                3- Depositar
                9- Salir
                """;

        while (ingresoNumero != 9){
            System.out.println(menu);
            ingresoNumero = teclado.nextInt();
            switch (ingresoNumero){
                case 1:
                    System.out.println("tu saldo es: "+ saldoDisponible + "$");
                    break;
                case 2:
                    System.out.println("Ingresa el valor a retirar : ");
                    retiro = teclado.nextDouble();

                    if (saldoDisponible < retiro){
                        System.out.println("Saldo insuficiente");
                    }else{
                        saldoDisponible = saldoDisponible - retiro;
                        System.out.println("El Saldo disponible es: "+ saldoDisponible +"$");
                    }
                    break;
                case 3:
                    System.out.println("Ingresa el valor del deposito: ");
                    deposito = teclado.nextDouble();
                    if (deposito <= 0){
                        System.out.println("Por Favor ingrese una cantidad valida");
                    }else{
                        saldoDisponible = deposito + saldoDisponible;
                        System.out.println("El Saldo disponible es: "+ saldoDisponible +"$");
                    }
                    break;
                case 9:
                    break;
                default:
                    System.out.println("Opción no valida");

            }

        }





    }
}
