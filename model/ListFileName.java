package model;

import java.io.File;
import java.util.Arrays;

/**
 * Created by Master on 11.05.2017.
 */
public class ListFileName {

    private String path = "F:\\Python\\Java";
    File file = new File(path);

    private File[] arrFiles = file.listFiles();

    private void print(){
        Arrays.stream(arrFiles).map(p -> p.getName()).forEach(System.out::println);
    }


    public static void main(String[] args) {
      ListFileName listFileName = new ListFileName();
      listFileName.print();
    }
}
