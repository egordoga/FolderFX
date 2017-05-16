package model;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.io.File;
import java.time.LocalDateTime;

public class MyFile {
    /*String path = "F:\\Python";
    File file = new File(path);*/

    private String name;
    private long size;
    private long dateChange;

    public MyFile(String name, long size, long dateChange) {
        this.name = name;
        this.size = size;
        this.dateChange = dateChange;
    }

    public MyFile() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getSize() {
        return size;
    }

    public void setSize(long size) {
        this.size = size;
    }

    public long getDateChange() {
        return dateChange;
    }

    public void setDateChange(long dateChange) {
        this.dateChange = dateChange;
    }

    private ObservableList<MyFile> initList(String path) {
        //String path = "F:\\Python";
        File file = new File(path);
        File[] arrFile = file.listFiles();
        ObservableList<MyFile> list = FXCollections.observableArrayList();
        for (File file1 : arrFile) {
            list.add(new MyFile(file1.getName(), file1.length(), file1.lastModified()));
        }
        return list;
    }
}
