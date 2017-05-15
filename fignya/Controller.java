package fignya;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.File;

/**
 * Created by Master on 13.05.2017.
 */
public class Controller {
    String path = "F:\\Python";
    File file = new File(path);
    ObservableList<File> list = FXCollections.observableArrayList();
    @FXML
    private TableView<File> tableFiles;

    @FXML
    private TableColumn<File, String> columnFile;

    @FXML
    private void initialize(){
        initList();
        list.stream().forEach(System.out::println);
        columnFile.setCellValueFactory(new PropertyValueFactory<File, String>("columnFile"));
        // this.columnFile.setCellValueFactory(c -> c.getValue().getName());
        tableFiles.setItems(list);
    }

    private void initList(){
        File[] arrFile = file.listFiles();
        for (File file1 : arrFile) {
            list.add(file1);
        }
    }


}
