package application;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class SampleController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private AnchorPane anchor1;

    @FXML
    private Label label1;

    @FXML
    private Label label2;

    @FXML
    private Label label3;

    @FXML
    private Label label4;

    @FXML
    private TextField v1;

    @FXML
    private Button btn_calc;

    @FXML
    private Button btn_clr;

    @FXML
    private TextField v2;

    @FXML
    private TextField t;

    @FXML
    private Label label5;

    @FXML
    private Label label6;

    @FXML
    void btn_calc_click(ActionEvent event) {
    	double speed1, speed2, time;
    	speed1= Double.parseDouble(v1.getText());
    	speed2= Double.parseDouble(v2.getText());
    	time= Double.parseDouble(t.getText());
    	
    	double result=(speed1-speed2)*time;
    	
    	if(result<0)
    	{
    		result=Math.abs(result);
    	}
    	label6.setText(String.valueOf(result)+"km");
    	Double.toString(result);
    	

    }

    @FXML
    void btn_clr_click(ActionEvent event) {
    	label6.setText("...km");
    	v1.setText("");
    	v2.clear();
    	t.setText("");

    }

    @FXML
    void initialize() {
        assert anchor1 != null : "fx:id=\"anchor1\" was not injected: check your FXML file 'Sample.fxml'.";
        assert label1 != null : "fx:id=\"label1\" was not injected: check your FXML file 'Sample.fxml'.";
        assert label2 != null : "fx:id=\"label2\" was not injected: check your FXML file 'Sample.fxml'.";
        assert label3 != null : "fx:id=\"label3\" was not injected: check your FXML file 'Sample.fxml'.";
        assert label4 != null : "fx:id=\"label4\" was not injected: check your FXML file 'Sample.fxml'.";
        assert v1 != null : "fx:id=\"v1\" was not injected: check your FXML file 'Sample.fxml'.";
        assert btn_calc != null : "fx:id=\"btn_calc\" was not injected: check your FXML file 'Sample.fxml'.";
        assert btn_clr != null : "fx:id=\"btn_clr\" was not injected: check your FXML file 'Sample.fxml'.";
        assert v2 != null : "fx:id=\"v2\" was not injected: check your FXML file 'Sample.fxml'.";
        assert t != null : "fx:id=\"t\" was not injected: check your FXML file 'Sample.fxml'.";
        assert label5 != null : "fx:id=\"label5\" was not injected: check your FXML file 'Sample.fxml'.";
        assert label6 != null : "fx:id=\"label6\" was not injected: check your FXML file 'Sample.fxml'.";

    }
}
