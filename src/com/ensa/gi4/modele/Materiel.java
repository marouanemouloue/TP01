package com.ensa.gi4.modele;

public abstract class Materiel {
    private String name;
    //type 1 pour Livres et type 2 pour les chaises
    private int type;

  
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
}
