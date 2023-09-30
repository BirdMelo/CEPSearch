import Operations.Address;
import Operations.SearchHttp;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner write = new Scanner(System.in);
        System.out.print("CEP: ");
        var cep = write.nextLine();
        SearchHttp search = new SearchHttp();
        Address newAddress = search.http(cep);
        System.out.println(newAddress);
    }
}
