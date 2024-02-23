import java.util.ArrayList;
import java.util.List;

public class Boutique {

	 private List<Produit> produits;

	    public Boutique() {
	        this.produits = new ArrayList<>();
	    }

	    // Ajouter un produit à la boutique
	    public void addProduit(Produit produit) {
	        produits.add(produit);
	    }

	    // Obtenir la liste des produits de la boutique
	    public List<Produit> getProduits() {
	        return produits;
	    }
	    
	    // Méthode pour afficher le stock de la boutique
	    public void afficherStock() {
	        System.out.println("Stock disponible dans la boutique :");
	        System.out.println("  ");
	        for (Produit produit : produits) {
	        	System.out.println("  ");
	            produit.afficher();
	        }
	    }
}
