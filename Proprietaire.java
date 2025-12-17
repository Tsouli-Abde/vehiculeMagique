public class Proprietaire {

    private String nom;

    public Proprietaire(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }
    
     /**
     * Méthode de collaboration avec Vehicule
     * Le coût dépend du kilométrage du véhicule
     */
    public int calculerAssuranceAnnuelle(Vehicule v) {
        // Base fixe + contribution du véhicule
        return 300 + (v.getKilometrage() / 1000);
    }
}