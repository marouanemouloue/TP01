package com.ensa.gi4.controller;

import com.ensa.gi4.modele.Chaise;
import com.ensa.gi4.modele.Livre;
import com.ensa.gi4.service.api.GestionMaterielService;

import java.util.Scanner;

public class GestionMaterielController {

    private GestionMaterielService gestionMaterielService;

    public void listerMateriel() {
        gestionMaterielService.listerMateriel();
    }

    public void afficherMenu() {
        System.out.println("1- pour lister le matériel, entrer 1");
        System.out.println("2- pour ajouter un nouveau matériel, entrer 2");
        System.out.println("3- pour supprimer un matériel, entrer 3");
        System.out.println("4- pour modifier un matériel, entrer 4");
        System.out.println("5- pour chercher un matériel, entrer 5");
        System.out.println("6- pour allouer un matériel, entrer 6");
        System.out.println("0- pour sortir de l'application, entrer 0");
        Scanner scanner = new Scanner(System.in);
        String next = scanner.next();
        if ("0".equals(next)) {
            sortirDeLApplication();
        } else if ("1".equals(next)) {
        	//Lister les materiaux
            listerMateriel();
        } else if ("2".equals(next)) {
            // ajouter nouveau matériel
        		System.out.println("Pour ajouter un livre, entrer 1");
        		System.out.println("Pour ajouter une chaise , entrer 2");
        		String type = scanner.next();
        		System.out.println("Entrez son nom");
        		String nom = scanner.next();
        		//verifier si c'est un livre ou une chaise
        		if ("1".equals(type)) {
        			Livre l = new Livre();
        			l.setType(1);
        			l.setName(nom);
        			gestionMaterielService.ajouterNouveauMateriel(l);
        		}else if ("2".equals(type)) {
        			Chaise c = new Chaise();
        			c.setType(2);
        			c.setName(nom);
        			gestionMaterielService.ajouterNouveauMateriel(c);
        		}else {System.out.println("Type inéxistant");}
            
            }else if("3".equals(next)) {
            	System.out.println("Si vous souhaitez supprimer un livre, ecrivez 1 ");
            	System.out.println("Si vous souhaitez supprimer une chaise, ecrivez 2 ");
                 String type = scanner.next();
                 System.out.println("Entrez son nom");
                 String nom = scanner.next();
                 if("1".equals(type)) {
                	 gestionMaterielService.supprimerMateriel(nom, 1);
                 }else if("2".equals(type)) {
                	 gestionMaterielService.supprimerMateriel(nom, 2);

                 }else {System.out.println("Type inéxistant");}
                 
                 
            }else if("4".equals(next)) {
            	System.out.println("Si vous souhaitez modifier un livre, ecrivez 1 ");
            	System.out.println("Si vous souhaitez modifier une chaise, ecrivez 2 ");
                 String nxt = scanner.next();
                 System.out.println("Entrez son nom");
                 String nom = scanner.next();
                 System.out.println("Entrez son nouveau nom");
                 String nvNom = scanner.next();

                 if("1".equals(nxt)) {
                	 gestionMaterielService.modifierMateriel(nom,nvNom, 1);
                 }else if("2".equals(nxt)) {
                	 gestionMaterielService.modifierMateriel(nom,nvNom, 2);

                 }else {System.out.println("Type inéxistant");}
            }else if("5".equals(next)) {
            	System.out.println("Si vous souhaitez cherchez un livre, ecrivez 1 ");
            	System.out.println("Si vous souhaitez cherchez une chaise, ecrivez 2 ");
                 String type = scanner.next();
                 System.out.println("Entrez son nom");
                 String nom = scanner.next();
                 if("1".equals(type)) {
                	 gestionMaterielService.rechercherMateriel(nom, 1);
                 }else if("2".equals(type)) {
                	 gestionMaterielService.rechercherMateriel(nom, 2);

                 }else {System.out.println("Type inéxistant");}
                 
            }else if("6".equals(next)) {
            	System.out.println("Si vous souhaitez allouez un livre, ecrivez 1 ");
            	System.out.println("Si vous souhaitez allouez une chaise, ecrivez 2 ");
                 String type = scanner.next();
                 System.out.println("Entrez son nom");
                 String nom = scanner.next();
                 if("1".equals(type)) {
                	 gestionMaterielService.allouerMateriel(nom, 1);
                 }else if("2".equals(type)) {
                	 gestionMaterielService.allouerMateriel(nom, 2);

                 }else {System.out.println("Type inéxistant");}
            }
        

            else {
                System.out.println("Entrez un des numéros demandés");

            }

        } 
    

    private void sortirDeLApplication() {
        System.exit(0);
    }

    public void setGestionMaterielService(GestionMaterielService gestionMaterielService) {
        // injection par accesseur
        this.gestionMaterielService = gestionMaterielService;
    }
}
