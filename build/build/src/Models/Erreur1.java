package Models;

import java.util.ArrayList;

public class Erreur1 extends Operation_1{

	
	

	public Erreur1(ArrayList<Integer> row1, ArrayList<Integer> row2, ArrayList<Integer> res, ArrayList<Integer> emp) {
		super(row1, row2, res, emp);
	}

	
	public ArrayList<String> afficher2() {
		ArrayList<String> ereur = new ArrayList<String>();
		ereur.add("Vous avez utilisé une conception peut etre correcte dans certain cas particulier, mais malheureusement pas dans ce cas\n:Regarder la dispositions des chiffres, ou utiliser l'emprunt si c'est possible\n");
		for(int i=0;i<2;i++) {
			
			if(super.row1.get(i)==1 && super.row2.get(i)!=0) {
				
				if(super.res.get(i)==0) {
					
					ereur.add("On ne peut pas avoir 0 comme resultat dans la colonne "+(i+1)+" pour cette opération\n0 c'est l'emprunt et non pas le résultat\n:mettez 0 dans l'emprunt et non pas dans le resultat\n");
				
				}
			}
			if(super.row1.get(i)==1) {
				if(super.row2.get(i) == super.res.get(i)) {
					ereur.add("On ne peut pas écrire le nombre en bas, de la colonne "+(i+1)+", comme résultat si on a un emprunt égale à 0, On doit encore emprunter\n:Si vous avez un emprunt egale 0 et qu'il est inferieur au nombre ci-dessous alors il faut emprunter à nouveau(0+10)");
				}
			}
			if(super.row1.get(i)==1) {
				if(super.res.get(i)==9-super.row2.get(i)) {
					ereur.add("On ne peut pas changer ce 1 en 9\n:Quand vous emprunter d'un 1 il faut le diminuer (1-1) et ensuit s'il est inferieur au nombre ci-dessous alors il faut emprunter à nouveau(0+10)");
				}
			}
			
			
		}
		
		if(super.row1.get(1)==1) {
			if(super.empr.get(2)==9) {
				ereur.add("On ne peut pas considèrer ce 1, de la colonne 2 comme un 10, alors il faut décrémenter le 1 en un 0\n:Quand vous emprunter d'un 1 il faut le diminuer (1-1) et ensuit s'il est inferieur au nombre ci-dessous alors il faut emprunter à nouveau(0+10)");
			}
		}
		if(super.row1.get(0)==1) {
			if(super.empr.get(0)==10) {
				ereur.add("Il ne faut pas changer le 1 en 10 mais il faut lui ajouter 10\n:Pensez à ajouter un 10 à 1 pour l'emprunt");
			}
		}
		if(super.row1.get(1)==1) {
			if(super.empr.get(1)==10 && super.empr.get(2)!=0) {
				ereur.add("Il ne faut pas changer le 1 en 10 mais il faut lui ajouter 10\n:Pensez à ajouter un 10 à 1 pour l'emprunt");
			}
		}
		if(super.row1.get(1)==1 && super.res.get(1)==11) {
			ereur.add("Il ne faut pas changer ce 1 en un 11, mais il faut le décrémenter\n:Pensez à decrémenter, utiliser l'emprunt");
		}
		if(super.row1.get(1)==0 && super.row2.get(1)==0 && super.res.get(1)==0) {
			if(super.empr.get(0)!=0 && super.row1.get(2)-1-super.row2.get(2) != super.res.get(2)) {
				ereur.add("Il faut emprunter sur le 0 au-dessus il faut aussi diminuer la colonne à gauche par un emprunt\n:essayez d'emprunter sur un 0 au-dessus d’un autre 0");
			}
		}
		if(super.row1.get(1)==0 && super.row2.get(1)==0 && super.res.get(1) !=0) {
			if(super.empr.get(0)!=0) {
				ereur.add("Il faut emprunter sur le 0 au-dessus, au lieu de le changer et il faut aussi diminuer la colonne à gauche par un emprunt\n:essayez d'emprunter sur un 0 au-dessus d’un autre 0 et diminuer la colonne à gauche par un emprunt");
			}
		}
		if(super.row1.get(1)==0 && super.row2.get(1)==0 && super.res.get(1)==0) {
			if(super.empr.get(1)!=0 && super.empr.get(2)!=0 && super.empr.get(0) != 0 && super.row1.get(2)-1-super.row2.get(2)==super.res.get(2)) {
				ereur.add("Il ne faut pas sauter la colonne 2, il faut calculer le résultat en utilisant les emprunts de la colonne 2 aussi\n:utiliser l'emprunt dans la colonne 2 et n'oublier pas à diminuer la colonne à gauche par un emprunt");
			}
		}
		if(super.row1.get(2)!=0 && super.row1.get(1)==0) {
			if(super.row2.get(1)==0 && super.row2.get(2)==0 && super.res.get(2)==0 && super.empr.get(0)!=0 && super.row1.get(2)-1==super.res.get(1)) {
				ereur.add("Il faut prendre en consideration la colonne où il y a le 0\n:n'oublier pas la colonne où il y a 0");
			}
		}
		if(super.row1.get(0)<super.row2.get(0)) {
			if(super.empr.get(0)!=0 && super.res.get(0) == super.row2.get(0)-super.row1.get(0)){
				ereur.add("Vous avez généralisé une conception correcte dans certain cas particuliers\nVous ne respectez pas les dispositions des chiffres de la colonne traitée\n:Regarder la dispositions des chiffres, et utiliser l'emprunt");
			}
		}
		if(super.row1.get(1)<super.row2.get(1)) {
			if(super.empr.get(1)!=0 && super.res.get(1) == super.row2.get(1)-super.row1.get(1)){
				ereur.add("Vous avez généralisé une conception correcte dans certain cas particuliers\nVous ne respectez pas les dispositions des chiffres de la colonne traitée\n:Regarder la dispositions des chiffres, et utiliser l'emprunt");
			}
		}
		return ereur;
		
	}
	
	
	
	

}
