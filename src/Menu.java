package src;

public class Menu {
    String mon = "";
    public String getMon() {
        return mon;
    }
    public void menu(){

        System.out.println("""
                -------------------------------------------
                Igresa la moneda a la que deseas convertir
                
                1.Dolar USA(USD).               6.Dolar HongKones (HKD).
                2.Euro (EUR).                   7.Dolar Canadiense (CAD).
                3.Libra esterlina UK(GBP).      8.Dolar Australiano (AUD).
                4.Yen JPN(JPY).                 9.Yuan CH(CNY).
                5.Franco Suizo (CHF).           10.Real Brasileño (BRL).
                """);
    }
    public void seleccion(int teclado) {
        switch (teclado) {
            case 1:
                this.mon = "USD";
                break;
            case 2:
                this.mon = "EUR";
                break;
            case 3:
                mon = "GBP";
                break;
            case 4:
                mon = "JPY";
                break;
            case 5:
                mon = "CHF";
                break;
            case 6:
                mon = "HKD";
                break;
            case 7:
                mon = "CAD";
                break;
            case 8:
                mon = "AUD";
                break;
            case 9:
                mon = "CNY";
                break;
            case 10:
                mon = "BRL";
                break;
            default:
                System.out.println("error");
        }

    }
}
