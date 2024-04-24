package src;

public class Menu {
    private String mon = "";
    private String mon2 = "";

    public String getPrompt() {
        return prompt;
    }

    public String getPrompt2() {
        return prompt2;
    }

    public String getPrompt3() {
        return prompt3;
    }

    public String getMon() {
        return mon;
    }
    public String getMon2() {
        return mon2;
    }

    private String prompt = ("""
                -------------------------------------------
                Igresa la moneda de la que deseas convertir
                
                1.Peso Argentino (ARS).
                2.Peso Boliviano (BOB).
                3.Real Brasileño (BRL).
                4.Peso Colombiano(COP).
                5.Dolar Estadounidense (USD).
                """);

    private String prompt2 = "Convertir a:";
    private String prompt3 = "Cantidad a convertir";

    public void seleccion(int teclado) {
        switch (teclado) {
            case 1:
                if(mon.equals("")){
                    this.mon = "ARS";
                }
                else {
                    this.mon2 = "ARS";
                }
                break;
            case 2:
                if(mon.equals("")) {
                    this.mon = "BOB";
                }
                else{
                    this.mon2 = "BOB";
                }
                break;
            case 3:
                if(mon.equals("")) {
                    this.mon = "BRL";
                }
                else{
                    this.mon2 = "BRL";
                }
                break;
            case 4:
                if(mon.equals("")) {
                    this.mon = "COP";
                }
                else{
                    this.mon2 = "COP";
                }
                break;
            case 5:
                if(mon.equals("")) {
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
