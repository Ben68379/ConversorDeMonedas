package src;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Busqueda {
    private double moneda;

    public double getMoneda() {
        return moneda;
    }

    private String mone;
    private String direccion = "https://v6.exchangerate-api.com/v6/0cbad85ec17d8d997464a74b/pair/";
    public Busqueda (String mon){
        mone = String.valueOf(mon);
    }


    public void generaDireccion(String mon, String mon2) throws IOException, InterruptedException{
     Gson gson = new GsonBuilder()

             .setPrettyPrinting()
             .create();
        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(direccion + mon + "/" + mon2))
                    .build();
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            String json = response.body();
            System.out.println(json);
            ExchangeRateAPI exchange = gson.fromJson(json, ExchangeRateAPI.class);
            System.out.println(exchange);
            Moneda mone = new Moneda(exchange);
            System.out.println(mone.getValor());
            moneda = mone.getValor();


        }catch (NumberFormatException e){
            System.out.println("Ocurrió un error: ");
            System.out.println(e.getMessage());
        }
    }

}
