package com.apirest.challenge_conversor;

import com.google.gson.Gson;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

/**
 *
 * @author RicardoV
 */
public class ConexionAPI {

    public static void conexion(String monedaActual, String monedaObjetivo,double monto) {
        String direccion ="https://v6.exchangerate-api.com/v6/2c4dc54cdc6c046d456cf759/pair/"+ monedaActual+"/"+monedaObjetivo;
        
        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(direccion))
                    .build();

            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            
            String mijson=response.body();
            //System.out.println(mijson);
            
            Gson gson=new Gson();
            TraductorJson traductorJson  =gson.fromJson(mijson, TraductorJson.class);
            
            //System.out.println("valor de conversion --->"+traductorJson);
            ManejadorMoneda manejador= new ManejadorMoneda(traductorJson.conversion_rate());
            
            System.out.println("Total de la conversion es: "+manejador.valorConversionFinal(monto));
        } catch (IOException e) {
            System.out.println("error al traer la informacion desde el servidor");

        } catch (InterruptedException t) {
            System.out.println("error al traer la informacion desde api ");
        }

    }
}
