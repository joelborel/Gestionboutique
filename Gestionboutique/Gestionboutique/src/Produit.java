
public class Produit {
	
	
	private String nom;
    private String description;
    
    private int prix;

    public Produit(String nom, String description, int prix) {
        this.nom = nom;
        this.description = description;
        this.prix = prix;
    }
    
    // Getteur pour l'attribut 'nom'
    public String getNom() {
        return nom;
    }
    
    // Setteur pour l'attribut 'nom'
    public void setNom(String nom) {
        this.nom = nom;
    }
    
    // Getteur pour l'attribut 'description'
    public String getDescription() {
        return description;
    }
    
    // Setteur pour l'attribut 'description'
    public void setDescription(String description) {
        this.description = description;
    }
    
    public int getPrix() {
        return prix;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }
    
    // Méthode pour afficher les informations du produit
    public void afficher() {
        System.out.print("Nom du produit : " + nom);
        System.out.print("                            ");
        System.out.println("Description du produit :       " + description);
    }
    
   
    
    



}
