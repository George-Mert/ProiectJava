package org.ieti.MertGeorge;

import org.ieti.MertGeorge.util.FileUtilty;
import org.ieti.MertGeorge.util.Store;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Store Store1= new Store("Primul produs", 25 , 345, false, Arrays.asList(4,5,6));
        Store Store2= new Store("Al doilea produs", 23 ,578, false, Arrays.asList(2,1,3));

        List<Store> Stores= new ArrayList<>();

        Stores.add(Store1);
        Stores.add(Store2);

        FileUtilty.WriteToFile(Stores);
        FileUtilty.readFromFile();
    }
}