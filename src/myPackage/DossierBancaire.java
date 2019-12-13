package myPackage;

public class DossierBancaire
{
	private CompteCourant compteCourant;
	private CompteEpargne compteEpargne;
	
	//Constructeur
    public DossierBancaire()
    {
    	compteCourant = new CompteCourant();
    	compteEpargne = new CompteEpargne();
    }

    public void deposer(double value)
    {
    	double val_epargne = value * 0.6;
    	
    	compteEpargne.addMoney(val_epargne);
    	compteCourant.addMoney(value - val_epargne);
	}
    public double get_solde() { return compteCourant.getSolde() + compteEpargne.getSolde(); }
    public void remunerer() { compteEpargne.remunererSolde(3.2); }
    
    // Add something
}
