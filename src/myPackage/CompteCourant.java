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
	
	public double takeMoney(double m) throws Exception
	{
		if(m > solde)
			throw new Exception("Solde insuffisant");
		else
			return solde -= m;
	}
}
