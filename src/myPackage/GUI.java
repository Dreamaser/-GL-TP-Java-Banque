package myPackage;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPopupMenu;
import javax.swing.JTextField;
import javax.swing.JButton;


public class GUI  implements ActionListener 
{

	private DossierBancaire m_dossier;
	private JTextField m_saisie_depot;
	private JTextField m_display_solde;
	private JButton m_remunerer;
	private JLabel lblRetrait;
	private JTextField m_saisie_retrait;
	// Constructeur
    public GUI(DossierBancaire d)
    {
    	//Dossier
    	m_dossier 			= d;
    	
    	//Element saisie depot
        m_saisie_depot = new JTextField (20);
        m_saisie_depot.addActionListener(this);
        
        
        //Initialisation de la fenetre generale
        JFrame frame = new JFrame("Editeur dossier bancaire");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Geometrie de repartition des elements graphiques
        frame.getContentPane().setLayout(new GridLayout(4,2)); //3 lignes and 2 columns
        //First line
        frame.getContentPane().add(new JLabel("Depot"));
        frame.getContentPane().add(m_saisie_depot);
        frame.getContentPane().add(new JLabel("Remunerer"));
        
        //Element declenchement remuneration
        m_remunerer = new JButton("OK");
        m_remunerer.addActionListener(this);
        frame.getContentPane().add(m_remunerer);        
        frame.getContentPane().add(new JLabel("Solde"));
        
                
            	//Element affichage solde
                m_display_solde = new JTextField (20);
                m_display_solde.setEditable(false); //Pour eviter d'ecrire
                m_display_solde.setText(Double.toString(m_dossier.get_solde()));
                frame.getContentPane().add(m_display_solde);
        
        lblRetrait = new JLabel("Retrait");
        frame.getContentPane().add(lblRetrait);
        
        m_saisie_retrait = new JTextField();
        m_saisie_retrait.addActionListener(this);
        frame.getContentPane().add(m_saisie_retrait);
        m_saisie_retrait.setColumns(10);
        frame.pack(); //Causes this Window to be sized to fit the preferred size and layouts of its subcomponents.
        frame.setVisible(true); //Shows this Window
        
    }
    // Callbacks for buttons: dispatch processings
    public void actionPerformed(ActionEvent e)
    {
    	if( e.getSource() == m_saisie_depot )
    	{
    		float depot_value=Float.parseFloat(m_saisie_depot.getText());
    		m_dossier.deposer(depot_value);
    		m_saisie_depot.setText("");
    	}
    	else if( e.getSource() == m_remunerer )
    	{
    		m_dossier.remunerer();
    	}
    	else if(e.getSource() == m_saisie_retrait)
    	{
    		try
    		{
        		float retrait_value = Float.parseFloat(m_saisie_retrait.getText());
        		m_dossier.retirer(retrait_value);
        		m_saisie_retrait.setText("");
    		}
    		catch(Exception ex)
    		{
    			System.out.println(ex.getMessage()); // Message d'erreur affiché en console
    		}
    	}
    	
    	m_display_solde.setText(Double.toString(m_dossier.get_solde()));  	
    }
}
