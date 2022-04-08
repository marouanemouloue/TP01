package com.ensa.gi4.service.test;

import com.ensa.gi4.modele.Chaise;
import com.ensa.gi4.modele.Livre;
import com.ensa.gi4.service.impl.GestionMaterielServiceImpl;

import junit.framework.TestCase;

public class GestionMaterielServiceTest  extends TestCase {
    //  test methods go here
	GestionMaterielServiceImpl gmsi ;
	public GestionMaterielServiceTest() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void setUp() throws Exception {
		
		gmsi = new GestionMaterielServiceImpl();
		Livre livre1 = new Livre();
		livre1.setName("livre test");
		livre1.setType(1);
		Chaise chaise1 = new Chaise();
		chaise1.setName("chaise test");
		chaise1.setType(2);
		gmsi.ajouterNouveauMateriel(livre1);
		gmsi.ajouterNouveauMateriel(chaise1);
		gmsi.supprimerMateriel("livre test", 1);
		
	}

	@Override
	protected void tearDown() throws Exception {
		// TODO Auto-generated method stub
		super.tearDown();
	}

	public void testGestionMateriel() {
		boolean test =gmsi.rechercherMateriel("chaise test", 2);
		assertEquals(gmsi.listeSize(1),2);

		assertEquals(gmsi.listeSize(2),3);
		assertTrue(test);

	}
}
