package application;

import java.awt.Desktop;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import com.sun.media.jfxmediaimpl.platform.Platform;

import Models.Erreur1;
import Models.Operation_1;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class SampleController implements Initializable{
	
	@FXML
	private ToggleGroup radio;
	@FXML
	private Button button3,button1,button2,btn1,btn,cont;
	
	public ComboBox<String> exemples;

	@FXML
	private RadioButton Sys,User;

	@FXML
	private Label label;

	@FXML
	private Text affichage,text,textA;

    @FXML
    private ImageView image;
    @FXML
	public TextField r1,r2,r3,n1,n2,n3,n4,n5,n6,p1,p2,p3,p4;
    
    //ouvrire l'aide 
    public void openAide() {
    	try {
    	
			FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Aide.fxml"));
			Parent root2 = (Parent) fxmlLoader.load();
			Stage stage = new Stage();
			stage.setTitle("Aide");
			stage.setScene(new Scene(root2));
			stage.show();
		}
		catch(Exception e) {
			System.out.println(e+"Erreur d'affichage 3");
		}
    }
	
    //ouvrire le mode de fonctionnement 
	public void open_manual(){
		try {
			Desktop.getDesktop().open(new java.io.File("Images/Manuel d'utilisation.pdf"));
			
		} catch (Exception e) {
			System.out.println("there is an error "+e);
		}
		
	}
	
	@FXML
	void handleButtonAction(ActionEvent event) {
		try {
			FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Fenetre_Principale.fxml"));
			Parent root1 = (Parent) fxmlLoader.load();
			Stage stage = new Stage();
			stage.setTitle("S.A.D.E.S");
			stage.setScene(new Scene(root1));
			stage.show();
			//fermer la fenetre bienvenue
			Stage stg = (Stage) label.getScene().getWindow();
			stg.close();
			}
		catch(Exception e) {
				System.out.println(e+"Erreur d'affichage");
			}
	}
	
	@FXML
	void handleButton1Action(ActionEvent event) {
		try {
			FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Choix.fxml"));
			Parent root2 = (Parent) fxmlLoader.load();
			Stage stage = new Stage();
			stage.setTitle("Choix de la tache:Specification du problÃ©me");
			stage.setScene(new Scene(root2));
			stage.show();
			//supprimer la fenetre bienvenue

			Stage stge = (Stage) button1.getScene().getWindow();
			stge.close();

		}
		catch(Exception e) {
			System.out.println(e+"Erreur d'affichage 2");
		}
	}
	//activer et disactiver le combobox
	public void EnableList() {
		exemples.setDisable(false);	
	}
	public void DisableList() {
		exemples.setDisable(true);	
	}
	
	//recuperer le mode selectione par l'utilisateur
	@FXML
	void handleButton2Action(ActionEvent event) {
		try {
			//mode systeme
			if (Sys.isSelected()) {
				exemples.setDisable(false);
				FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Fenetre_Systeme.fxml"));
				Parent root3 = (Parent) fxmlLoader.load();
				System_controller control= fxmlLoader.getController();
				int sel=exemples.getSelectionModel().getSelectedIndex();
				control.initData(sel);
				Stage stage = new Stage();
				stage.setTitle("Mode Systéme");
				stage.setScene(new Scene(root3));
				stage.show();
				Stage stg = (Stage) Sys.getScene().getWindow();
				stg.close();

			}
			//mode utilisateur
			else if(User.isSelected()){
				FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Fenetre_User.fxml"));
				Parent root4 = (Parent) fxmlLoader.load();
				
				Stage stage = new Stage();
				stage.setTitle("Mode Utilisateur");
				stage.setScene(new Scene(root4));
				
				stage.show();
				Stage stg = (Stage) User.getScene().getWindow();
				stg.close();
				


			}else {
				Alert fail = new Alert(Alert.AlertType.ERROR);
				fail.setHeaderText("Erreur");
				fail.setContentText("il faut choisir un mode ");
				fail.setX(900);
				fail.setY(300);
				fail.showAndWait();
			}
		}
		catch(Exception e) {
			System.out.println(e+"Erreur d'affichage");
		}
	}
	
	
	
	public void close() {
		Stage stg = (Stage) r1.getScene().getWindow();
		stg.close();
		
	}
	
	public void CloseAide() {
		Stage stg = (Stage) cont.getScene().getWindow();
		stg.close();
	}
	
	
	@Override
	public void initialize(URL url, ResourceBundle rb) {
		
	}
}
