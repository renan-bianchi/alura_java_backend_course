package DesafioCoinGecko;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class MainCoinGecko {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner moeda = new Scanner(System.in);
        System.out.println("Digite o nome da moeda referência desejada: ");
        var buscaMoeda = moeda.nextLine();
        System.out.println("resultado do Scanner: " + buscaMoeda );

        Scanner criptomoeda = new Scanner(System.in);
        System.out.println("Digite o nome da criptomoeda desejada: ");
        var buscaCriptomoeda = criptomoeda.nextLine();
        System.out.println("resultado do Scanner: " + buscaCriptomoeda );

        String chave = "CG-a6xhLYSMLGdhjzfPhTQPX2Dg";

        System.out.println("valor chave: " + chave);
        String URL = "https://api.coingecko.com/api/v3/simple/price?vs_currencies=" + buscaMoeda + "&ids=" + buscaCriptomoeda + "&x_cg_demo_api_key=" + chave;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest
                .newBuilder()
                .uri(URI.create(URL))
                .build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body());
    }
}


// >>> Criar um objeto Scanner para receber input:
// Scanner leitura = new Scanner(System.IN);

// Printar msg para input:
//    System.out.println(“Digite o nome do filme para busca: “);

// variável para armazenar valor digitado:
//    var busca = leitura.nextLine();

// variável para armazenar valor da chave de API:
//    String chave = “ ****** COLOQUE AQUI A SUA CHAVE DE API**** ”;

// variável para armazenar URL da API - concatenando endereço, maneira de buscar e chave de API:
//    String endereco = “https://www.omdbapi.com/?t=” +busca + “&apikey=” +chave;

// novo objeto HttpClient que fará a requisição, HttpClient possui um mét'odo estático chamado
// newHttpClient() que cria uma nova instância configurada com as opções padrão.:
//    HttpClient client = HttpClient.newHttpClient();

// cria a requisição. Usa o Builder Pattern ".newBuilder()" para montar a requisição, ".uri()" define o endereço
// para qual a requisição será enviada. "URI.create()" transforma o que está sendo passado como parametro em um objeto URI
// ".build" finaliza a construção da requisição.
//    HttpRequest request = HttpRequest.newBuilder().uri(URI.create(endereco)).build();

// cria um objeto HttpResponse que trabalhará com o tipo String
// é usado do Generics para definir o tipo de dado que será armazenado no objeto
// generics permitem criar classes, interfaces e mét'odos que trabalham com diferentes tipos, mantendo
// a segurança de tipos.
// dentro desse objeto 'response' será armazenada a resposta da ação feita pelo met'odo '.send()' chamado em 'client'
// esse mét'odo envia a requisição ('request') como primeiro argumento, e define como a resposta será tratada
// no caso, ela será tratada como String, fato definido por 'BodyHandlers.ofString()' chamado em 'HttpResponse'
//    HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
//
// mostra o 'body' da resposta da API, que foi convertida para String.
//    System.out.println(response.body());