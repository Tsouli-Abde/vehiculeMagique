
package com.vehiculemagique;

/**
 * Représente un véhicule simple pouvant rouler et être associé à un propriétaire.
 */
public class Vehicule {
    private Proprietaire proprietaire;

    private String immatriculation;
    private int kilometrage;
    
    /**
     * Constructeur d'objets de classe Vehicule
     */
    public Vehicule(String immatriculation) {
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
    
    public void rouler(int kilometrage) {
        if (kilometrage < 0) {
            throw new IllegalArgumentException("km doit être >= 0");
        }
        this.kilometrage += kilometrage;
    }

}
