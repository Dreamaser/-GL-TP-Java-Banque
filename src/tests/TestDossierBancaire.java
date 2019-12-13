package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import myPackage.DossierBancaire;

class TestDossierBancaire
{
	@Test
	void testDeposer()
	{
		DossierBancaire dossier = new DossierBancaire();
		
		dossier.deposer(100);
		assertEquals(100, dossier.get_solde());
	}

	@Test
	void testRemunerer()
	{
		DossierBancaire dossier = new DossierBancaire();

		dossier.deposer(100);
		dossier.remunerer();
		assertEquals(101.92, dossier.get_solde());
	}
}
