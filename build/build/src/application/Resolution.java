package application;

import java.awt.Desktop;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import com.sun.media.jfxmediaimpl.platform.Platform;

import Models.Exemples;
import Models.Operation_1;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Resolution implements Initializable{
	
	@FXML
	Button cont;
	
  
    @FXML
	public TextField rs1,rs2,rs3,ns1,ns2,ns3,ns4,ns5,ns6,ps1,ps2,ps3,ps4;
    

	public void close() {
		Stage stg = (Stage) cont.getScene().getWindow();
		stg.close();
		
	}
	
// recuperer les valeurs envoyees par les controlleurs syseme et User et les afficher dans les champs du text du page resolution
	public void initData(ArrayList<String> num) {

		ns1.setText(num.get(0));
		ns2.setText(num.get(1));
		ns3.setText(num.get(2));
		ns4.setText(num.get(3));
		ns5.setText(num.get(4));
		ns6.setText(num.get(5));
		Calcule_solution();
		
		
	}

	//calculer et afficher la resolution
	public void Calcule_solution() {
		
		 int v1=Integer.parseInt(ns1.getText());
		 int v2=Integer.parseInt(ns2.getText());
		 int v3=Integer.parseInt(ns3.getText());
		 int v4=Integer.parseInt(ns4.getText());
		 int v5=Integer.parseInt(ns5.getText());
		 int v6=Integer.parseInt(ns6.getText());
		 System.out.println(v1);
		 if(v1<v4) {
				ps1.setText(String.valueOf(v1+10));
				ps2.setText(String.valueOf(v2-1));
				rs1.setText(String.valueOf(Integer.parseInt(ps1.getText())-v4));
				rs2.setText(String.valueOf(Integer.parseInt(ps2.getText())-v5));
				rs3.setText(String.valueOf((v3-v6))); 

				
					if(v2-1<v5) {
						ps3.setText(String.valueOf(v2-1+10));
						ps4.setText(String.valueOf(v3-1));
						rs2.setText(String.valueOf(Integer.parseInt(ps3.getText())-v5));
						rs3.setText(String.valueOf((Integer.parseInt(ps4.getText())-v6)));
							}
			 }
		
			
		 else if(v2<v5) {
				ps3.setText(String.valueOf(v2+10));
				ps4.setText(String.valueOf(v3-1));
				rs1.setText(String.valueOf(v1-v4));
				rs2.setText(String.valueOf(Integer.parseInt(ps3.getText())-v5));
				rs3.setText(String.valueOf((Integer.parseInt(ps4.getText())-v6)));}

			
		else {
				rs1.setText(String.valueOf(v1-v4));
				rs2.setText(String.valueOf(v2-v5));
				rs3.setText(String.valueOf((v3-v6)));
			}
			
			
		
	}
	
	public void CloseReso() {
		Stage stg = (Stage) cont.getScene().getWindow();
		stg.close();
	}

   
	@Override
	public void initialize(URL url, ResourceBundle rb) {
		
	}
}
