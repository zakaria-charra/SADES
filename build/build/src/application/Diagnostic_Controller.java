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

public class Diagnostic_Controller{
	
	@FXML
	public Text diagtxt;
	
	@FXML
	public Button closeDiag;
	
	public String sp;
	
	//recuperer l'aide correspondant a l'erreur generée
	public String getAide(String aide) {
		sp=aide;
		return sp;
	}
	//recuperer le diagnostic correspondant a l'erreur generée
	public void getData(String st) {
		diagtxt.setText(st);
	}
	
	//fermer la page du diagnostic
	public void closeD() {
		Alert message =new Alert(Alert.AlertType.CONFIRMATION);
		 message.setTitle("Message");
		 message.setHeaderText("Voulez vous afficher l'aide correspondant?");
		 message.setX(690);
		 message.setY(300);
		 Stage stg = (Stage) closeDiag.getScene().getWindow();
		 stg.close();
			Optional<ButtonType> re = message.showAndWait();
			 if(re.get() == ButtonType.OK) {
				 try {
					 //afficher l'aide correspondant 
						FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Aide_erreur.fxml"));
						Parent root = (Parent) fxmlLoader.load();
						Aide_Controller control=fxmlLoader.getController();
						control.getData(sp);
						Stage stage = new Stage();
						stage.setTitle("Aide");
						stage.setScene(new Scene(root));
						stage.show();
				 }
					
					catch(Exception e) {
						System.out.println(e+"Erreur d'affichage");
					}
			 }
		
		
    }
		
	}
	


