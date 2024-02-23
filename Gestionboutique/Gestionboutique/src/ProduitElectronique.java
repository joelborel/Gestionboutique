
public class ProduitElectronique extends Produit {
	
    private int dureeGarantie; // Durée de garantie en mois
    
    public ProduitElectronique(String nom, String description, int dureeGarantie,int prix) {
       
    	super(nom, description,prix);
       
    	this.dureeGarantie = dureeGarantie;
    }
    
    // Méthode pour afficher les informations du produit électronique
    @Override
    public void afficher() {
        super.afficher();
        System.out.println("Durée de garantie : " + dureeGarantie + " mois");
    }
}