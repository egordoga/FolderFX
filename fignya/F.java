package fignya;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.io.File;

/**
 * Created by Master on 14.05.2017.
 */
public class F {
    private String name;
    static String path = "F:\\Python";
    static File file = new File(path);

    public F(String name) {
        this.name = name;
    }

    public F() {
    }

    public String getName() {
        return file.getName();
    }

    public void setName(String name) {
        this.name = name;
    }

    public static ObservableList<F> initList() {
        /*String path = "F:\\Python";
        File file = new File(path);*/
        File[] arrFile = file.listFiles();
        ObservableList<F> list = FXCollections.observableArrayList();
        for (File file1 : arrFile) {
            System.out.println(file1.getName());
            list.add(new F(file1.getName()));
        }
        return list;
    }
}