package myPackage;
//héritage déja gérer dans la V2

public class DossierBancaire
{
  
  private CompteCourant cpCourant;// déclaration objet compte courant
	private CompteEpargne cpEpargne;//déclaration objet compte épargne
	
	//Constructeur
    public DossierBancaire()
    {    
    	cpCourant = new CompteCourant();//affecte une valeur a compte courant
    	cpEpargne = new CompteEpargne();//affecte une valeur a compte épargne
    }

    public void deposer(double value)//traite le dépot d'argent
    {
    	double val_epargne = value * 0.6;//donne 60 % de la valeur déposer 
    	
    	cpEpargne.addMoney(val_epargne);//60% pour le compte épargne
    	cpCourant.addMoney(value - val_epargne);//les 40% restant vont sur le compte courant 
	}
  
    public double get_solde() { return cpCourant.getSolde() + cpEpargne.getSolde(); }
    //renvoie le solde du compte courant et le solde du compte épargne
    public void remunerer() { cpEpargne.remunererSolde(3.2); }
    //ajoute les 3.2% d'intéret liées au compte épargne

    public void retirer(double somme) throws Exception
    {
    	try
    	{ compteCourant.takeMoney(somme); }
    	catch (Exception e)
    	{
    		throw e;
		  }
    }
}
