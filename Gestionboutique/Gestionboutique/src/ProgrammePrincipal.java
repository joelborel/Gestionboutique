import java.time.LocalDate;
import java.util.List;

public class ProgrammePrincipal {
    public static void main(String[] args) {
        // ici je vais ajouter l'algorithme de mon programme:
    	//System.out.println("bonjours");
    	
    	// Création d'une instance de Boutique
        Boutique maBoutique = new Boutique();
        // Création d'une instance de Panier
        Panier panier = new Panier();
        
        // Création de quelques produits avec des prix différents
        ProduitElectronique produitElectronique = new ProduitElectronique("Ordinateur", "Un ordinateur puissant", 12, 1000);
        ProduitAlimentaire produitAlimentaire = new ProduitAlimentaire("Chocolat", "Un délicieux chocolat", LocalDate.of(2024, 12, 31), 5);
        ProduitBoisson produitBoisson = new ProduitBoisson("Soda", "Une boisson rafraîchissante", 330, 2);
        
        // Ajout des produits au panier
        panier.ajouterProduit(produitElectronique);
        panier.ajouterProduit(produitAlimentaire);
        panier.ajouterProduit(produitBoisson);
        
      
        // Ajout des produits à la boutique
        maBoutique.addProduit(produitElectronique);
        maBoutique.addProduit(produitAlimentaire);
        maBoutique.addProduit(produitBoisson);
        
        
        
        
        
        /*
        // Récupération des produits de la boutique
        List<Produit> produitsDisponibles = maBoutique.getProduits();
        
        // Affichage des noms des produits disponibles
        System.out.println("Produits disponibles dans la boutique :");
        for (Produit produit : produitsDisponibles) {
            System.out.println("Nom du produit : " + produit.getNom());
        }
        */
        
        // Appel de la méthode pour afficher le stock de la boutique
        maBoutique.afficherStock();
        System.out.println("");
        // Affichage du prix total du panier
        System.out.println("                                           Prix total du panier : "      + panier.prixTotalPanier() + " euros");
        // Affichage du prix total du panier
        System.out.println("");
    
    
        
    }
    	
    	
    }
