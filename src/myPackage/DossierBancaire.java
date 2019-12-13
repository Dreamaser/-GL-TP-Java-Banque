package myPackage;

public class DossierBancaire
{
	private CompteCourant cpCourant;// d�claration objet compte courant
	private CompteEpargne cpEpargne;//d�claration objet compte �pargne
	
	//Constructeur
    public DossierBancaire()
    {
    	cpCourant = new CompteCourant();//affecte une valeur a compte courant
    	cpEpargne = new CompteEpargne();//affecte une valeur a compte �pargne
    }

    public void deposer(double value)//traite le d�pot d'argent
    {
    	double val_epargne = value * 0.6;//donne 60 % de la valeur d�poser 
    	
    	cpEpargne.addMoney(val_epargne);//60% pour le compte �pargne
    	cpCourant.addMoney(value - val_epargne);//les 40% restant vont sur le compte courant 
	}
    public double get_solde() { return cpCourant.getSolde() + cpEpargne.getSolde(); }
    //renvoie le solde du compte courant et le solde du compte �pargne
    public void remunerer() { cpEpargne.remunererSolde(3.2); }
    //ajoute les 3.2% d'int�ret li�es au compte �pargne
}
