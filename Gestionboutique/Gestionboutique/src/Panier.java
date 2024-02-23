import java.util.ArrayList;
import java.util.List;

public class Panier {

	 private List<Produit> produits;

	    public Panier() {
	        this.produits = new ArrayList<>();
	    }

	    public void ajouterProduit(Produit produit) {
	        produits.add(produit);
	    }

	    public List<Produit> getProduits() {
	        return produits;
	    }
	    
	    // Méthode pour calculer le prix total du panier
	    public int prixTotalPanier() {
	        int prixTotal = 0;
	        for (Produit produit : produits) {
	            prixTotal += produit.getPrix();
	        }
	        return prixTotal;
	    }
}
