package org.mach.src.oop.exercicios.http;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class CoinGeckoApiClient {

    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o nome de uma Criptomoeda: ");
        var busca = scanner.nextLine();
        System.out.println("Insira a moeda desejada (BRL, USD): ");
        var currency = scanner.nextLine();

        switch (currency) {
            case "BRL", "brl", "USD", "usd":
                break;
            default:
                System.out.println("Insira uma moeda válida.");
                return;
        }

        String apiKey = System.getenv("COINGECKO_API_KEY");
        if (apiKey == null || apiKey.isEmpty()) {
            throw new RuntimeException("API key not found in environment variables");
        }

        String endereco = "https://api.coingecko.com/api/v3/coins/markets?vs_currency=" + currency + "&ids=" + busca + "&x_cg_demo_api_key=" + apiKey;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body());

    }
}
