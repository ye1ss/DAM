/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.proyecto;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

/**
 *
 * @author Alumno
 */
public class CartasPokemon {


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        HttpRequest request = HttpRequest.newBuilder()
		.uri(URI.create("https://pokemon-tcg-card-prices.p.rapidapi.com/card?setId=33ee55f4-30d0-4900-850f-36a351fb9719&set=vivid-voltage&series=sword-and-shield"))
		.header("X-RapidAPI-Key", "6d965593f1msheb0162b048dd95dp1401aejsn90d2f60dd9f3")
		.header("X-RapidAPI-Host", "pokemon-tcg-card-prices.p.rapidapi.com")
		.method("GET", HttpRequest.BodyPublishers.noBody())
		.build();
        try{
            HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
            System.out.println(response.body());
        }
        catch(Exception e){
            System.out.println("Error");  
        }
    
    }
}
