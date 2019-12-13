package myPackage;

public class CompteCourant
{
	private double solde;
	
	public CompteCourant()
	{ solde = 0; }
	
	public double getSolde()
	{ return solde; }
	
	public void addMoney(double m)
	{ solde += m; }
}
