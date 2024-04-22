package src;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) throws IOException, InterruptedException{
        var menu = new Menu();
        String mon = "";

        menu.menu();
        Scanner teclado = new Scanner(System.in);
        switch (teclado.nextInt()) {
            case 1:
                mon = "USD";
                break;
            case 2:
                mon = "EUR";
                break;
            case 3:
                mon = "GBP";
                break;
            default:
                System.out.println("error");
        }
        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create("https://v6.exchangerate-api.com/v6/0cbad85ec17d8d997464a74b/latest/"
                            + mon))
                    .build();
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            String json = response.body();
            System.out.println(json);
        }catch (NumberFormatException e){
            System.out.println("Ocurrió un error: ");
            System.out.println(e.getMessage());
        }

    }

}
