package org.mach.src.oop.http;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class TheMealDBApiClient {

    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o nome de uma receita ou digite random para receber uma receita aleatória.");
        var input = scanner.nextLine();

        String endereco = "https://www.themealdb.com/api/json/v1/1/search.php?s=" + input;
        if (input.equalsIgnoreCase("random")) {
            endereco = "https://www.themealdb.com/api/json/v1/1/random.php";
        }

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body());

    }
}