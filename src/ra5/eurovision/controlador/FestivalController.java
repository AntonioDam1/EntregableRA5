package ra5.eurovision.controlador;


import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
//Antonio Aguilera
public class FestivalController {


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

