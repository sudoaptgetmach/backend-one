package org.mach.projects.screenmatch;

public class Main {

    public static void main(String[] args) {

        int anoDeLancamento;
        anoDeLancamento = 2022;

        double media1 = Math.random() * 11;
        double media2 = Math.random() * 11;
        double media3 = Math.random() * 11;

        double media = (media1 + media2 + media3) / 3;
        double rating = media / 2;

        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;
        String sinopse;
        sinopse = """
                  After more than 30 years of service as one of the Navy's top aviators, Pete "Maverick" Mitchell is where he belongs, 
                  pushing the envelope as a courageous test pilot and dodging the advancement in rank that would ground him.
                  """;

        System.out.println("Esse é o screenmatch");
        System.out.println("Filme: Top Gun Maverick");
        System.out.println("Classificação: " + rating);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        System.out.println("Sinopse: \n" + sinopse);




    }
}
