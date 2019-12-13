package myPackage;

public class DossierBancaire
{
	//Constructeur
    public DossierBancaire()
    {
    	m_solde = 0;
    }

    public void deposer(double value)
    { m_solde += value; }
    
    public double get_solde()
    { return m_solde; }
    
    public void remunerer()
    { m_solde += (m_solde * 0.6) * 0.032; }
	
    private double m_solde;
}
