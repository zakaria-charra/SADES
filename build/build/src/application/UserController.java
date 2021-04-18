package application;

	import java.awt.Desktop;
import java.net.URL;
	import java.util.ArrayList;
import java.util.Optional;
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
	import javafx.scene.control.Alert;
	import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.Alert.AlertType;
	import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import javafx.scene.text.Text;
	import javafx.stage.Stage;

	public class UserController implements Initializable{
		@FXML
		private Button button,button3,btn,felb,btn1,button2,button1,anbut;
		@FXML
		private ToggleGroup radio;
	
		@FXML
		private RadioButton Sys,User;
		
		@FXML
		private Label label;

		@FXML
		 private Text affichage, felt, antxt, diagtxt,text;

	    @FXML
	    private ImageView image;
	    @FXML
		public TextField r1,r2,r3,n1,n2,n3,n4,n5,n6,p1,p2,p3,p4;
	    
	    public ArrayList<String> list;

	    
	    
		public void open_solution() {
			
	    	try {
				FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Resolution.fxml"));
				Parent root2 = (Parent) fxmlLoader.load();
				Resolution control= fxmlLoader.getController();
				list=new ArrayList<String>();
				list.add(n1.getText());
				list.add(n2.getText());
				list.add(n3.getText());
				list.add(n4.getText());
				list.add(n5.getText());
				list.add(n6.getText());
				control.initData(list);
				Stage stage = new Stage();
				stage.setTitle("Resolution");
				stage.setScene(new Scene(root2));
				stage.show();
				

			}
			catch(Exception e) {
				System.out.println(e+"Erreur d'affichage 4");
			}
	    }
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
				System.out.println(e+"Erreur d'affichage ");
			}
	    }
		
		public void open_manual(){
			try {
				Desktop.getDesktop().open(new java.io.File("Images/Manuel d'utilisation.pdf"));
				
			} catch (Exception e) {
				System.out.println("there is an error "+e);
			}
			
		}
	    
	    @FXML
		void handleButton1Action(ActionEvent event) {
			try {
				FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Choix.fxml"));
				Parent root2 = (Parent) fxmlLoader.load();
				Stage stage = new Stage();
				stage.setTitle("Choix de la tache:Spécification du problème");
				stage.setScene(new Scene(root2));
				stage.show();
				//supprimer la fenetre bienvenue

				Stage stge = (Stage) button1.getScene().getWindow();
				stge.close();

			}
			catch(Exception e) {
				System.out.println(e+"Erreur d'affichage");
			}
		}
	    
	    @FXML
	    void fermer(ActionEvent event) {
	    	Stage stg = (Stage) felt.getScene().getWindow();
			stg.close();
	    }
	    

	    
	 
		
	    @FXML
		public void calcule(ActionEvent event) {
			if (n1.getText().trim().isEmpty() || n4.getText().trim().isEmpty()) {
				Alert fail = new Alert(Alert.AlertType.ERROR);
				fail.setHeaderText("Erreur");
				fail.setContentText("il faut remplir les premier champs");
				fail.setX(690);
				fail.setY(300);
				fail.showAndWait();}

			
			if (n2.getText().trim().isEmpty()) {
				n2.setText(String.valueOf(0));
			}
			if(n5.getText().trim().isEmpty()) {
				n5.setText(String.valueOf(0));
			}
			if (n3.getText().trim().isEmpty()) {
				n3.setText(String.valueOf(0));
			}
			if(n6.getText().trim().isEmpty()) {
				n6.setText(String.valueOf(0));
			}
			
			if(p1.getText().trim().isEmpty()) {
				p1.setText(String.valueOf(0));
			}
			if(p2.getText().trim().isEmpty()) {
				p2.setText(String.valueOf(0));
			}
			if(p3.getText().trim().isEmpty()) {
				p3.setText(String.valueOf(0));
			}
			if(p4.getText().trim().isEmpty()) {
				p4.setText(String.valueOf(0));
			}
			if(r2.getText().trim().isEmpty()) {
				r2.setText(String.valueOf(0));
			}
			if(r3.getText().trim().isEmpty()) {
				r3.setText(String.valueOf(0));
			}
			
			if(r1.getText().trim().isEmpty() || r2.getText().trim().isEmpty() || r3.getText().trim().isEmpty()) {
				Alert fail = new Alert(Alert.AlertType.ERROR);
				fail.setHeaderText("Erreur");
				fail.setContentText("Veuillez faire votre opération de soustraction SVP");
				fail.setX(690);
				fail.setY(300);
				fail.showAndWait();
			}
			
			 int v1=Integer.parseInt(n1.getText());
			 int v2=Integer.parseInt(n2.getText());
			 int v3=Integer.parseInt(n3.getText());
			 int v4=Integer.parseInt(n4.getText());
			 int v5=Integer.parseInt(n5.getText());
			 int v6=Integer.parseInt(n6.getText());
			 
			 int nb_h = v1+10*v2+100*v3;
			 int nb_b = v4+10*v5+100*v6;
			 
			 if(nb_h<nb_b) {
				 Alert message =new Alert(Alert.AlertType.INFORMATION);
				 message.setTitle("Probleme");
				 message.setContentText("le nombre du haut est inferieure au nombre du bas!!!");
				 message.setHeaderText("Attention!!");
				 message.setX(690);
				 message.setY(300);
				 message.show();
			 }
			 

			 int rs1=Integer.parseInt(r1.getText());
			 int rs2=Integer.parseInt(r2.getText());
			 int rs3=Integer.parseInt(r3.getText());
			 
			 int e1 = Integer.parseInt(p1.getText());
			 int e2 = Integer.parseInt(p2.getText());
			 int e3 = Integer.parseInt(p3.getText());
			 int e4 = Integer.parseInt(p4.getText());
			 ArrayList<Integer> ep = new ArrayList<Integer>();
			 ep.add(e1);
			 ep.add(e2);
			 ep.add(e3);
			 ep.add(e4);
			 int rest = rs1 + 10*rs2 + 100*rs3;
			String st = "\nVotre reponse : "+rest;

			 ArrayList<Integer> res=new ArrayList<Integer>();
			 res.add(rs1);
			 res.add(rs2);
			 res.add(rs3);
			 ArrayList<Integer> nbh=new ArrayList<Integer>();
			 nbh.add(v1);
			 nbh.add(v2);
			 nbh.add(v3);
			 ArrayList<Integer> nbb=new ArrayList<Integer>();
			 nbb.add(v4);
			 nbb.add(v5);
			 nbb.add(v6);
			 
			 Erreur1 err=new Erreur1(nbh, nbb, res, ep);
			 String sp[],s="",aid="";
			 
			 for(int i=0;i<err.afficher2().size();i++) {
				 sp=err.afficher2().get(i).split(":");
				 
				 s=s+""+sp[0];
				 aid=aid+""+sp[1];
		
			 }
			
			 
			 Operation_1 op=new Operation_1(nbh,nbb);
			 
				String sp1 = "";
				String sp2 = "";
				String str = "Le résultat juste est : "+op.getResT()+" Essaie de faire attention pour tes prochaines opérations aux erreurs suivantes :";
				String sp3 = "";
				String sp4 = "";
				String sp5 = "";
				String sp6 = "";
			 if(v1<v4) {
				 int ph1 = Integer.parseInt(p1.getText());
				 int pb1 = Integer.parseInt(p3.getText());

					if (op.getResT() != rest) {
						//Alert message =new Alert(Alert.AlertType.INFORMATION);
						
						
						if(ph1 != op.row1.get(0)+10) {
							sp1 = "\n * Erreur dans l'emprunt de l'unité du nombre en haut";
						}
						if(pb1 != op.row1.get(1)-1) {
							sp2 = "\n * Erreur dans l'emprunt en bas du dizaine du nombre en haut";
						}
						affichage.setText(op.afficher()+st);
				
						
					}
					

				
					if(v2-1<v5) {
						
						int ph2 = Integer.parseInt(p2.getText());
						int pb2 = Integer.parseInt(p4.getText());
						 if(op.getResT() != rest) {
							 //Alert message =new Alert(Alert.AlertType.INFORMATION);
							
							 if(ph2 != op.row1.get(1)-1+10) {
								 sp3 = "\n * Erreur dans l'emprunt en haut du dizaine du nombre en haut";
							 }
							 if(pb2 != op.row1.get(2)-1) {
								 sp4 = "\n * Erreur dans l'emprunt en bas du centaine du nombre en haut";
							 }
							 affichage.setText(op.afficher()+st);
						
						 }
						
					}
			 }
				
			 else if(v2<v5) {
					
				 	int ph2 = Integer.parseInt(p2.getText());
				 	int pb2 = Integer.parseInt(p4.getText());
					if(op.getResT() != rest) {
						
						if(ph2 != op.row1.get(1)+10) {
							sp5 = "\n * Erreur dans l'emprunt en haut du dizaine du nombre en haut";
						}
						if(pb2 != op.row1.get(2)-1) {
							sp6 = "\n * Erreur dans l'emprunt en bas du centaine du nombre en haut";
						}
						affichage.setText(op.afficher()+st);
						
					}
				
			}

				
			else {
					if(op.getResT() != rest) {
						
						affichage.setText(op.afficher()+st);
						
					}
				
			
					}
			 
			if(op.getResT()==rest) {
					affichage.setText(op.afficher()+st);
					try {
						FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Felicitation.fxml"));
						Parent root = (Parent) fxmlLoader.load();
						Stage stage = new Stage();
						stage.setTitle("Analyse");
						stage.setScene(new Scene(root));
						stage.show();
					}
					catch(Exception e) {
						System.out.println(e+"Erreur d'affichage");
					}
				}
				
			 
			else {

				Alert message =new Alert(Alert.AlertType.INFORMATION);
				 message.setTitle("Message");
				 message.setContentText("Votre résultat est faux\nSi vous voulez faire l'analyse cliquez sur 'Ok'");
				 message.setHeaderText("Attention!!");
				 message.setX(690);
				 message.setY(300);
					Optional<ButtonType> re = message.showAndWait();
					 if(re.get() == ButtonType.OK) {
						 try {
								FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Analyse.fxml"));
								Parent root = (Parent) fxmlLoader.load();
								AnalyseController control=fxmlLoader.getController();
								control.getData(str+sp1+sp2+sp3+sp4+sp5+sp6);
								control.getDiagno(s,aid);
								Stage stage = new Stage();
								stage.setTitle("Analyse");
								stage.setScene(new Scene(root));
								stage.show();
							}
							catch(Exception e) {
								System.out.println(e+"Erreur d'affichage");
							}
					 }}
			
				
				
			
		}
		
		public void close() {
			Stage stg = (Stage) r1.getScene().getWindow();
			stg.close();
			
		}
		
		
		   //accepter just les nombres
	    public void keyTaped(KeyEvent event) {
	    	char c= event.getCharacter().charAt(0);
	    	
	    	if(!(Character.isDigit(c))) {
	    		event.consume();
	    	}
	    	
	    }
		@Override
		public void initialize(URL url, ResourceBundle rb) {
			
		}
}
