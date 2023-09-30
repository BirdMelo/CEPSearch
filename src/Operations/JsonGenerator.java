package Operations;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;

public class JsonGenerator {
    public void save(Address address) throws IOException {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        FileWriter writer = new FileWriter(String.format("src/%s.json", address.cep()));
        writer.write(gson.toJson(address));
        writer.close();
    }
}
