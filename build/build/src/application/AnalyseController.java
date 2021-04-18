package application;

import java.io.File;

import com.sun.org.apache.bcel.internal.classfile.Field;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class AnalyseController{
	@FXML
	public Text antxt;
	
	@FXML
	public ImageView imgAnalyse;
	
	String err="",aid="";
	
	@FXML
	public Button anbut;
	
	//recuperer l'analyse correspondant a l'erreur generée
	public void getData(String st) {
		antxt.setText(st);
		
	}
	//recuperer le Diagnostic et l'aide correspondant a l'erreur generée pour le transmettre vers le controlleur Diagnostic
	public String getDiagno(String st,String aide) {
		err=st;
		aid=aide;
		return err;
	}
	
	
    @FXML
    void ouvrirDiagno() {
    	try {
			FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Diagnostic.fxml"));
			Parent root = (Parent) fxmlLoader.load();
			String s=err,ad=aid;
			//transmettre le diagnostic et l'aide correspondant vers le controlleur Diagnostic
			Diagnostic_Controller control=fxmlLoader.getController();
			control.getData(s);
			control.getAide(ad);
			Stage stage = new Stage();
			stage.setTitle("Diagnostic");
			stage.setScene(new Scene(root));
			stage.show();
			Stage stg = (Stage) anbut.getScene().getWindow();
			stg.close();
		}
		catch(Exception e) {
			System.out.println(e+"Erreur d'affichage");
		}
    }
}
