package fignya;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.io.File;
import java.util.Collection;

/**
 * Created by Master on 13.05.2017.
 */
public class TVDemo extends Application {

    String path = "F:\\Python";
    File file = new File(path);
    @FXML
    private TableColumn<File,String> name;

    //ObservableList<File> list = FXCollections.observableArrayList();
    @Override
    public void start(Stage stage) throws Exception {

        TableView<File> table = new TableView<>();

        // Create column UserName (Data type of String).
        TableColumn<File, String> userNameCol //
                = new TableColumn("name");

        // Create column Email (Data type of String).
       TableColumn emailCol//
                = new TableColumn("Email");

        // Create column FullName (Data type of String).
        /*TableColumn<UserAccount, String> fullNameCol//
                = new TableColumn<UserAccount, String>("Full Name");

        // Create 2 sub column for FullName.
        TableColumn<UserAccount, String> firstNameCol //
                = new TableColumn<UserAccount, String>("First Name");

        TableColumn<UserAccount, String> lastNameCol //
                = new TableColumn<UserAccount, String>("Last Name");

        // Add sub columns to the FullName
        fullNameCol.getColumns().addAll(firstNameCol, lastNameCol);

        // Active Column
        TableColumn<File, Boolean> activeCol//
                = new TableColumn<File, Boolean>("Active");*/

        userNameCol.setCellValueFactory(new PropertyValueFactory<File, String>("name"));

        ObservableList<File> list = initList();
        //initList();
        for (File file1 : list) {
            System.out.println(file1);
        }
        table.setItems(list);


        table.getColumns().addAll( userNameCol, emailCol/*, fullNameCol, activeCol*/);

        StackPane root = new StackPane();
        root.setPadding(new Insets(5));
        root.getChildren().add(table);

        stage.setTitle("TableView (o7planning.org)");

        Scene scene = new Scene(root, 450, 300);
        stage.setScene(scene);
        stage.show();
    }

    private ObservableList<File> initList(){
        File[] arrFile = file.listFiles();
        ObservableList<File> list = FXCollections.observableArrayList();
        for (File file1 : arrFile) {
            list.add(file1);
        }
        return list;
    }

    public static void main(String[] args) {
        launch(args);
    }
    }

