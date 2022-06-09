package ra5.eurovision.controlador;


import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.FileChooser;
import ra5.eurovision.modelo.Festival;
import ra5.eurovision.modelo.PaisExcepcion;

import java.io.File;

//Antonio
public class FestivalController {
    @FXML
    private CheckBox checkBox;

    @FXML
    private TextArea txtArea;

    @FXML
    private TextField txtField;

    private Festival fest;

    public FestivalController() {
        fest = new Festival();
    }
    @FXML
    void leerVotaciones(ActionEvent event){
        FileChooser selector = new FileChooser();
        selector.setTitle("Abrir fichero de datos");
        selector.setInitialDirectory(new File("."));
        selector.getExtensionFilters()
                .addAll(new FileChooser.ExtensionFilter("puntuaciones",
                        "*.txt"));
        File f = selector.showOpenDialog(null);
        if (f != null) {
            int errores = fest.leerPuntuaciones(f.getAbsolutePath());
            txtArea.setText("Los errores son" + errores);
        }
    }

    @FXML
    void mostrarPuntosPais(ActionEvent event){
        try {
            txtArea.setText(fest.puntuacionDe(txtField.getText())+"");
        } catch (PaisExcepcion e) {
            txtArea.setText(e.getMessage());
        }
    }
    @FXML
    void mostrarGanador(ActionEvent event){
        
    }
    @FXML
    void salir(ActionEvent event) {
        Platform.exit();
    }



    private void cogerFoco() {
        txtField.requestFocus();
        txtField.selectAll();

    }

    @FXML
    void clear(ActionEvent event) {
        txtArea.setText("");
        cogerFoco();

    }

}

