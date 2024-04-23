package src;

import java.io.IOException;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args){
        var menu = new Menu();
        String mon = "";
        double conversion;
        menu.menu();
        Busqueda bus = new Busqueda(mon);
        Scanner teclado = new Scanner(System.in);

        menu.seleccion(teclado.nextInt());
        System.out.println("Ingresa la moenda destino");
        teclado = new Scanner(System.in);

        menu.seleccion(teclado.nextInt());


        try {
            bus.generaDireccion(menu.getMon(), menu.getMon2());
            System.out.println("Cantidad a convertir");
            teclado = new Scanner(System.in);
            conversion = teclado.nextDouble() * bus.getMoneda();
            System.out.println(conversion);





        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
