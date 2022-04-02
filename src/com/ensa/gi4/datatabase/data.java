package com.ensa.gi4.datatabase;

import java.util.ArrayList;

import com.ensa.gi4.modele.Chaise;
import com.ensa.gi4.modele.Livre;

public class data {




public ArrayList<Livre> livres = new ArrayList<Livre> ();  ;




public ArrayList<Chaise> chaises= new ArrayList<Chaise> (); 

public data() {
	Livre l1 = new Livre();
	Livre l2 = new Livre();



	Chaise c1=new Chaise();
	Chaise c2=new Chaise();
	 
	l1.setName("l1");
	l1.setType(1);
	l2.setName("l2");
	l2.setType(2);
	livres.add(l1);
	livres.add(l2);
	
	c1.setName("c1");
	c1.setType(2);
	chaises.add(c1);
	
}
}






	

