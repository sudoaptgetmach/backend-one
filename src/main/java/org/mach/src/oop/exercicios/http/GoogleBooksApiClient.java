package org.mach.src.oop.exercicios.http;

import java.io.IOException;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class GoogleBooksApiClient {

    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o nome de um livro: ");
        var busca = scanner.nextLine();
        System.out.println("Insira o nome do autor (caso saiba, ou aperte Enter para continuar): ");
        var authorInput = scanner.nextLine();

        String apiKey = System.getenv("GOOGLE_API_KEY");
        if (apiKey == null || apiKey.isEmpty()) {
            throw new RuntimeException("API key not found in environment variables");
        }

        String endereco = "https://www.googleapis.com/books/v1/volumes?q=" + URLEncoder.encode(busca, StandardCharsets.UTF_8);
        if (!authorInput.isEmpty()) {
            endereco += "+inauthor:" + URLEncoder.encode(authorInput, StandardCharsets.UTF_8);
        }
        endereco += "&key=" + apiKey;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body());

        scanner.close();
    }
}