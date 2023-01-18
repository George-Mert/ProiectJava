package org.ieti.MertGeorge.util;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FileUtilty {


    private static final String PATH_TO_FILE ="src/main/java/org/ieti/MertGeorge/StoreList.json" ;

    public static void WriteToFile(List<Store> StoreList) {
        File file = new File("src/main/java/org/ieti/MertGeorge/StoreList.json");
        ObjectMapper mapper = new ObjectMapper();
        ObjectWriter writer = mapper.writer(new DefaultPrettyPrinter());



        try {
            writer.writeValue(file, StoreList);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static void readFromFile(){
        ObjectMapper mapper= new ObjectMapper();
        Path path = Paths.get(PATH_TO_FILE);
        byte[] bytes= new byte[0];

        try{
            bytes= Files.readAllBytes(path);

        } catch (IOException e) {
            e.printStackTrace();
        }
        String json=new String(bytes);
        try{
            List<Store> stores = mapper.readValue(json, new TypeReference<List<Store>>(){});
            System.out.println(stores.get(1).getProduct());
        } catch(IOException e)
        {
            e.printStackTrace();
        }

    }
}
