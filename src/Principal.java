package src;

import java.io.IOException;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args){
        var menu = new Menu();
        String mon = "";
        menu.menu();
        Busqueda bus = new Busqueda(mon);
        Scanner teclado = new Scanner(System.in);

        menu.seleccion(teclado.nextInt());
        try {
            bus.generaDireccion(menu.getMon());

        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
