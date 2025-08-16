package Ninterface.test;

import Ninterface.Domain.DatabaseLoader;
import Ninterface.Domain.FileLoader;

public class DataLoaderTest01 {
    public static void main(String[] args) {
        DatabaseLoader base = new DatabaseLoader();
        FileLoader file = new FileLoader();
        file.load();
        base.load();

        System.out.println("------------");

        base.remove();
        file.remove();

        System.out.println("------------");

        base.checkPermission();
        file.checkPermission();
    }

}
