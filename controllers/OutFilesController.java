package controllers;

import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import model.MyFile;

public class OutFilesController {
    @FXML
    private TableView tableMain;
    @FXML
    private TableColumn<MyFile, String> colName;
    @FXML
    private TableColumn<MyFile, String> colSize;
    @FXML
    private TableColumn<MyFile, String> colDateChange;

}
