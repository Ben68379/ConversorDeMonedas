package src;

import java.io.IOException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args){
        var menu = new Menu();
        double conversion;
        double cantidad;
        String mon;
        String mon2;
        System.out.println(menu.getPrompt());
        Busqueda bus = new Busqueda();
        Scanner teclado = new Scanner(System.in);

        menu.seleccion(teclado.nextInt());
        System.out.println(menu.getPrompt2());
        teclado = new Scanner(System.in);

        menu.seleccion(teclado.nextInt());


        try {
            bus.generaDireccion(menu.getMon(), menu.getMon2());
            mon = menu.getMon();
            mon2 = menu.getMon2();
            System.out.println(menu.getPrompt3());
            teclado = new Scanner(System.in);
            cantidad = teclado.nextDouble();
            conversion = cantidad * bus.getValor();
            System.out.println(cantidad + " " + mon + " = "
                    + conversion + " " + mon2);

        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
