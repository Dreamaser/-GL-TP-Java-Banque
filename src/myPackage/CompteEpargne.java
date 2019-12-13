package myPackage;

public class CompteEpargne extends CompteCourant
{
	public void remunererSolde(double pourcentage)
	{ addMoney((pourcentage/100) * getSolde()); }
}
