package fignya;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.File;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Proba extends Application{

    /*String path = "F:\\Python";
    File file = new File(path);

    ObservableList<File> list = FXCollections.observableArrayList();
    @FXML
            private TableView<File> tableFiles;

    @FXML
            private TableColumn<File, String> columnFile;

    @FXML
    private void initialize(){
        initList();
        columnFile.setCellValueFactory(new PropertyValueFactory<File, String>("columnFile"));
       // this.columnFile.setCellValueFactory(c -> c.getValue().getName());
        tableFiles.setItems(list);
    }*/

    @Override
    public void start(Stage primaryStage) throws Exception {

        Parent root = FXMLLoader.load(getClass().getResource("first.fxml"));
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }

  /*  private void initList(){
        File[] arrFile = file.listFiles();
        for (File file1 : arrFile) {
            list.add(file1);
        }
    }*/

    public static void main(String[] args) {
        launch(args);
    }
}
