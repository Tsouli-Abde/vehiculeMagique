
/**
 * Décrivez votre classe Vehicule ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class VehiculeTest
{
    private Proprietaire proprietaire;

    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    private String immatriculation;
    private int kilometrage;
    
    /**
     * Constructeur d'objets de classe Vehicule
     */
    public VehiculeTest(String immatriculation)
    {
        // initialisation des variables d'instance
        this.immatriculation = immatriculation;
        this.kilometrage = 0;
        this.proprietaire = null;
    }
    
    public Proprietaire getProprietaire() {
        return proprietaire;
    }

    public void setProprietaire(Proprietaire proprietaire) {
        this.proprietaire = proprietaire;
    }
    
    public String getImmatriculation() { return immatriculation; }
    
    public int getKilometrage() { return kilometrage; }
    
    public void setImmatriculation(String immatriculation){
        this.immatriculation = immatriculation;
    }
    
    public void setKilometrage(int kilometrage){
        this.kilometrage = kilometrage;
    }
    
    public void rouler(int km) {
        if (km < 0) {
            throw new IllegalArgumentException("km doit être >= 0");
        }
        kilometrage += km;
    }

}