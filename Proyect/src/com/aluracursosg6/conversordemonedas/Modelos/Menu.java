package com.aluracursosg6.conversordemonedas.Modelos;

public class Menu {
    private String mon = "";
    private String mon2 = "";

    public String getPrompt() {
        return ("""
                -------------------------------------------
                Igresa la moneda de la que deseas convertir
                
                1.Peso Argentino (ARS).
                2.Peso Boliviano (BOB).
                3.Real Brasileño (BRL).
                4.Peso Colombiano(COP).
                5.Dolar Estadounidense (USD).
                """);
    }

    public String getPrompt2() {
        return "Convertir a:";
    }

    public String getPrompt3() {
        return "Cantidad a convertir";
    }

    public String getMon() {
        return mon;
    }
    public String getMon2() {
        return mon2;
    }

    public void seleccion(int teclado) {
        switch (teclado) {
            case 1:
                if(mon.isEmpty()){
                    this.mon = "ARS";
                }
                else {
                    this.mon2 = "ARS";
                }
                break;
            case 2:
                if(mon.isEmpty()) {
                    this.mon = "BOB";
                }
                else{
                    this.mon2 = "BOB";
                }
                break;
            case 3:
                if(mon.isEmpty()) {
                    this.mon = "BRL";
                }
                else{
                    this.mon2 = "BRL";
                }
                break;
            case 4:
                if(mon.isEmpty()) {
                    this.mon = "COP";
                }
                else{
                    this.mon2 = "COP";
                }
                break;
            case 5:
                if(mon.isEmpty()) {
                    this.mon = "USD";
                }
                else{
                    this.mon2 = "USD";
                }
                break;
            default:
                System.out.println("ERROR");
        }

    }
}
