package application;

import java.util.Optional;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Aide_Controller{
	
	@FXML
	public Text aideText;
	
	@FXML
	
	public Button closeAidE;
	

	public String sp;
	
	public void CloseAd() {
		Stage stg = (Stage) closeAidE.getScene().getWindow();
		stg.close();
	}

	public void getData(String st) {
		aideText.setText(st);
	}
	
	
		
		
    }
		
	


