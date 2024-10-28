package org.mach.src.oop.http;

import org.mach.src.oop.utils.NumsUtils;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class FlightSimApiClient {

    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner scanner = new Scanner(System.in);
        String endereco;

        System.out.println("Insira a CID de um usuário da VATSIM: ");
        String input = scanner.next();

        if (NumsUtils.isNaN(input)) {
            System.out.println("O CID deve ser um número.");
            return;
        }

        System.out.println("Escolha uma das opções abaixo: ");
        System.out.println("1 - Stats");
        System.out.println("2 - Details");
        System.out.println("3 - ATC sessions");
        System.out.println("4 - Pilot sessions");
        System.out.println("5 - Previous Flightplans");
        int opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                endereco = "https://api.vatsim.net/v2/members/" + input + "/stats";
                break;
            case 2:
                endereco = "https://api.vatsim.net/v2/members/" + input;
                break;
            case 3:
                endereco = "https://api.vatsim.net/v2/members/" + input + "/atc";
                break;
            case 4:
                endereco = "https://api.vatsim.net/v2/members/" + input + "/history";
                break;
            case 5:
                endereco = "https://api.vatsim.net/v2/members/" + input + "/flightplans";
                break;
            default:
                System.out.println("Escolha uma opção válida.");
                return;
        }

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body());
    }
}
