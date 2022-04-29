package com.ensa.gi4.datatabase;

import java.util.ArrayList;

import com.ensa.gi4.modele.Chaise;
import com.ensa.gi4.modele.Livre;

public class data {




public ArrayList<Livre> livres;
Livre livre1;
Livre livre2 ;




public ArrayList<Chaise> chaises; 
Chaise c1;
Chaise c2;

public data() {}

public Livre getLivre1() {
	return livre1;
}

public Livre getLivre2() {
	return livre2;
}

public void setLivre1(Livre livre1) {
	this.livre1 = livre1;
}

public void setLivre2(Livre livre2) {
	this.livre2 = livre2;
}

public ArrayList<Livre> getLivres() {
	return livres;
}


public ArrayList<Chaise> getChaises() {
	return chaises;
}

public void setLivres(ArrayList<Livre> livres) {
	this.livres = livres;
}

public void setChaises(ArrayList<Chaise> chaises) {
	this.chaises = chaises;
}
}






	

