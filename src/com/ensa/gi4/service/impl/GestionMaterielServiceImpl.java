package com.ensa.gi4.service.impl;

import com.ensa.gi4.modele.Chaise;
import com.ensa.gi4.modele.Livre;
import com.ensa.gi4.modele.Materiel;
import com.ensa.gi4.service.api.GestionMaterielService;

import java.io.Console;
import java.util.Scanner;

import com.ensa.gi4.datatabase.data;
public class GestionMaterielServiceImpl implements GestionMaterielService {
    // bd goes here
	data bd;
    public data getBd() {
		return bd;
	}

	public void setBd(data bd) {
		this.bd = bd;
	}

	@Override
    public void init() {
        System.out.println("inititialisation du service");
        
    }

    @Override
    public void listerMateriel() {

        System.out.println("Liste de matériel :\n"+ bd.livres.size() +"  Livres \n et "+  bd.chaises.size()+" chaises");
        System.out.println("Liste des livres ");
        for(int i=0;i<bd.livres.size();i++) {
			System.out.println("Nom : " + bd.livres.get(i).getName() );	
			}
        System.out.println("Liste des chaises ");
        for(int i=0;i<bd.chaises.size();i++) {
			System.out.println("Nom : " + bd.chaises.get(i).getName() );	
			}
        
    }

    @Override
    public void ajouterNouveauMateriel(Materiel materiel) {
        
     //si c'est un livre
        System.out.println(materiel.getType());

        if (materiel.getType() ==1) {
        	
            bd.livres.add((Livre) materiel);
           System.out.println("L'ajout du matériel " + materiel.getName() + " effectué avec succès !");
        } else if (materiel.getType()==2) {
     //si c'est une chaise
           bd.chaises.add((Chaise) materiel);
           System.out.println("L'ajout du matériel " + materiel.getName() + " effectué avec succès !");
        }
        else {
            System.out.println("Entrez un des numéros demandés");

        }
       
    }
    @Override
    public void supprimerMateriel(String nom,int type) {
    	if(type == 1) {
    		for(int i=0;i<bd.livres.size();i++) {
    			if( bd.livres.get(i).getName().equals(nom) ) {
    				bd.livres.remove(i);
    			}
    		}
    	}else if(type ==2){
    		for(int i=0;i<bd.chaises.size();i++) {
    			if( bd.chaises.get(i).getName().equals(nom) ) {
    				bd.chaises.remove(i);
    			}
    		}
    	}
        System.out.println("Le materiel " + nom + " supprimé avec succès !");

    }

	@Override
	public void modifierMateriel(String nom,String nvNom, int type) {
		// TODO Auto-generated method stub
		if(type == 1) {
    		for(int i=0;i<bd.livres.size();i++) {
    			if( bd.livres.get(i).getName().equals(nom) ) {
    				bd.livres.get(i).setName(nvNom);
    			}
    		}
    	}else if(type ==2){
    		for(int i=0;i<bd.chaises.size();i++) {
    			if( bd.chaises.get(i).getName().equals(nom) ) {
    				bd.chaises.get(i).setName(nvNom);
    			}
    		}
    	}
        System.out.println("Le materiel " + nom + " modifié avec succès !");

	}

	@Override
	public boolean rechercherMateriel(String nom, int type) {
		// TODO Auto-generated method stub
		boolean tr = false;
		if(type == 1) {
    		for(int i=0;i<bd.livres.size();i++) {
    			if( bd.livres.get(i).getName().equals(nom) ) {
    				tr= true;

    			}
    		}
    	}else if(type ==2){
    		for(int i=0;i<bd.chaises.size();i++) {
    			if( bd.chaises.get(i).getName().equals(nom) ) {
    				tr=true;
    				
    			}
    		}
    	}
		if(tr) {
			System.out.println("Materiel trouvé avec succées");
			

		}else {System.out.println("Materiel non trouvé");
		
}
		return tr;
	}

	@Override
	public void allouerMateriel(String nom, int type) {
		// TODO Auto-generated method stub
		boolean tr = false;

		if(type == 1) {
    		for(int i=0;i<bd.livres.size();i++) {
    			if( bd.livres.get(i).getName().equals(nom) ) {
    				supprimerMateriel(nom,1);
    				tr=true;

    			}
    		}
    	}else if(type ==2){
    		for(int i=0;i<bd.chaises.size();i++) {
    			if( bd.chaises.get(i).getName().equals(nom) ) {
    				supprimerMateriel(nom,2);
    				tr=true;    			
    			}
    		}
    	}
		if(tr) {
			System.out.println("Materiel alouée avec succées");


		}else {System.out.println("Materiel non trouvé");
		
	}
	}

	@Override
	public int listeSize(int type) {
		// TODO Auto-generated method stub
		if(type==1)return bd.livres.size();
		else if(type==2)return bd.chaises.size();
		return 0;
		
	}
	
	}
