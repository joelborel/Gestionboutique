import java.time.LocalDate;

public class ProduitAlimentaire extends Produit {
    private LocalDate dateExpiration; // Date d'expiration
    
    public ProduitAlimentaire(String nom, String description, LocalDate dateExpiration,int prix) {
        super(nom, description,prix);
        this.dateExpiration = dateExpiration;
    }
    // Méthode pour afficher les informations du produit alimentaire
    @Override
    public void afficher() {
        super.afficher();
        System.out.println("Date d'expiration : " + dateExpiration);
    }
    
    // Getters et setters
}
