package com.ensa.gi4.service.api;

import com.ensa.gi4.modele.Materiel;

public interface GestionMaterielService {
    void init();
    void listerMateriel();
    void ajouterNouveauMateriel(Materiel materiel);
    void supprimerMateriel(String nom,int type) ;
    void modifierMateriel(String nom,String nouveauNom,int type);
    boolean rechercherMateriel(String nom,int type);
    void allouerMateriel(String nom,int type);
    int listeSize(int type);

}
