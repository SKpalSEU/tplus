/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbdemo;

import java.net.URL;
import java.util.ResourceBundle;
import static javafx.collections.FXCollections.observableList;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

/**
 *
 * @author subrato
 */
public class FXMLDocumentController implements Initializable {
    
   
    @FXML
    private ListView<Student> studentListView;
    private ObservableList<Student>studentList;
    private final String HOST = "localhost";
    private final String HOST = "localhost";
    private final String HOST = "localhost";
    private final String HOST = "localhost";
    @FXML
    private TextField nameFild;
    @FXML
    private TextField idFild;
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void handleAddNewAction(ActionEvent event) {
    }
    
}
