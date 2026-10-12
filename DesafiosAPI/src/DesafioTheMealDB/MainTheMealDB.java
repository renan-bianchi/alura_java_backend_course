package DesafioTheMealDB;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class MainTheMealDB {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner readInput = new Scanner(System.in);
        System.out.println("Informe a receita desejada: ");
        var inputResult = readInput.nextLine();

        String APY_KEY = "1";
        String URL = "https://www.themealdb.com/api/json/v1/" + APY_KEY + "/search.php?s=" + inputResult;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(URL)).build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body());

    }
}
