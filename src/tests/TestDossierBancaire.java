package tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import myPackage.DossierBancaire;

public class TestDossierBancaire
{
	@Test
	public void testDeposer()
	{
		DossierBancaire dossier = new DossierBancaire();
		
		dossier.deposer(100);
		assertEquals(100, dossier.get_solde(), 1);
	}

	@Test
	public void testRemunerer()
	{
		DossierBancaire dossier = new DossierBancaire();

		dossier.deposer(100);
		dossier.remunerer();
		assertEquals(101.92, dossier.get_solde(), 1);
	}
	
	@Test
	public void testRetirerOk()
	{
		DossierBancaire dossier = new DossierBancaire();
		
		dossier.deposer(1000);
		
		try {
			dossier.retirer(200);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		assertEquals(800, dossier.get_solde(), 1);
	}
	
	@Test(expected=Exception.class)
	public void testRetirerKo() throws Exception
	{
		DossierBancaire dossier = new DossierBancaire();
		
		dossier.deposer(1000);
		dossier.retirer(500);
	}
}
