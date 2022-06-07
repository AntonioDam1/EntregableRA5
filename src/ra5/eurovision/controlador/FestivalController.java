package ra5.eurovision.controlador;


import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

//Antonio
public class FestivalController {
    @FXML
    private CheckBox checkBox;

    @FXML
    private TextArea txtArea;

    @FXML
    private TextField txtField;

    public FestivalController() {

    }



    @FXML
    void salir(ActionEvent event) {
        Platform.exit();
    }



    private void cogerFoco() {
//        txtPais.requestFocus();
//        txtPais.selectAll();

    }

    @FXML
    void clear(ActionEvent event) {
//        areaTexto.setText("");
//        cogerFoco();

    }

}

