package src;

public class Menu {
    String mon = "";
    String mon2 = "";
    public String getMon() {
        return mon;
    }
    public String getMon2() {
        return mon2;
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
                if(mon.equals("")){
                    this.mon = "USD";
                }
                else {
                    this.mon2 = "USD";
                }
                break;
            case 2:
                if(mon.equals("")) {
                    this.mon = "EUR";
                }
                else{
                    this.mon2 = "EUR";
                }
                break;
//            case 3:
//                this.cont = "GBP";
//                break;
//            case 4:
//                this.cont = "JPY";
//                break;
//            case 5:
//                this.cont= "CHF";
//                break;
//            case 6:
//                this.cont = "HKD";
//                break;
//            case 7:
//                this.cont = "CAD";
//                break;
//            case 8:
//                this.cont = "AUD";
//                break;
//            case 9:
//                this.cont = "CNY";
//                break;
//            case 10:
//                this.cont = "BRL";
//                break;
            default:
                System.out.println("error");
        }

    }
}
