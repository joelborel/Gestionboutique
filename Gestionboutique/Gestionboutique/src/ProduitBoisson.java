
public class ProduitBoisson extends Produit {
    private int quantite; // Quantité en centilitres
    
    public ProduitBoisson(String nom, String description, int quantite,int prix) {
        super(nom, description,prix);
        this.quantite = quantite;
    }
    
    // Getters et setters
    
    // Méthode pour afficher les informations du produit boisson
    @Override
    public void afficher() {
        super.afficher();
        System.out.println("Quantité : " + quantite + " cl");
    }
}
