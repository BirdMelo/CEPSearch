import Operations.Address;
import Operations.SearchHttp;

public class Main {
    public static void main(String[] args){
        SearchHttp search = new SearchHttp();
        Address newAddress = search.http("71645110");
        System.out.println(newAddress);
    }
}
