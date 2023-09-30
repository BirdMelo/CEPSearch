import Operations.Address;
import Operations.JsonGenerator;
import Operations.SearchHttp;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner write = new Scanner(System.in);
        SearchHttp search = new SearchHttp();
        JsonGenerator generate = new JsonGenerator();
        System.out.print("CEP: ");
        var cep = write.nextLine();
        if (cep.length()==8) {
            try {
                Address newAddress = search.http(cep);
                if (newAddress.cep() == null) {
                    System.out.println("Indereço invalido");
                } else {
                    generate.save(newAddress);
                    System.out.println(newAddress);
                }
            } catch (RuntimeException | IOException e) {
                System.out.println(e.getMessage());
                System.out.println("finalizando programa.");
            }
        }else {
            System.out.println("CEP com quantidade de números invalidos.");
        }
    }
}
