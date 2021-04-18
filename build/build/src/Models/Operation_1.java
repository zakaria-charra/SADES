package Models;

import java.util.ArrayList;

public class Operation_1 {
	
	public ArrayList<Integer> row1,row2;
	public ArrayList<Integer> res;
	public ArrayList<Integer> empr;
	public int nb_haut,nb_bas,resT;
	
	public Operation_1() {	
	}
	public Operation_1(ArrayList<Integer> row1, ArrayList<Integer> row2) {
		this.row1 = row1;
		this.row2 = row2;
		
	}
	
	
	public Operation_1(ArrayList<Integer> row1, ArrayList<Integer> row2, ArrayList<Integer> res) {
		super();
		this.row1 = row1;
		this.row2 = row2;
		this.res = res;
	}
	public Operation_1(ArrayList<Integer> row1, ArrayList<Integer> row2, ArrayList<Integer> res,
			ArrayList<Integer> empr) {
		this.row1 = row1;
		this.row2 = row2;
		this.res = res;
		this.empr = empr;
	}
	public int getNb_haut() {
		return this.row1.get(0)+10*this.row1.get(1)+ 100*this.row1.get(2);
	}

	
	public int getNb_bas() {
		return this.row2.get(0)+10*this.row2.get(1)+ 100*this.row2.get(2);
	}

	public int getResT() {
		return this.getNb_haut()-this.getNb_bas();
	}
	
	public String afficher() {
		return
		"------------------------------\nNombre du haut : "+this.getNb_haut()+
		"\nNombre du bas : "+this.getNb_bas()+
		"\nRésultat réel : "+this.getResT();
	}
	
}
